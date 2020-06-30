package com.motaharinia.business.service.etcitem;


import com.motaharinia.msutility.customexception.BusinessException;
import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.entity.EntityTools;
import com.motaharinia.persistence.orm.adminuser.AdminUser;
import com.motaharinia.persistence.orm.etcitem.EtcItem;
import com.motaharinia.persistence.orm.etcitem.EtcItemRepository;
import com.motaharinia.presentation.adminuser.AdminUserModel;
import org.jetbrains.annotations.NotNull;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

//https://www.baeldung.com/spring-data-jpa-projections
//https://walczak.it/blog/spring-data-jpa-projection-dynamic-queries


/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * کلاس پیاده سازی اینترفیس مدیریت مقادیر ثابت
 */
@Service
@Transactional(rollbackFor=Exception.class)
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
    public @NotNull EtcItem findByIdAndCheckEntity(@NotNull Integer id, @NotNull Class etcItemEnumClass, String checkTypeTag, @NotNull Boolean checkInvalid) throws UtilityException, InvocationTargetException, IllegalAccessException, BusinessException {
        if (ObjectUtils.isEmpty(id)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "id");
        }
        if (ObjectUtils.isEmpty(etcItemEnumClass)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "etcItemEnumClass");
        }
        if (ObjectUtils.isEmpty(checkInvalid)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "checkInvalid");
        }
        EtcItem etcItem = etcItemRepository.findById(id).get();
        EntityTools.checkEntity(etcItem, EtcItem.class, checkInvalid);

        //تطبیق مقدار نوع ثابت جستجو شده با نوع کلاس ورودی
        String type = etcItemEnumClass.getSimpleName().replace("Enum", "");
        type = type.substring(0, 1).toLowerCase() + type.substring(1);
        if (!type.equalsIgnoreCase(etcItem.getType())) {
            throw new BusinessException(getClass(), EtcItemBusinessExceptionKeyEnum.ETC_ITEM_TYPE_NOT_MATCH, type + "!=" + etcItem.getType());
        }
        if ((!ObjectUtils.isEmpty(checkTypeTag)) && (!etcItem.getTypeTag().contains(checkTypeTag))) {
            throw new BusinessException(getClass(), EtcItemBusinessExceptionKeyEnum.ETC_ITEM_TYPETAG_NOT_MATCH, etcItem.getTypeTag() + " not contains " + checkTypeTag);
        }
        return etcItem;
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
    public @NotNull EtcItem findByValueAndCheckEntity(@NotNull EtcItemEnum checkEtcItemEnum, String checkTypeTag, @NotNull Boolean checkInvalid) throws IllegalAccessException, UtilityException, InvocationTargetException {
        if (ObjectUtils.isEmpty(checkEtcItemEnum)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "checkEtcItemEnum");
        }
        if (ObjectUtils.isEmpty(checkInvalid)) {
            throw new UtilityException(getClass(), UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "checkInvalid");
        }
        EtcItem etcItem = null;
        if (ObjectUtils.isEmpty(checkTypeTag)) {
            etcItem = etcItemRepository.findByValueAndType(checkEtcItemEnum.getValue(), checkEtcItemEnum.getType());
        } else {
            etcItem = etcItemRepository.findByValueAndTypeAndTypeTag(checkEtcItemEnum.getValue(), checkEtcItemEnum.getType(), checkTypeTag);
        }
        EntityTools.checkEntity(etcItem, EtcItem.class, checkInvalid);
        return etcItem;
    }

    /**
     * این متد typeTag دلخواه را دریافت میکند و تمام مقادیر ثابت مربوط به آن typeTag را خروجی میدهد
     *
     * @param typeTag تگ مقدار ثابت برای جستجوی گروهی فیلتر کردن در کامبوها استفاده میشود
     * @return خروجی: لیستی از مقادیر ثابت
     */
    @Override
    public @NotNull List<EtcItem> findByTypeTag(String typeTag) {
        if (ObjectUtils.isEmpty(typeTag)) {
            return new ArrayList<>();
        } else {
            return etcItemRepository.findAllByTypeTag(typeTag);
        }
    }

    @NotNull
    private AdminUserModel convertToDto(@NotNull AdminUser adminUser) {
        AdminUserModel adminUserModel = modelMapper.map(adminUser, AdminUserModel.class);
//        userModel.setSubmissionDate(adminuser.getSubmissionDate(), userService.getCurrentUser().getPreference().getTimezone());
        return adminUserModel;
    }

}
