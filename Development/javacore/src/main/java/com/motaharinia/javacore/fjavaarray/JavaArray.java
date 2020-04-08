package com.motaharinia.javacore.fjavaarray;

//Normally, an array is a collection of similar type of elements which have a contiguous memory location.
//Java array is an object which contains elements of a similar data type.
//Additionally, The elements of an array are stored in a contiguous memory location.
//It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
//Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored on 1st index and so on.
// به طور معمول ، یک آرایه مجموعه ای از عناصر مشابه است که دارای یک مکان حافظه پیوسته هستند.
// آرایه جاوا یک شی است که شامل عناصر یک نوع داده مشابه است.
// علاوه بر این ، عناصر یک آرایه در یک مکان حافظه پیوسته ذخیره می شوند.
// این یک ساختار داده است که در آن عناصر مشابه را ذخیره می کنیم. ما می توانیم فقط یک مجموعه ثابت از عناصر را در یک مجموعه جاوا ذخیره کنیم.
// آرایه در جاوا مبتنی بر شاخص است ، اولین عنصر آرایه در شاخص 0 ذخیره می شود ، عنصر 2 در شاخص 1 و غیره ذخیره می شود.
//
//In Java, array is an object of a dynamically generated class.
//Java array inherits the Object class, and implements the Serializable as well as Cloneable interfaces.
//We can store primitive values or objects in an array in Java.
//Like C/C++, we can also create single dimentional or multidimentional arrays in Java.
//Moreover, Java provides the feature of anonymous arrays which is not available in C/C++.
//در جاوا ، آرایه یک شیء از کلاس ایجاد شده به صورت پویا است.
//آرایه جاوا از کلاس Object به ارث می برد و رابط های Serializable و Cloneable را نیز پیاده سازی می کند.
//ما می توانیم مقادیر اولیه یا اشیاء را در یک آرایه در جاوا ذخیره کنیم.
//مانند C / C ++ ، ما همچنین می توانیم آرایه های تک بعدی یا چند بعدی را در جاوا ایجاد کنیم.
//علاوه بر این ، جاوا ویژگی آرایه های ناشناس را که در C / C ++ در دسترس نیست نیز دارد.
//
//Advantages:
//Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
//Random access: We can get any data located at an index position.
//Disadvantages:
//Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime.
//To solve this problem, collection framework is used in Java which grows automatically.
//مزایا:
//بهینه سازی کد: باعث می شود کد بهینه شود ، می توانیم داده ها را به صورت کارآمد بازیابی یا مرتب سازی کنیم.
//دسترسی تصادفی: می توانیم هر داده ای را که در یک موقعیت شاخص قرار دارد دریافت کنیم.
//معایب:
//Limit Size: ما فقط می توان اندازه ثابت عناصر را در آرایه ذخیره کرد. اندازه آن در زمان اجرا رشد نمی کند.
//برای حل این مشکل ، از چارچوب مجموعه در جاوا استفاده می شود که بطور خودکار رشد می کند.
//
//Types of Array in java:
//Single Dimensional Array
//Multidimensional Array
//انواع Array در جاوا:
//آرایه تک بعدی
//آرایه چند بعدی
//
//ArrayIndexOutOfBoundsException:
//The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException if length of the array in negative, equal to the array size or greater than the array size while traversing the array.
//ماشین مجازی جاوا اگر در طول پیمایش آرایه طول آرایه منفی باشد ، یا برابر یا بزرگتر از سایز آرایه باشد خطایArrayIndexOutOfBoundsException را پرت میکند
//

public class JavaArray {

    //تعریف آرایه تک بعدی در جاوا با سه ستون
    Integer[] arraySingleDimentional = new Integer[3];
    //تعریف آرایه چند بعدی در جاوا با سه ستون و سه سطر
    Integer[][] arrayMultiDimentional = new Integer[3][3];

    //Declaration, Instantiation and Initialization of Java Array
    //تعریف ، نمونه سازی و مقداردهی اولیه از آرایه در جاو
    Integer arraySingleDimentionalWithData[] = {33, 3, 4, 5};
    Integer arrayMultiDimentionalWithData[][] = {{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};


    //Passing Array to a Method in Java
    //We can pass the java array to method so that we can reuse the same logic on any array.
    //انتقال Array به یک متد در جاوا
    //ما می توانیم آرایه جاوا را به متد منتقل کنیم تا در هر آرایه ای بتوانیم از همان منطق استفاده مجدد کنیم.
    //Anonymous Array in Java
    //Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.
    //آرایه ناشناس در جاوا
    //جاوا از ویژگی یک آرایه ناشناس پشتیبانی می کند ، بنابراین نیازی به اعلام آرایه در هنگام انتقال یک آرایه به متد نیست.
    public String getAnonymousArray(Integer arrayAnonymous[]) {
        String result = "";
        for (Integer item : arrayAnonymous) {
            result += item.toString();
        }
        return result;
    }


    //Jagged Array in Java:
    //If we are creating odd number of columns in a 2D array, it is known as a jagged array.
    //In other words, it is an array of arrays with different number of columns.
    // آرایه ناهموار در جاوا:
    // اگر تعداد ستونهای عجیب و غریب را در یک آرایه 2D ایجاد می کنیم ، به عنوان یک آرایه ناهموار شناخته می شود.
    // به عبارت دیگر ، این مجموعه ای از آرایه ها با تعداد ستون های مختلف است.
    //خروجی متد:
    //0 1 2
    //3 4 5 6
    //7 8
    public Integer[][] getJaggedArray() {
        Integer arrayJagged[][] = new Integer[3][];
        arrayJagged[0] = new Integer[3];
        arrayJagged[1] = new Integer[4];
        arrayJagged[2] = new Integer[2];
        //initializing a jagged array
        int count = 0;
        for (Integer i = 0; i < arrayJagged.length; i++) {
            for (Integer j = 0; j < arrayJagged[i].length; j++) {
                arrayJagged[i][j] = count++;
            }
        }
        return arrayJagged;
    }


    //What is the class name of Java array?
    //In Java, an array is an object. For array object, a proxy class is created whose name can be obtained by getClass().getName() method on the object.
    //نام کلاس آرایه جاوا چیست؟
    //در جاوا ، آرایه یک شیء است. برای شی آرایه ، یک کلاس پروکسی ایجاد می شود که نام آن را می توان با استفاده از روش getClass و getName در شیء گرفت.
    public String javaArrayGetClassName() {
        Integer arrayTest[] = {4, 4, 5};
        return arrayTest.getClass().getName();
    }
}
