package com.motaharinia.msutility.entity;

import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.reflection.ReflectionTools;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 *  اینترفیس متدهای ابزاری انتیتی
 */
public interface EntityTools {


    /**
     * این متد انتیتی یا لیستی از انتیتی های دریافتی را چک میکند که null نباشد <br>
     * و طبق شرایط ورودی فعال یا غیرفعال بودن انتیتی را نیز بررسی میکند. <br>
     * در صورت وجود مشکل اکسپشن پرتاب میکند
     *
     * @param entity       آبجکت انتیتی مورد نظر جهت بررسی است
     * @param entityClass  کلاس انتیتی مورد نظر جهت بررسی است
     * @param checkInvalid آیا غیرفعال بودن آبجکت انتیتی را هم بررسی کند یا خیر
     * @throws Exception
     */
    static void checkEntity(Object entity, Class entityClass, Boolean checkInvalid) throws UtilityException, InvocationTargetException, IllegalAccessException {
        Integer id = 0;
        Boolean isInvalid = true;
        if (ObjectUtils.isEmpty(entity)) {
            //اگر انتیتی یا لیست انتیتی ورودی خالی باشد اکسپشن میدهیم
            throw new UtilityException(entityClass, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_NULL, "entity");
        }
        if (entity instanceof GenericEntity) {
            //اگر انتیتی ورودی از نوع جنریک است (برای اطمینان این موضوع را بررسی میکنیم که حتما انتیتی ورودی آی دی داشته باشد)
            if (checkInvalid) {
                //اگر نیاز به بررسی غیرفعال بودن انتیتی باشد
                isInvalid = (Boolean) ReflectionTools.getMethod(entity.getClass(), "getInvalid").invoke(entity);
                if (isInvalid) {
                    //اگر انتیتی غیرفعال بود آی دی آن را به دست می آوریم تا در توضیحات اکسپشن بیاوریم
                    try {
                        id = (Integer) ReflectionTools.getMethod(entity.getClass(), "getId").invoke(entity);
                        throw new UtilityException(entityClass, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_INVALID, "entity.id:" + id.toString());
                    } catch (Exception e) {
                        throw new UtilityException(entityClass, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_INVALID, "entity");
                    }

                }
            }
        } else if (entity instanceof List<?>) {
            Collection<Object> objectCollection = (Collection<Object>) entity;
            for (Object entityOfCollection : objectCollection) {
                if (ObjectUtils.isEmpty(entityOfCollection)) {
                    //اگر یکی از انتیتی های داخل کالکشن ورودی خالی باشد اکسپشن میدهیم
                    throw new UtilityException(entityClass, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_NULL, "entityOfCollection");
                } else {
                    if (checkInvalid) {
                        //اگر نیاز به بررسی غیرفعال بودن یکی از انتیتی های داخل کالکشن باشد
                        isInvalid = (Boolean) ReflectionTools.getMethod(entityOfCollection.getClass(), "getInvalid").invoke(entityOfCollection);
                        if (isInvalid) {
                            //اگر یکی از انتیتی های داخل کالکشن غیرفعال بود آی دی آن را به دست می آوریم تا در توضیحات اکسپشن بیاوریم
                            try {
                                id = (Integer) ReflectionTools.getMethod(entityOfCollection.getClass(), "getId").invoke(entityOfCollection);
                                throw new UtilityException(entityClass, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_INVALID, "entityOfCollection.id:" + id.toString());
                            } catch (Exception e) {
                                throw new UtilityException(entityClass, UtilityExceptionKeyEnum.CHECK_ENTITY_IS_INVALID, "entityOfCollection");
                            }
                        }
                    }
                }
            }
        }
    }
}
