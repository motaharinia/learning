package com.motaharinia.javacore.qjavareflection.cjavaptool;

/**
 * https://www.javatpoint.com/understanding-javap-tool
 * The javap command disassembles a class file.
 * The javap command displays information about the fields,constructors and methods present in a class file.
 * دستور javap یک فایل کلاس را disassemble می کند.
 * دستور javap اطلاعات مربوط به فیلد ها ، سازنده ها و متد های موجود در یک فایل کلاس را نشان می دهد.
 *
 * Syntax to use javap tool:
 * javap fully_class_name
 * Example:
 * javap java.lang.Object
 * Result:
 * Compiled from "Object.java"
 * public class java.lang.Object {
 * public java.lang.Object();
 * public final native java.lang.Class<?> getClass();
 * public native int hashCode();
 * public boolean equals(java.lang.Object);
 * protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException;
 * public java.lang.String toString();
 * public final native void notify();
 * public final native void notifyAll();
 * public final native void wait(long) throws java.lang.InterruptedException;
 * public final void wait(long, int) throws java.lang.InterruptedException;
 * public final void wait() throws java.lang.InterruptedException;
 * protected void finalize() throws java.lang.Throwable;
 * static {};
 * }
 *
 * Example for this class:
 * javap JavapTool
 * Result:
 * Compiled from ".java"
 * class JavapTool {
 * JavapTool();
 * public static void main(java.lang.String[]);
 * }
 *
 * javap -c command:
 * You can use the javap -c command to see disassembled code. The code that reflects the java bytecode.
 * برای دیدن کد غیراسمبل شده می توانید از دستور javap -c استفاده کنید. کدی که منعکس کننده بایت کد جاوا است.
 *
 * Example for this class:
 * javap -c JavapTool
 * Result:
 * Compiled from ".java"
 * class JavapTool {
 * JavapTool();
 * Code:
 * 0: aload_0
 * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
 * 4: return
 *
 * public static void main(java.lang.String[]);
 * Code:
 * 0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
 * 3: ldc           #3                  // String hello java
 * 5: invokevirtual #4                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
 * 8: return
 * }
 *
 *
 * Options of javap tool:
 * -help:
 * prints the help message.
 * -l:
 * prints line number and local variable
 * -c:
 * disassembles the code
 * -s:
 * prints internal type signature
 * -sysinfo:
 * shows system info (path, size, date, MD5 hash)
 * -constants:
 * shows static final constants
 * -version:
 * shows version information
 * گزینه های ابزار javap:
 * -help:
 * پیام راهنما را چاپ می کند.
 * -l:
 * شماره خط و متغیر محلی را چاپ می کند
 * -c:
 * کد را جدا می کند
 * -s:
 * امضای نوع داخلی را چاپ می کند
 * -sysinfo:
 * اطلاعات سیستم (مسیر ، اندازه ، تاریخ ، هش MD5) را نشان می دهد
 * -constants:
 * ثابتهای static را نشان می دهد
 * -version:
 * اطلاعات نسخه را نشان می دهد
 */
public class JavapTool {
    public static void main(String args[]) {
        System.out.println("hello java");
    }
}
