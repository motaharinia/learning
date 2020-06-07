package com.motaharinia.springandboot.sspringbootcaching;

/**
 * https://www.javatpoint.com/spring-boot-caching
 *
 * Spring Boot Caching:
 * Spring Framework provides caching in a Spring Application, transparently.
 * In Spring, the cache abstraction is a mechanism that allows consistent use of various caching methods with minimal impact on the code.
 *کشینگ اسپرینگ بوت:
 * چارچوب اسپرینگ ، کشینگ را در یک برنامه اسپرینگی ذخیره می کند.
 * در اسپرینگ ، انتزاع کش مکانیسمی است که امکان استفاده مداوم از متدهای مختلف کشینگ با تأثیر حداقل بر روی کد را می دهد.
 *
 * Cache Abstraction:
 * The cache abstraction mechanism applies to Java methods.
 * The main objective of using cache abstraction is to reduce the number of executions based on the information present in the cache.
 * It applies to expensive methods such as CPU or IO bound.
 * Every time, when a method invokes, the abstraction applies a cache behavior to the method.
 * It checks whether the method has already been executed for the given argument or not.
 * If yes, the cached result is returned without executing the actual method.
 * If no, first, the method executes, and the result is cached and returned to the user.
 * The developers take care of two things while working with cache abstractions.
 * Cache Declaration: It identifies the methods that need to be cached.
 * Cache Configuration: The backing cache where the data is stored and read from.
 * انتزاع کش:
 * مکانیسم انتزاع کشینگ در متد های جاوا اعمال می شود.
 * هدف اصلی استفاده از انتزاع کشینگ ، کاهش تعداد اجرا ها بر اساس اطلاعات موجود در کشینگ است.
 * این متد در مورد متدهای هزینه بر  مانند CPU یا IO محدود اعمال می شود.
 * هر بار که متد فراخوانی می شود ، انتزاع یک رفتار کش را برای این متد اعمال می کند.
 * این بررسی می کند که آیا این متد قبلاً برای argument داده شده اجرا شده است یا نه.
 * اگر بله ، نتیجه ذخیره شده بدون اجرای متد واقعی برگردانده می شود.
 * اگر خیر ، ابتدا متد اجرا می شود و نتیجه ذخیره می شود و به کاربر باز می گردد.
 * توسعه دهندگان هنگام کار با انتزاع های کش ، از دو چیز مراقبت می کنند.
 * تعریف کشینگ: متدهایی را که باید ذخیره شود شناسایی می کند.
 * پیکربندی کشینگ: کشینگ پشتیبان که داده ها در آن ذخیره و خوانده می شود.
 *
 * Caching:
 * Caching is a part of temporary memory (RAM).
 * It lies between the application and persistence database.
 * It stores the recently used data that reduces the number of database hits as much as possible.
 * In other words, caching is to store data for future reference.
 * کشینگ:
 * کشینگ بخشی از حافظه موقت (RAM) است.
 * این بین بانک اطلاعات و برنامه است.
 * این داده های اخیراً استفاده شده را ذخیره می کند که تعداد بازدیدهای پایگاه داده را تا حد ممکن کاهش می دهد.
 * به عبارت دیگر ، کشینگ برای ذخیره اطلاعات برای ارجاع بعدی است
 *
 * Why should we use the cache?
 * The primary reason for using cache is to make data access faster and less expensive.
 * When the highly requested resource is requested multiple times, it is often beneficial for the developer to cache resources so that it can give responses quickly.
 * Using cache in an application enhances the performance of the application.
 * Data access from memory is always faster in comparison to fetching data from the database.
 * It reduces both monetary cost and opportunity cost.
 * چرا باید از کشینگ استفاده کنیم؟
 * دلیل اصلی استفاده از کشینگ ، دسترسی سریعتر و کم هزینه تر به داده ها است.
 * هنگامی که از منابع بسیار درخواستی چندین بار خواسته شده است ، غالباً ذخیره کردن منابع برای توسعه دهنده مفید است تا بتواند به سرعت پاسخ هایی را ارائه دهد.
 * استفاده از کشینگ در یک برنامه باعث افزایش عملکرد برنامه می شود.
 * دسترسی به داده از حافظه در مقایسه با واکشی داده از پایگاه داده همیشه سریعتر است.
 * هم هزینه پولی و هم هزینه فرصت را کاهش می دهد.
 *
 * What data should be cached?
 * The data that do not change frequently.
 * The frequently used read query in which results does not change in each call, at least for a period.
 * چه داده هایی باید کش شوند؟
 * داده هایی که به طور مکرر تغییر نمی کنند.
 *کوئری خوانش که اغلب استفاده می شود که در آن نتایج حداقل در مدت یک دوره در هر فراخوانی تغییر نمی کند
 *
 * Types of Caching:
 * There are four types of caching are as follows:
 *انواع کشینگ:
 * چهار نوع کشینگ به شرح زیر است:
 *
 * 1. In-memory Caching:
 * In-memory caching increases the performance of the application.
 * It is the area that is frequently used.
 * Memcached and Redis are examples of in-memory caching.
 * It stores key-value between application and database.
 * Redis is an in-memory, distributed, and advanced caching tool that allows backup and restore facility.
 * We can manage cache in distributed clusters, also.
 * 1. کشینگ حافظه:
 * کشینگ حافظه عملکرد برنامه را افزایش می دهد.
 * این محلی است که اغلب مورد استفاده قرار می گیرد.
 * Memcached و Redis نمونه هایی از ذخیره حافظه هستند.
 * این مقدار کلیدی بین برنامه و پایگاه داده را ذخیره می کند.
 * ردیس ابزاری برای ذخیره سازی در حافظه ، توزیع و پیشرفته است که امکان تهیه نسخه پشتیبان و بازیابی امکانات را فراهم می کند.
 * ما همچنین می توان کش را در خوشه های توزیع شده مدیریت کرد
 *
 * 2. Database Caching:
 * Database caching is a mechanism that generates web pages on-demand (dynamically) by fetching the data from the database.
 * It is used in a multi-tier environment that involved clients, web-application server, and database.
 * It improves scalability and performance by distributing a query workload.
 * The most popular database caching is the first level cache of Hibernate.
 * 2. کشینگ بانک اطلاعاتی:
 * کشینگ پایگاه داده مکانیسمی است که صفحات وب را به صورت تقاضا (بصورت پویا) با واکشی داده ها از پایگاه داده ایجاد می کند.
 * در یک محیط چند لایه استفاده می شود که شامل مشتری ، سرور برنامه وب و بانک اطلاعاتی می شود.
 * با توزیع یک بار کار کوئری ، مقیاس پذیری و عملکرد را بهبود می بخشد.
 * محبوب ترین حافظه ذخیره سازی پایگاه داده ، کشینگ سطح اول Hibernate است
 *
 * 3. Web server Caching:
 * Web server caching is a mechanism that stores data for reuse.
 * For example, a copy of a web page served by a web server.
 * It is cached for the first time when a user visits the page.
 * If the user requests the same next time, the cache serves a copy of the page.
 * It avoids server form getting overloaded.
 * Web server caching enhances the page delivery speed and reduces the work to be done by the backend server.
 * 3. کشینگ سرور وب:
 * ذخیره سازی وب سرور مکانیزمی است که داده ها را برای استفاده مجدد ذخیره می کند.
 * به عنوان مثال ، یک کپی از یک صفحه وب که توسط یک سرور وب سرویس داده شده است.
 * این برای اولین بار هنگام بازدید کاربر از صفحه ذخیره می شود.
 * اگر کاربر دفعه بعد همان درخواست را انجام دهد ، کشینگ نسخه ای از صفحه را در اختیار شما قرار می دهد.
 * این از اضافه شدن overloaded جلوگیری می کند.
 * کشینگ سرور وب سرعت تحویل صفحه را افزایش می دهد و کارهایی را که توسط سرور backend انجام می شود کاهش می دهد.
 *
 * 4. CDN Caching:
 * The CDN stands for Content Delivery Network.
 * It is a component used in modern web applications.
 * It improves the delivery of the content by replicating commonly requested files (such as HTML Pages, stylesheet, JavaScript, images, videos, etc.) across a globally distributed set of caching servers.
 * It is the reason CDN becomes more popular.
 * The CDN reduces the load on an application origin and improves the user experience.
 * It delivers a local copy of the content from a nearby cache edge (a cache server that is closer to the end-user), or a Point of Presence (PoP).
 * 4. کشینگ CDN:
 * یک CDN مخفف Content Delivery Network است.
 * این جزء مورد استفاده در برنامه های وب مدرن است.
 * این کار با تکثیر پرونده های متداول (مانند صفحات HTML ، صفحه stylesheet ، JavaScript ، تصاویر ، فیلم ها و غیره) در سراسر یک سرور توزیع شده در سطح جهانی توزیع شده ، محتوا را بهبود می بخشد.
 * این دلیل محبوب تر شدن CDN است.
 * یک CDN باعث کاهش بار در مبدأ برنامه و بهبود تجربه کاربر می شود.
 * این یک نسخه محلی از مطالب را از یک حاشیه کشینگ نزدیک (سرور کشینگ نزدیک به کاربر نهایی) یا یک نقطه حضور (PoP) ارائه می دهد
 *
 * Cache vs. Buffer:
 * 1. The cache is based on Least Recently Used.	Buffer is based on First-In-First-Out.
 * 2. The cache is the size of the page cache.	Buffer is an in-memory raw block I/O buffer.
 * 3. The cache lived for a long period.	Buffer lived for a short period.
 * 4. We read from the cache.	We write into the buffer.
 * 5. The cache  stores the actual file data.	Buffer stores the file metadata.
 * 6. The cache improves read performance.	Buffer  improves write performance.
 * کش در مقابل بافر:
 * 1. کشینگ مبتنی بر حداقل استفاده اخیر است. بافر مبتنی بر First-in-First-Out است.
 * 2. کشینگ اندازه کشینگ صفحه است. بافر یک بافر I / O با بلوک خام در حافظه است.
 * 3. کشینگ برای مدت طولانی زندگی می کرد. بافر برای مدت کوتاهی زندگی کرد.
 * 4- از کشینگ می خوانیم. ما در بافر می نویسیم.
 * 5- کشینگ داده های واقعی پرونده را ذخیره می کند. بافر فایل فوق داده پرونده را ذخیره می کند.
 * 6. کشینگ عملکرد خواندن را بهبود می بخشد. بافر عملکرد نوشتن را بهبود می بخشد.
 *
 * Spring Boot Cache Annotations:
 * @EnableCaching:
 * It is a class-level annotation.
 * We can enable caching in the Spring Boot application by using the annotation @EnableCaching.
 * It is defined in org.springframework.cache.annotation package.
 * It is used together with @Configuration class.
 * The auto-configuration enables caching and setup a CacheManager, if there is no already defined instance of CacheManager.
 * It scans for a specific provider, and when it does not find, it creates an in-memory cache using concurrent HashMap.
 * Example
 * In the following example, @EnableCaching annotation enables the cache mechanism.
 * این یک انوتیشن در سطح کلاس است.
 * با استفاده از انوتیشنEnableCaching می توانیم برنامه نویسی Spring Boot را فعال کنیم.
 * در بسته org.springframework.cache.annotation تعریف شده است.
 * این همراه با کلاسConfiguration استفاده می شود.
 * پیکربندی خودکار ، کشینگ و تنظیم CacheManager را امکان پذیر می کند ، در صورتی که هیچ نمونه مشخصی از CacheManager وجود نداشته باشد.
 * این یک ارائه دهنده خاص را اسکن می کند ، و هنگامی که نمی یابد ، کشینگ حافظه را با استفاده از HashMap همزمان ایجاد می کند.
 * مثال
 * در مثال زیر ، انوتیشنEnableCaching سازوکار کشینگ را فعال می کند.
 * @SpringBootApplication
 * @EnableCaching
 * public class SpringBootCachingApplication
 *
 * @CacheConfig:
 * It is a class-level annotation that provides a common cache-related setting.
 * It tells the Spring where to store cache for the class.
 * When we annotate a class with the annotation, it provides a set of default settings for any cache operation defined in that class.
 * Using the annotation, we need not to declare things multiple times.
 * Example
 * In the following example, employee is the name of the cache.
 * این انوتیشن در سطح کلاس است که یک تنظیم مشترک مربوط به کشینگ را فراهم می کند.
 * این اسپرینگ می گوید که در آنجا کشینگ برای کلاس ذخیره شود.
 * وقتی یک کلاس را با انوتیشن انوتیشن می کنیم ، مجموعه ای از تنظیمات پیش فرض را برای هر نوع عملکرد کشینگ تعریف شده در آن کلاس فراهم می کند.
 * با استفاده از انوتیشن ، لازم نیست که موارد را چندین بار اعلام کنیم.
 * مثال
 * در مثال زیر ، کارمند نام کشینگ است.
 * @CacheConfig(cacheNames={"employee"})
 * public class UserService  {
 * //some code
 * }
 *
 * @Caching:
 * It is used when we need both annotations @CachePut or @CacheEvict at the same time on the same method.
 * In other words, it is used when we want to use multiple annotations of the same type.
 * But Java does not allow multiple annotations of the same type to be declared for a given method.
 * To avoid this problem, we use @Caching annotation.
 * Example
 * In the following example, we have used the annotation @Caching and grouped all the @CacheEvict annotations.
 * این مورد زمانی استفاده می شود که ما به هر دو انوتیشن هایCachePut یاCacheEvict در همان زمان به همان متد نیاز داریم.
 * به عبارت دیگر ، وقتی می خواهیم چندین انوتیشن از همان نوع استفاده کنیم ، استفاده می شود.
 * اما جاوا اجازه نمی دهد چندین انوتیشن از همان نوع برای یک متد معین اعلام شود.
 * برای جلوگیری از این مشکل ، از انوتیشنCaching استفاده می کنیم.
 * مثال
 * در مثال زیر ، از انوتیشنCaching استفاده کرده ایم و همه انوتیشنهایCacheEvict را دسته بندی کرده ایم.
 * @Caching(evict = {@CacheEvict("phone_number"), @CacheEvict(value="directory", key="#student.id") })
 * public String getAddress(Student student)   {
 * //some code
 * }
 *
 * @Cacheable:
 * It is a method level annotation.
 * It defines a cache for a method's return value.
 * The Spring Framework manages the requests and responses of the method to the cache that is specified in the annotation attribute.
 * The @Cacheable annotation contains more options.
 * For example, we can provide a cache name by using the value or cacheNames attribute.
 * We can also specify the key attribute of the annotation that uniquely identifies each entry in the cache.
 * If we do not specify the key, Spring uses the default mechanism to create the key.
 * Example
 * In the following example, we have cached the return value of the method studentInfo() in cacheStudentInfo, and id is the unique key that identifies each entry in the cache.
 * این یک انوتیشن سطح متد است.
 * این یک کشینگ برای مقدار برگشتی یک متد را تعیین می کند.
 * چارچوب اسپرینگ درخواست ها و پاسخ های متد را به کشینگ که در ویژگی انوتیشن مشخص شده است ، مدیریت می کند.
 * انوتیشنCacheable شامل گزینه های بیشتری است.
 * به عنوان مثال ، ما می توانیم با استفاده از ویژگی مقدار یا ویژگی cacheNames ، نام کش را ارائه دهیم.
 * همچنین می توانیم ویژگی اصلی انوتیشن را مشخص کنیم که بطور جداگانه هر ورودی در کشینگ را مشخص می کند.
 * اگر کلید را مشخص نکنیم ، Spring از مکانیزم پیش فرض برای ایجاد کلید استفاده می کند.
 * مثال
 * در مثال زیر مقدار بازگشتی متد studentInfo () را در cacheStudentInfo ذخیره کرده ایم و id کلید منحصر به فردی است که هر ورودی را در کشینگ مشخص می کند.
 * @Cacheable(value="cacheStudentInfo", key="#id")
 * public List studentInfo(Integer id)  {
 * //some code
 * return studentDetails;
 * }
 * We can also apply a condition in the annotation by using the condition attribute.
 * When we apply the condition in the annotation, it is called conditional caching.
 * For example, the following method will be cached if the argument name has a length shorter than 20.
 * همچنین می توانیم با استفاده از ویژگی شرط ، یک شرط را در انوتیشن اعمال کنیم.
 * وقتی شرط را در انوتیشن بکار می بریم ، آن را کشینگ مشروط می نامیم.
 * به عنوان مثال ، اگر نام آرگومان دارای طول کوتاهتر از 20 باشد ، متد زیر کش می شود.
 * @Cacheable(value="student", condition="#name.length<20")
 * public Student findStudent(String name)  {
 * //some code
 * }
 *
 * @CacheEvict:
 * It is a method level annotation.
 * It is used when we want to remove stale or unused data from the cache.
 * It requires one or multiple caches that are affected by the action.
 * We can also specify a key or condition into it.
 * If we want wide cache eviction, the @CacheEvict annotation provides a parameter called allEntries.
 * It evicts all entries rather than one entry based on the key.
 * One important point about @CacheEvict annotation is that it can be used with void methods because the method acts as a trigger.
 * It avoids return values.
 * On the other hand, the annotation @Cacheable requires a return value that adds/updates data in the cache.
 * We can use @CacheEvict annotation in the following ways:
 * این یک انوتیشن سطح متد است.
 * هنگامی که می خواهیم داده های قدیمی یا بلااستفاده از کشینگ را حذف کنیم ، استفاده می شود.
 * به یک یا چند کشینگ نیاز دارد که تحت تأثیر این عمل قرار دارند.
 * همچنین می توانیم یک کلید یا شرط را در آن مشخص کنیم.
 * اگر می خواهیم حذف گسترده کش ها را داشته باشیم ، انوتیشنCacheEvict پارامتری به نام allEntries را فراهم می کند.
 * همه ورودی ها را به جای یک ورودی بر اساس کلید حذف می کشد.
 * یک نکته مهم در مورد انوتیشنCacheEvict این است که می توان با متد های خالی از آن استفاده کرد زیرا این متد به عنوان یک محرک عمل می کند.
 * از مقادیر بازگشت جلوگیری می کند.
 * از طرف دیگر ، انوتیشنCacheable به مقدار برگشتی نیاز دارد که داده را در کشینگ اضافه یا به روز می کند.
 * ما می توانیم از انوتیشنCacheEvict به متد های زیر استفاده کنیم:
 * Evict the whole cache:
 * کل کشینگ را حذف کند:
 * @CacheEvict(allEntries=true)
 * Evict an entry by key:
 * ورودی را با کلید حذف کنید:
 * @CacheEvict(key="#student.stud_name")
 * removing all entries from the cache :
 * حذف همه ورودی ها از کشینگ:
 * @CacheEvict(value="student_data", allEntries=true)
 *
 * @CachePut:
 * It is a method level annotation.
 * It is used when we want to update the cache without interfering the method execution.
 * It means the method will always execute, and its result will be placed into the cache.
 * It supports the attributes of @Cacheable annotation.
 * A point to be noticed that the annotations @Cacheable and @CachePut are not the same because they have different behavior.
 * There is a slight difference between @Cacheable and @CachePut annotation is that the @Cacheable annotation skips the method execution while the @CachePut annotation runs the method and put the result into the cache.
 * Example
 * The following method will update the cache itself.
 * این یک انوتیشن سطح متد است.
 * هنگامی که می خواهیم کشینگ را بدون دخالت در اجرای متد به روز کنیم ، از آن استفاده می شود.
 * این بدان معناست که این متد همیشه اجرا خواهد شد و نتیجه آن در کشینگ قرار می گیرد.
 * این ویژگی از انوتیشنCacheable پشتیبانی می کند.
 * نکته ای که باید توجه داشت انوتیشن هایCacheable وCachePut یکسان نیستند زیرا رفتارهای متفاوتی دارند.
 * یک تفاوت جزئی بین انوتیشنCacheable وCachePut وجود دارد که انوتیشنCacheable از اجرای متد صرف نظر می کند در حالی که انوتیشنCachePut متد را اجرا کرده و نتیجه را در کشینگ قرار می دهد.
 * مثال
 * متد زیر خود کشینگ را به روز می کند.
 * @CachePut(cacheNames="employee", key="#id") //updating cache
 * public Employee updateEmp(ID id, EmployeeData data)  {
 * //some code
 * }
 *
 * Spring Boot Cache Dependency:
 * If we want to enable cache mechanism in a Spring Boot application, we need to add cache dependency in the pom.xml file.
 * It enables caching and configures a CacheManager.
 * وابستگی به کشینگ اسپرینگ:
 * اگر می خواهیم مکانیسم کشینگ را در برنامه Spring Boot فعال کنیم ، باید وابستگی به کشینگ را در پرونده pom.xml اضافه کنیم.
 * این امکان ذخیره سازی و پیکربندی CacheManager را فراهم می کند
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-cache</artifactId>
 * </dependency>
 */
public class SpringBootCaching {
}
