package com.motaharinia.msutility.object;

import com.motaharinia.msutility.customexception.UtilityException;
import com.motaharinia.msutility.customexception.UtilityExceptionKeyEnum;
import com.motaharinia.msutility.reflection.ReflectionTools;
import org.jetbrains.annotations.NotNull;
import org.springframework.util.ObjectUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * User: https://github.com/motaharinia<br>
 * Date: 2020-06-12<br>
 * Time: 01:05:58<br>
 * Description:<br>
 * اینترفیس متدهای ابزاری اشیاء
 */
public interface ObjectTools {

    /**
     * این متد یک شی مبدا و یک شیی مقصد و یک آرایه اضافه شونده و یک آرایه حذف شونده پیشوند نام فیلد از ورودی دریافت میکند و اطلاعات شیی مبدا را روی شیی مقصد کپی میکند
     *
     * @param objectSource                            شیی مبدا
     * @param objectDestination                       شیی مقصد
     * @param objectDestinationFieldPrefixRemoveArray آرایه پیشوند نام فیلد حذف شونده از فیلدهای شیی مبدا
     * @param objectDestinationFieldPrefixAddArray    آرایه پیشوند نام فیلد اضافه شونده به فیلدهای شیی مبدا
     * @return خروجی: شیی مقصد پر شده از شیی مبدا
     */
    static Object copy(Object objectSource, Object objectDestination, @NotNull String[] objectDestinationFieldPrefixRemoveArray, @NotNull String[] objectDestinationFieldPrefixAddArray) {
        if (ObjectUtils.isEmpty(objectSource)) {
            return null;
        }
        List<Field> objectToFieldList = ReflectionTools.getAllFields(objectDestination.getClass(), new ArrayList<>());
        String objectFromGetterName;
        String objectToFieldName = "", objectFromFieldName = "";
        Object value = null;
        Field objectFromField = null;
        Class objectFromClazz = objectSource.getClass();
        for (Field objectToField : objectToFieldList) {
            objectToFieldName = objectToField.getName();
            try {
                objectFromFieldName = objectToFieldName;
                if (!ObjectUtils.isEmpty(objectDestinationFieldPrefixRemoveArray)) {
                    objectFromFieldName = removePrefixFromFieldName(objectFromFieldName, objectDestinationFieldPrefixRemoveArray);
                }
                if (!ObjectUtils.isEmpty(objectDestinationFieldPrefixAddArray)) {
                    objectFromFieldName = addPrefixToFieldName(objectFromFieldName, objectDestinationFieldPrefixAddArray);
                }
                objectFromField = ReflectionTools.getField(objectFromClazz, objectFromFieldName);
                if (objectToField.getType() == objectFromField.getType()) {
                    objectFromGetterName = ReflectionTools.getFieldGetterMethodName(objectFromField, objectFromFieldName);
                    Method objectFromGetterMethod = ReflectionTools.getMethod(objectFromClazz, objectFromGetterName);
                    objectFromGetterMethod.setAccessible(true);
                    value = objectFromGetterMethod.invoke(objectSource, null);
                    objectToField.setAccessible(true);
                    objectToField.set(objectDestination, value);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
        return objectDestination;
    }

    /**
     * این متد یک نام فیلد و یک آرایه از پیشوندها را از ورودی دریافت میکند و رشته های داخل آرایه پیشوند را از نام فیلد حذف میکند
     * @param fieldName نام فیلد
     * @param prefixArray رشته پیشوند جهت حذف از نام فیلد
     * @return خروجی: نام فیلد اصلاح شده
     */
    @NotNull
    private static String removePrefixFromFieldName(@NotNull String fieldName, @NotNull String[] prefixArray) {
        if (ObjectUtils.isEmpty(fieldName)) {
            throw new UtilityException(ObjectTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "fieldName");
        }
        if (ObjectUtils.isEmpty(prefixArray)) {
            throw new UtilityException(ObjectTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "prefixArray");
        }
        for (String prefix : prefixArray) {
            if (fieldName.startsWith(prefix)) {
                fieldName = fieldName.replaceFirst(prefix, "");
                return fieldName;
            }
        }
        return fieldName;
    }

    /**
     * این متد یک نام فیلد و یک آرایه از پیشوندها را از ورودی دریافت میکند و رشته های داخل آرایه پیشوند را به نام فیلد اضافه میکند
     * @param fieldName نام فیلد
     * @param prefixArray رشته پیشوند جهت اضافه به نام فیلد
     * @return خروجی: نام فیلد اصلاح شده
     */
    @NotNull
    private static String addPrefixToFieldName(@NotNull String fieldName, @NotNull String[] prefixArray) {
        if (ObjectUtils.isEmpty(fieldName)) {
            throw new UtilityException(ObjectTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "input");
        }
        if (ObjectUtils.isEmpty(prefixArray)) {
            throw new UtilityException(ObjectTools.class, UtilityExceptionKeyEnum.METHOD_PARAMETER_IS_NULL_OR_EMPTY, "prefixArray");
        }
        for (String prefix : prefixArray) {
            if (!fieldName.startsWith(prefix)) {
                fieldName = prefix + fieldName;
                return fieldName;
            }
        }
        return fieldName;
    }
}
