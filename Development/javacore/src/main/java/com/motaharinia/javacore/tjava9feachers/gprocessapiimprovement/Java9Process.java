package com.motaharinia.javacore.tjava9feachers.gprocessapiimprovement;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.javatpoint.com/java-9-process-api-improvement
 * Java 9 Process API Improvement:
 * Java has improved its process API in Java 9 version that helps to manage and control operating system processes.
 * In earlier versions, it was complex to manage and control operating system processes by using Java programming.
 * Now, new classes and interfaces are added to perform this task.
 * بهبود پردازش API Java 9:
 * جاوا API پردازش خود را در نسخه Java 9 بهبود داده است که به مدیریت و کنترل پردازشهای سیستم عامل کمک می کند.
 * در نسخه های قبلی ، مدیریت و کنترل پردازشهای سیستم عامل با استفاده از برنامه نویسی جاوا پیچیده بود.
 * اکنون کلاس ها و رابط های جدیدی برای انجام این کار اضافه می شوند
 * <p>
 * New methods are added to the java.lang.Process class that are tabled below:
 * boolean	supportsNormalTermination():
 * It returns true if the implementation of destroy() is to normally terminate the process, else returns false.
 * ProcessHandle	toHandle():
 * It returns a ProcessHandle for the Process.
 * long	pid():
 * It returns the native process ID of the process.
 * Stream<ProcessHandle>	children():
 * It returns a snapshot of the direct children of the process.
 * Stream<ProcessHandle>	descendants():
 * It returns a snapshot of the descendants of the process.
 * ProcessHandle.Info	info():
 * It returns a snapshot of information about the process.
 * CompletableFuture<Process>	onExit():
 * It returns a CompletableFuture<Process> for the termination of the Process.
 * New interfaces ProcessHandle and ProcessHandle.Info are added.
 * متد های جدیدی به کلاس java.lang.Process اضافه شده است که در زیر آورده شده است:
 * boolean	supportsNormalTermination():
 * اگر اجرای destroy به طور معمول پردازش را خاتمه دهد true برمیگرداند، در غیر این صورت false برمیگرداند.
 * ProcessHandle	toHandle():
 * این یک ProcessHandle برای پردازش را برمی گرداند.
 * long	pid():
 * این شناسه پردازش بومی پردازش را برمی گرداند.
 * Stream<ProcessHandle>	children():
 * یک snapshot از فرزندان مستقیم این پردازش را برمی گرداند.
 * Stream<ProcessHandle>	descendants():
 * یک snapshot از فرزندان پردازش را برمی گرداند.
 * ProcessHandle.Info	info():
 * این یک snapshot فوری از اطلاعات مربوط به پردازش را برمی گرداند.
 * CompletableFuture<Process>	onExit():
 * این یک CompletableFuture را برای خاتمه پردازش برمی گرداند
 * رابط های جدید ProcessHandle و ProcessHandle.Info اضافه می شوند.
 * <p>
 * Java ProcessHandle Interface:
 * ProcessHandle helps to handle and control processes.
 * We can monitor processes, list its children, get information etc.
 * This interface contains static factory methods that return instances that are value-based, immutable and thread-safe.
 * رابط ProcessHandle جاوا:
 * رابط ProcessHandle به مدیریت و کنترل پردازشها کمک می کند.
 * ما می توانیم روند کار را کنترل کنیم ، فرزندان آن را لیست کنیم ، اطلاعاتی کسب کنیم
 * این رابط شامل متدهای کارخانه ای استاتیک می باشد كه نمونه هایی را با value-based ، تغییرناپذیر وthread-safe باز می گرداند
 * <p>
 * Java ProcessHandle Interface Signature:
 * public interface ProcessHandle extends Comparable<ProcessHandle>
 * <p>
 * This interface contains the following methods:
 * static Stream<ProcessHandle>	allProcesses():
 * It returns a snapshot of all processes visible to the current process.
 * Stream<ProcessHandle>	children():
 * It returns a snapshot of the current direct children of the process.
 * int	compareTo(ProcessHandle other):
 * It compares this ProcessHandle with the specified ProcessHandle for order.
 * static ProcessHandle	current():
 * It returns a ProcessHandle for the current process.
 * Stream<ProcessHandle>	descendants():
 * It returns a snapshot of the descendants of the process.
 * boolean	destroy():
 * It requests the process to be killed.
 * boolean	destroyForcibly():
 * It requests the process to be killed forcibly.
 * boolean	equals(Object other):
 * It returns true if other object is non-null, is of the same implementation, and represents the same system process; otherwise it It returns false.
 * int	hashCode():
 * It returns a hash code value for this ProcessHandle.
 * ProcessHandle.Info	info():
 * It returns a snapshot of information about the process.
 * boolean	isAlive():
 * It tests whether the process represented by this ProcessHandle is alive.
 * static Optional<ProcessHandle>	of(long pid):
 * It returns an Optional<ProcessHandle> for an existing native process.
 * CompletableFuture<ProcessHandle>	onExit():
 * It returns a CompletableFuture<ProcessHandle> for the termination of the process.
 * Optional<ProcessHandle>	parent():
 * It returns an Optional<ProcessHandle> for the parent process.
 * long	pid():
 * It returns the native process ID of the process.
 * boolean	supportsNormalTermination():
 * It returns true if the implementation of destroy() normally terminates the process.
 * این رابط شامل متدهای زیر است:
 * static Stream<ProcessHandle>	allProcesses():
 * این اسنپشات از کلیه پردازشهای قابل مشاهده برای روند فعلی را برمی گرداند.
 * Stream<ProcessHandle>	children():
 * این اسنپشات از فرزندان مستقیم فعلی این پردازش را برمی گرداند.
 * int	compareTo(ProcessHandle other):
 * این پردازش را با سفارش پردازنده مشخص شده برای سفارش مقایسه می کند.
 * static ProcessHandle	current():
 * این یک پردازشگر برای روند فعلی برمی گرداند.
 * Stream<ProcessHandle>	descendants():
 * تصویری از فرزندان پردازش را برمی گرداند.
 * boolean	destroy():
 * درخواست می کند که این پردازش کشته شود.
 * boolean	destroyForcibly():
 * این درخواست می کند که این پردازش به زور کشته شود.
 * boolean	equals(Object other):
 * اگر شیء دیگر غیر تهی باشد ، اجرای یکسانی دارد و همان پردازش سیستم را نشان می دهد ، این امر به حقیقت باز می گردد. در غیر این صورت غلط است.
 * int	hashCode():
 * این مقدار کد هش را برای این پردازنده پردازش برمی گرداند.
 * ProcessHandle.Info	info():
 * این یک عکس فوری از اطلاعات مربوط به پردازش را برمی گرداند.
 * boolean	isAlive():
 * این تست می کند که آیا پردازش ارائه شده توسط این ProcessHandle زنده است یا خیر.
 * static Optional<ProcessHandle>	of(long pid):
 * این یک <ProcessHandle> اختیاری را برای یک پردازش بومی موجود برمی گرداند.
 * CompletableFuture<ProcessHandle>	onExit():
 * این یک CompletableFuture <ProcessHandle> را برای خاتمه مراحل باز می گرداند.
 * Optional<ProcessHandle>	parent():
 * این یک <ProcessHandle> اختیاری برای پردازش والدین باز می گرداند.
 * long	pid():
 * این شناسه پردازش بومی پردازش را برمی گرداند.
 * boolean	supportsNormalTermination():
 * اگر پیاده سازی destroy () به طور معمول پردازش را خاتمه دهد ، این امر به حقیقت باز می گردد
 * <p>
 * Java ProcessHandle.Info Interface:
 * It is added to Java 9, and used to provide information about the process.
 * It is nested interface of ProcessHandle interface
 * رابط ProcessHandle.Info  جاوا:
 * این به Java 9 اضافه شده است و برای تهیه اطلاعات در مورد پردازش استفاده می شود.
 * این رابط nested از رابط ProcessHandle است
 * <p>
 * Java ProcessHandle.Info Interface Signature:
 * public static interface ProcessHandle.Info
 * <p>
 * Optional<String[]>	arguments():
 * It returns an array of Strings of the arguments of the process.
 * Optional<String>	command():
 * It returns the executable pathname of the process.
 * Optional<String>	commandLine():
 * It returns the command line of the process.
 * Optional<Instant>	startInstant():
 * It returns the start time of the process.
 * Optional<Duration>	totalCpuDuration():
 * It returns the total cputime accumulated of the process.
 * Optional<String>	user():
 * It returns the user of the process.
 * Optional<String[]>	arguments():
 * این مجموعه ای از رشته های استدلال های پردازش را برمی گرداند.
 * Optional<String>	command():
 * این برگه عامل اجرایی پردازش را برمی گرداند.
 * Optional<String>	commandLine():
 * این خط فرمان پردازش را برمی گرداند.
 * Optional<Instant>	startInstant():
 * زمان شروع پردازش را برمی گرداند.
 * Optional<Duration>	totalCpuDuration():
 * این مقدار کل زمان جمع آوری شده از پردازش را برمی گرداند.
 * Optional<String>	user():
 * این کاربر پردازش را برمی گرداند
 */
public class Java9Process {
    public Map<String, String> getProcessMap() {
        Map<String, String> map = new HashMap<>();
        ProcessHandle currentProcess = ProcessHandle.current();     // Current processhandle
        map.put("Process Id", Long.valueOf(currentProcess.pid()).toString());// Process id
        map.put("Direct children", currentProcess.children().toString());// Direct children of the process
        map.put("Class name", currentProcess.getClass().toString());// Class name
        map.put("All processes", ProcessHandle.allProcesses().toString());// All current processes
        map.put("Process info", currentProcess.info().toString()); // Process info
        map.put("Is process alive", Boolean.valueOf(currentProcess.isAlive()).toString());// Is process alive
        map.put("parent", currentProcess.parent().toString());// Parent of the process
        return map;
    }
}
