package com.motaharinia.javacore.gjavaoopsmisc.bobjectcloning;

//https://www.javatpoint.com/object-cloning
//The object cloning is a way to create exact copy of an object.
//The clone() method of Object class is used to clone an object.
//The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create.
//If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
//The clone() method is defined in the Object class.
//کلون کردن شیء راهی برای ایجاد کپی دقیق از یک شی است.
//از روش clone کلاس Object برای کلون کردن یک شی استفاده می شود.
//رابط java.lang.Cloneable باید توسط کلاسی که کلون شیء را می خواهیم ایجاد کنیم ، استفاده شود.
//اگر رابط Cloneable را پیاده سازی نکنیم ، CloneNotSupportedException ایجاد می شود.
//متد clone در کلاس Object تعریف شده است.
//
//Why use clone() method ?
//The clone() method saves the extra processing task for creating the exact copy of an object.
//If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.
//چرا از متد کلون استفاده می کنیم؟
//متد clone وظیفه پردازش اضافی را برای ایجاد نسخه دقیق یک جسم ذخیره می کند.
//اگر آن را با استفاده از کلمه کلیدی new انجام دهیم ، زمان پردازش زیادی طول خواهد کشید به همین دلیل از cloning شی استفاده می کنیم.
//
//Advantage of Object cloning:
//Although Object.clone() has some design issues but it is still a popular and easy way of copying objects.
//1.You don't need to write lengthy and repetitive codes. Just use an abstract class with a 4- or 5-line long clone() method.
//2.It is the easiest and most efficient way for copying objects, especially if we are applying it to an already developed or an old project.
//3.Just define a parent class, implement Cloneable in it, provide the definition of the clone() method and the task will be done.
//4.Clone() is the fastest way to copy array.
// مزیت cloning شی:
// اگرچه Object.clone دارای برخی از موضوعات طراحی است اما هنوز روشی محبوب و آسان برای کپی کردن اشیاء است.
//1. نیازی به نوشتن کدهای طولانی و تکراری ندارید. فقط از یک کلاس انتزاعی با یک روش کلون 4 یا 5 خطی بلند استفاده کنید.
//2. این ساده ترین و کارآمدترین روش برای کپی کردن اشیاء است ، به خصوص اگر ما آن را در یک پروژه از قبل توسعه یافته یا قدیمی استفاده می کنیم.
//3. فقط یک کلاس والدین تعریف کنید ، Cloneable را در آن پیاده کنید ، تعریف متد clone را ارائه دهید و کار انجام خواهد شد.
//4.سریعترین روش برای کپی کردن آرایه است.
//
//Disadvantage of Object cloning:
//1.To use the Object.clone() method, we have to change a lot of syntaxes to our code, like implementing a Cloneable interface, defining the clone() method and handling CloneNotSupportedException, and finally, calling Object.clone() etc.
//2.We have to implement cloneable interface while it doesn't have any methods in it. We just have to use it to tell the JVM that we can perform clone() on our object.
//3.Object.clone() is protected, so we have to provide our own clone() and indirectly call Object.clone() from it.
//4.Object.clone() doesn't invoke any constructor so we don't have any control over object construction.
//5.If you want to write a clone method in a child class then all of its superclasses should define the clone() method in them or inherit it from another parent class. Otherwise, the super.clone() chain will fail.
//6.Object.clone() supports only shallow copying but we will need to override it if we need deep cloning.
// معایب cloning شیء:
//1. برای استفاده از متد Object.clone ، ما باید نحوهای زیادی را به کد خود تغییر دهیم ، مانند پیاده سازی یک رابط Cloneable ، تعریف متد clone و مدیریت CloneNotSupportedException ، و در آخر ، فراخوانی Object.clone و غیره.
//2. ما باید رابط cloneable را پیاده سازی کنیم در حالی که هیچ متدی در آن وجود ندارد. ما فقط باید از آن استفاده کنیم تا به JVM بگوییم که می توانیم کلون را روی جسم خود انجام دهیم.
//3.دسترسی متد Object.clone از نوع protected است ، بنابراین ما باید clone خودمان را تأمین کنیم  و به طور غیر مستقیم از آن Object.clone را صدا کنیم.
//4.متد Object.clone هیچ سازنده را فراخوانی نمی کند ، بنابراین ما هیچ کنترلی در ساخت شی نداریم.
//5.در صورتی که می خواهید یک متد کلون را در کلاس کودک بنویسید ، تمام کلاسهای پدر آن باید متد کلون را در آنها تعریف کرده یا آن را از کلاس والدین دیگر به ارث ببرند. در غیر این صورت ، زنجیره super.clone شکست خواهد خورد.
//6.متد Object.clone فقط از کپی کردن کم عمق پشتیبانی می کند ، اما در صورت نیاز به کلون سازی عمیق ، باید آن را نادیده بگیریم.
public class ObjectCloningInJava implements Cloneable {
    public Integer id;
    public String name;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
//        ObjectCloningInJava objectCloningInJava = new ObjectCloningInJava();
//        objectCloningInJava.id=this.id;
//        objectCloningInJava.name=this.name;
//        return objectCloningInJava;
    }
}
