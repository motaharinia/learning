package com.motaharinia.javacore.jexceptionhandling.djavanestedtry;

/**
 * https://www.javatpoint.com/nested-try-block
 * The try block within a try block is known as nested try block in java.
 * Why use nested try block:
 * Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error.
 * In such cases, exception handlers have to be nested.
 * بلوک try درون یک بلوک try به عنوان بلوک try تو در تو جاوا شناخته شده است.
 * چرا از بلاک try تو در تو استفاده می شود:
 * بعضی اوقات ممکن است شرایطی بوجود بیاید که بخشی از یک بلوک باعث ایجاد یک خطا شود و کل بلوک ممکن است خطای دیگری ایجاد کند.
 * در چنین مواردی ، نگهبانان استثناء باید nested شوند.
 */
public class NestedTryBlock {
    public Integer devidFromArray() {

        try {
            try {
                Integer b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                Integer a[] = new Integer[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            return 1;
        } catch (Exception e) {
            return 2;
        }
    }
}
