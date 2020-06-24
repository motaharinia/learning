package com.motaharinia.business.service.etcitem;


import com.motaharinia.persistence.orm.adminuser.AdminUser;
import com.motaharinia.persistence.orm.adminuserskill.AdminUserSkill;
import com.motaharinia.persistence.orm.adminuserskill.AdminUserSkillRepository;
import com.motaharinia.persistence.orm.etcitem.EtcItem;
import com.motaharinia.persistence.orm.etcitem.EtcItemRepository;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import com.motaharinia.presentation.adminuserskill.AdminUserSkillModel;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//https://www.baeldung.com/spring-data-jpa-projections
//https://walczak.it/blog/spring-data-jpa-projection-dynamic-queries


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *   کلاس پیاده سازی اینترفیس مدیریت مقادیر ثابت
 */
@Service
@Transactional
public class EtcItemServiceImpl implements EtcItemService {


    /**
     * ریپازیتوری مقدار ثابت
     */
    private EtcItemRepository etcItemRepository;

    /**
     * تبدیل کننده مدل
     */
    private ModelMapper modelMapper;


    /**
     * متد سازنده پیش فرض
     */
    public EtcItemServiceImpl() {
    }

    /**
     * متد سازنده
     */
    @Autowired
    public EtcItemServiceImpl(EtcItemRepository etcItemRepository, ModelMapper modelMapper) {
        this.etcItemRepository = etcItemRepository;
        this.modelMapper = modelMapper;
    }






    /**
     * این متد یک مقدار ثابت را با استفاده از شناسه آن جستجو میکند و چک میکند آن مقدار ثابت غیرفعال نباشد
     *
     * @param id               شناسه مقدار ثابت
     * @param etcItemEnumClass کلاس مقدارثابت
     * @param checkTypeTag     تگ مقدار ثابت برای جستجوی گروهی فیلتر کردن در کامبوها استفاده میشود
     * @param checkInvalid     آیا بررسی کند که غیرفعال نباشد؟
     * @return خروجی: مقدار ثابت
     */
    @Override
    public @NotNull EtcItem findByIdAndCheckEntity(@NotNull Integer id, @NotNull Class etcItemEnumClass, String checkTypeTag, @NotNull Boolean checkInvalid) {
        return null;
    }

    /**
     * این متد یک مقدار ثابت را با استفاده از مقدار آن جستجو میکند و چک میکند آن مقدار ثابت غیرفعال نباشد
     *
     * @param checkEtcItemEnum مقدار ثابت که حاوی مقدار برای جستجو است
     * @param checkTypeTag     تگ مقدار ثابت برای جستجوی گروهی فیلتر کردن در کامبوها استفاده میشود
     * @param checkInvalid     آیا بررسی کند که غیرفعال نباشد؟
     * @return خروجی: مقدار ثابت
     */
    @Override
    public @NotNull EtcItem findByValueAndCheckEntity(@NotNull EtcItemEnum checkEtcItemEnum, String checkTypeTag, @NotNull Boolean checkInvalid) {
        return null;
    }

    /**
     * این متد typeTag دلخواه را دریافت میکند و تمام مقادیر ثابت مربوط به آن typeTag را خروجی میدهد
     *
     * @param typeTag تگ مقدار ثابت برای جستجوی گروهی فیلتر کردن در کامبوها استفاده میشود
     * @return خروجی: لیستی از مقادیر ثابت
     */
    @Override
    public @NotNull List<EtcItem> findByTypeTag(@NotNull String typeTag) {
        return null;
    }

    @NotNull
    private AdminUserModel convertToDto(@NotNull AdminUser adminUser) {
        AdminUserModel adminUserModel = modelMapper.map(adminUser, AdminUserModel.class);
//        userModel.setSubmissionDate(adminuser.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return adminUserModel;
    }

}
