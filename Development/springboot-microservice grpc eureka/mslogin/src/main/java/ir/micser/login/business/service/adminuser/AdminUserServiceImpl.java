package ir.micser.login.business.service.adminuser;



import com.motaharinia.msutility.calendar.CalendarTools;
import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customfield.CustomDate;
import com.motaharinia.msutility.search.data.SearchDataModel;
import com.motaharinia.msutility.search.filter.SearchFilterModel;
import ir.micser.geo.business.service.city.stub.CityGrpc;
import ir.micser.geo.business.service.city.stub.CityMicro;
import ir.micser.login.business.service.adminuserskill.AdminUserSkillService;
import ir.micser.login.business.service.authentication.PasswordEncoderGenerator;
import ir.micser.login.business.service.etcitem.EtcItemService;
import ir.micser.login.business.service.etcitem.GenderEnum;
import ir.micser.login.persistence.orm.adminuser.AdminUser;
import ir.micser.login.persistence.orm.adminuser.AdminUserRepository;
import ir.micser.login.persistence.orm.adminuser.AdminUserSpecification;
import ir.micser.login.persistence.orm.adminusercontact.AdminUserContact;
import ir.micser.login.persistence.orm.adminusercontact.AdminUserContactRepository;
import ir.micser.login.presentation.adminuser.AdminUserModel;
import ir.micser.login.presentation.adminuserskill.AdminUserSkillModel;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;



/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * کلاس پیاده سازی اینترفیس مدیریت ادمین ها
 */
@Service
@Transactional(rollbackFor=Exception.class)
public class AdminUserServiceImpl implements AdminUserService {


    /**
     * ریپازیتوری ادمین
     */
    private AdminUserRepository adminUserRepository;
    /**
     * ریپازیتوری اطلاعات تماس ادمین
     */
    private AdminUserContactRepository adminUserContactRepository;

    /**
     * سرویس مهارتها
     */
    private AdminUserSkillService adminUserSkillService;

    /**
     * سرویس مقادیر ثابت
     */
    private EtcItemService etcItemService;

    /**
     * مشخصات جستجوی ادمین
     */
    private AdminUserSpecification adminUserSpecification;
    /**
     * تبدیل کننده مدل
     */
    private ModelMapper modelMapper;

    @GrpcClient("grpcClientCity")
    private CityGrpc.CityBlockingStub cityStub;

    /**
     * متد سازنده پیش فرض
     */
    public AdminUserServiceImpl() {
    }

    /**
     * متد سازنده
     */
    @Autowired
    public AdminUserServiceImpl(AdminUserRepository adminUserRepository, AdminUserContactRepository adminUserContactRepository, AdminUserSkillService adminUserSkillService,EtcItemService etcItemService, AdminUserSpecification adminUserSpecification, ModelMapper modelMapper) {
        this.adminUserRepository = adminUserRepository;
        this.adminUserContactRepository = adminUserContactRepository;
        this.adminUserSkillService = adminUserSkillService;
        this.etcItemService=etcItemService;
        this.adminUserSpecification = adminUserSpecification;
        this.modelMapper = modelMapper;
    }

    /**
     * متد ثبت
     *
     * @param adminUserModel مدل ثبت
     * @return خروجی: مدل ثبت حاوی شناسه
     */
    @Override
    @NotNull
    public AdminUserModel create(@NotNull AdminUserModel adminUserModel) throws UtilityException, IllegalAccessException, BusinessException, InvocationTargetException {

        //بررسی شناسه شهر
        CityMicro.ReadOneRequestModel cityReadOneRequest =  CityMicro.ReadOneRequestModel.newBuilder().setId(adminUserModel.getDefaultAdminUserContact_city_id()).build();
        final CityMicro.ReadOneResponseModel cityReadOneResponse= this.cityStub.grpcReadOne(cityReadOneRequest);

        //ثبت اطلاعات تماس ادمین
        AdminUserContact adminUserContact = new AdminUserContact();
        adminUserContact.setCityId(cityReadOneResponse.getId());
        adminUserContact.setAddress(adminUserModel.getDefaultAdminUserContact_address());
        adminUserContact = adminUserContactRepository.save(adminUserContact);

        //ثبت ادمین
        AdminUser adminUser = new AdminUser();
        adminUser.setFirstName(adminUserModel.getFirstName());
        adminUser.setLastName(adminUserModel.getLastName());
        adminUser.setPassword(PasswordEncoderGenerator.generate(adminUserModel.getPassword()));
        adminUser.setUsername(adminUserModel.getUsername());
        adminUser.setDateOfBirth(CalendarTools.getDateFromCustomDate(adminUserModel.getDateOfBirth()));
        adminUser.setGender(etcItemService.findByIdAndCheckEntity(adminUserModel.getGender_id(), GenderEnum.class,null,true));
        //ثبت مهارتهای ادمین
        adminUser = adminUserSkillService.createByAdminUser(adminUser, adminUserModel.getSkillList());

        adminUser = adminUserRepository.save(adminUser);
        adminUser.setDefaultAdminUserContact(adminUserContact);
        adminUserModel.setId(adminUser.getId());
        return adminUserModel;
    }

    /**
     * متد جستجوی با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل جستجو شده
     */
    @Override
    @NotNull
    public AdminUserModel readById(@NotNull Integer id) throws UtilityException {
        AdminUser adminUser = adminUserRepository.findById(id).get();
        AdminUserModel adminUserModel = new AdminUserModel();
        adminUserModel.setId(adminUser.getId());
        adminUserModel.setUsername(adminUser.getUsername());
        adminUserModel.setFirstName(adminUser.getFirstName());
        adminUserModel.setLastName(adminUser.getLastName());
        adminUserModel.setPassword(adminUser.getPassword());
        adminUserModel.setDateOfBirth(new CustomDate(adminUser.getDateOfBirth()));
        if (!ObjectUtils.isEmpty(adminUser.getDefaultAdminUserContact())) {
            adminUserModel.setDefaultAdminUserContact_address(adminUser.getDefaultAdminUserContact().getAddress());
        }
        if (!ObjectUtils.isEmpty(adminUser.getSkillSet())) {
            adminUser.getSkillSet().stream().forEach(item -> {
                adminUserModel.getSkillList().add(new AdminUserSkillModel(item.getId(), item.getTitle()));
            });
        }
//    UserModel  userModel= (UserModel) SerializationUtils.clone(adminuser);
        return adminUserModel;
    }

    /**
     * متد جستجو با مدل فیلتر جستجو
     *
     * @param searchFilterModel مدل فیلتر جستجو
     * @return خروجی: مدل داده جستجو
     * @throws UtilityException
     */
    @Override
    @NotNull
    public SearchDataModel readGrid(@NotNull SearchFilterModel searchFilterModel) throws UtilityException {
//        if (!ObjectUtils.isEmpty(searchFilterModel.getRestrictionList())) {
//            searchFilterModel.getRestrictionList().stream().forEach((item) -> {
//                System.out.println("AdminUserServiceImpl.readGrid searchFilterModel.getRestrictionList() loop item.getFieldValue():" + item.getFieldValue() + " item.getFieldValue().getClass():" + item.getFieldValue().getClass());
//            });
//        }
        adminUserSpecification = (AdminUserSpecification) searchFilterModel.makeSpecification(adminUserSpecification);
//        if (!ObjectUtils.isEmpty(searchFilterModel.getRestrictionList())) {
//            searchFilterModel.getRestrictionList().stream().forEach((item) -> {
//                adminUserSpecification.add(item);
//            });
//        }


        Page<SearchRowViewAdminUserBrief> viewPage = adminUserRepository.findAll(adminUserSpecification, SearchRowViewAdminUserBrief.class, searchFilterModel.makePageable());
        SearchDataModel searchDataModel = new SearchDataModel(viewPage, searchFilterModel, "");
        return searchDataModel;
    }

    /**
     * متد ویرایش
     *
     * @param adminUserModel مدل ویرایش
     * @return خروجی: مدل ویرایش شده
     */
    @Override
    @NotNull
    public AdminUserModel update(@NotNull AdminUserModel adminUserModel) throws UtilityException, IllegalAccessException, BusinessException, InvocationTargetException {
        AdminUser adminUser = adminUserRepository.findById(adminUserModel.getId()).get();
        adminUser.setFirstName(adminUserModel.getFirstName());
        adminUser.setLastName(adminUserModel.getLastName());
        adminUser.setPassword(PasswordEncoderGenerator.generate(adminUserModel.getPassword()));
        adminUser.setUsername(adminUserModel.getUsername());
        adminUser.setDateOfBirth(CalendarTools.getDateFromCustomDate(adminUserModel.getDateOfBirth()));
        adminUser.setGender(etcItemService.findByIdAndCheckEntity(adminUserModel.getGender_id(), GenderEnum.class,null,true));
        if (ObjectUtils.isEmpty(adminUser.getDefaultAdminUserContact())) {
            AdminUserContact adminUserContact = new AdminUserContact();
            adminUserContact.setAddress(adminUserModel.getDefaultAdminUserContact_address());
            adminUserContact = adminUserContactRepository.save(adminUserContact);
            adminUser.setDefaultAdminUserContact(adminUserContact);
        } else {
            adminUser.getDefaultAdminUserContact().setAddress(adminUserModel.getDefaultAdminUserContact_address());
        }

        //ویرایش مهارتهای ادمین
        adminUser = adminUserSkillService.updateByAdminUser(adminUser, adminUserModel.getSkillList());
        adminUserRepository.save(adminUser);
        return adminUserModel;
    }

    /**
     * متد حذف با شناسه
     *
     * @param id شناسه
     * @return خروجی: مدل حذف شده
     */
    @Override
    @NotNull
    public AdminUserModel delete(@NotNull Integer id) throws UtilityException {
        AdminUserModel adminUserModel = this.readById(id);
        AdminUser adminUser = adminUserRepository.findById(adminUserModel.getId()).get();
        //حذف اطلاعات تماس ادمین
        adminUserContactRepository.deleteById(adminUser.getDefaultAdminUserContact().getId());
        //حذف مهارتهای ادمین
        adminUser = adminUserSkillService.deleteByAdminUser(adminUser);
        adminUserRepository.save(adminUser);
        adminUserRepository.delete(adminUser);
        return adminUserModel;
    }

    @NotNull
    private AdminUserModel convertToDto(@NotNull AdminUser adminUser) {
        AdminUserModel adminUserModel = modelMapper.map(adminUser, AdminUserModel.class);
//        userModel.setSubmissionDate(adminuser.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return adminUserModel;
    }
}