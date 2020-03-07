package com.motaharinia.designpattern.creational.builder;

public class User {
    //تمام فیلدها را برای اینکه immutable باشند و بعد از مقدار دهی اولیه در تابع سازنده قابل تغییر نباشند final تنظیم می کنیم
    //نام
    private final String firstName; // required
    //نام خانوادگی
    private final String lastName; // required
    //سن
    private final Integer age; // optional
    //شماره تلفن
    private final String phone; // optional
    //نشانی
    private final String address; // optional

    //متد سازنده کلاس User که از طریق کلاس UserBuilder آن ساخته میشود
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }


    //در کلاس تنها متدهای getter را قرار میدهیم تا کلاس immutable باشد. اگر setter داشته باشد به جز Builder از روش دیگر نیز مقادیر آن تغییر خواهد کرد
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    //کلاس استاتیک داخلی UserBuilder که از بیرون کلاس User نیز به دلیل استاتیک بودن در دسترس است
    public static class UserBuilder {
        //نام
        private final String firstName;
        //نام خانوادگی
        private final String lastName;
        //سن
        private Integer age;
        //شماه تماس
        private String phone;
        //نشانی
        private String address;

        /**
         * متد سازنده Builder Design Pattern
         * چون میخواهیم هر دو  فیلدهای اجباری نام و نام خانوادگی به صورت اجباری پر شوند آنها را در تابع سازنده کلاس UserBuilder می آوریم
         * یعنی بدون این دو فیلد تابع سازنده به دنیا نمی آید
         *
         * @param firstName نام
         * @param lastName  نام خانوادگی
         */
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /**
         * متد تکمیل کننده Builder Design Pattern برای فیلد سن
         *
         * @param age سن
         * @return خروجی: آبجکت سازنده تکمیل شده کاربر
         */
        public UserBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        /**
         * متد تکمیل کننده Builder Design Pattern برای فیلد تلفن
         *
         * @param phone تلفن
         * @return خروجی: آبجکت سازنده تکمیل شده کاربر
         */
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * متد تکمیل کننده Builder Design Pattern برای فیلد نشانی
         *
         * @param address تلفن
         * @return خروجی: آبجکت سازنده تکمیل شده کاربر
         */
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * این متد از سازنده کلاس کاربر استفاده میکند و طبق Builder ورودی یک آبجکت کاربر تولید و خروجی میدهد
         *
         * @return خروجی: آبجکت کاربر
         */
        public User build() {
            User user = new User(this);
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            //Do some basic validations to check
            //if user object does not break any assumption of system
        }
    }


}
