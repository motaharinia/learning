package com.motaharinia.javacore.gjavaoopsmisc.aobjectclass;

//https://www.javatpoint.com/object-class
//The Object class is the parent class of all the classes in java by default. In other words, it is the topmost class of java.
//The Object class is beneficial if you want to refer any object whose type you don't know.
// Notice that parent class reference variable can refer the child class object, know as upcasting.
// کلاس Object کلاس والدین کلیه کلاسهای جاوا به طور پیش فرض است. به عبارت دیگر ، بالاترین کلاس جاوا است.
// اگر می خواهید به هر شیئی که نوع آن را نمی شناسید مراجعه کنید ، کلاس Object سودمند است.
// توجه کنید که متغیر مرجع کلاس والدین می تواند شی کلاس کودک را که به عنوان upcasting شناخته می شود ، ارجاع دهد.
//
//Methods of Object class:
//public final Class getClass():
//returns the Class class object of this object. The Class class can further be used to get the metadata of this class.
// کلاس این شی را برمی گرداند. از کلاس Class می توان برای بدست آوردن فوق داده های این کلاس استفاده کرد.
//public int hashCode():
//returns the hashcode number for this object.
//شماره hashcode را برای این شی برمی گرداند.
//public boolean equals(Object obj):
//compares the given object to this object.
//شیء داده شده را با این شی مقایسه می کند.
//protected Object clone() throws CloneNotSupportedException:
//creates and returns the exact copy (clone) of this object.
//نسخه دقیق (کلون) این شی را ایجاد و باز می گرداند.
//public String toString():
//returns the string representation of this object.
//بازنمایی رشته این شی را برمی گرداند.
//public final void notify():
//wakes up single thread, waiting on this object's monitor.
// تک نخ را بیدار می کند و منتظر مانیتور این شی میماند.
//public final void notifyAll()	:
//wakes up all the threads, waiting on this object's monitor.
//همه نخ ها را بیدار می کند و منتظر مانیتور این شی میماند.
//public final void wait(long timeout)throws InterruptedException:
//causes the current thread to wait for the specified milliseconds, until another thread notifies (invokes notify() or notifyAll() method).
//باعث می شود تا نخ فعلی منتظر میلی ثانیه های مشخص شده باشد ، تا زمانی که نخ دیگری به آن اطلاع دهد (متدهای notify یا notifyAll را فراخوانی می کند).
//public final void wait(long timeout,int nanos)throws InterruptedException:
//causes the current thread to wait for the specified milliseconds and nanoseconds, until another thread notifies (invokes notify() or notifyAll() method).
//باعث می شود نخ فعلی منتظر میلی ثانیه و نانو ثانیه های مشخص شده باشد ، تا زمانی که نخ دیگری به آن اطلاع دهد (متدهای notify یا notifyAll را فراخوانی می کند).
//public final void wait()throws InterruptedException:
//causes the current thread to wait, until another thread notifies (invokes notify() or notifyAll() method).
//باعث می شود تا نخ فعلی منتظر بماند ، تا زمانی که نخ دیگری به آن اطلاع دهد (متدهای notify یا notifyAll را فراخوانی می کند).
//protected void finalize()throws Throwable:
//is invoked by the garbage collector before object is being garbage collected.
//قبل از جمع آوری زباله توسط جمع آوری زباله فراخوانی می شود.
public class ObjectClassInJava {
}
