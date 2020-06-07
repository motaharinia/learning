package com.motaharinia.springandboot.uspringbootehcaching;

/**
 *https://www.javatpoint.com/spring-boot-ehcaching
 *
 * EhCache:
 * EhCache is an open-source, Java-based cache used to boost performance.
 * The current version of Ehcache is 3.
 * It provides the implementation of the JSR-107 cache manager.
 * We can use it directly.
 * یک EhCache یک کش منبع باز و جاوا است که برای افزایش کارایی استفاده می شود.
 * نسخه فعلی Ehcache 3 است.
 * این برنامه اجرای مدیر کش JSR-107 را فراهم می کند.
 * ما می توانیم مستقیماً از آن استفاده کنیم.
 *
 *Features of EhCache:
 * It is fast, lightweight, Scalable, and Flexible.
 * It allows us to perform Serializable and Object
 * It offers cache eviction policies such as LRU, LFU, FIFO,
 * It stores the cache in memory and disk (SSD).
 * It depends on SLF4J for logging.
 * It has a full implementation of JSR-107 and Jcache
 * It supports distributed caching via JGroups or JMS and RMI.
 * It uses fluent query language for distributed search.
 * ویژگی های EhCache:
 * سریع ، سبک ، مقیاس پذیر و قابل انعطاف است.
 * به ما امکان می دهد Serializable و Object را انجام دهیم
 * این سیاستهای حذف کش مانند LRU ، LFU ، FIFO ،
 * این کش را در حافظه و دیسک (SSD) ذخیره می کند.
 * برای لاگینگ به SLF4J وابستگی دارد.
 * اجرای کامل JSR-107 و Jcache را دارد
 * این پشتیبانی از ذخیره سازی توزیع شده از طریق JGroups یا JMS و RMI را پشتیبانی می کند.
 * از زبان جستجوی روان برای جستجوی توزیع شده استفاده می کند.
 *
 * EhCache Usage Patterns:
 * The cache uses several access patterns.
 * There are following patterns used by EhCache:
 *الگوهای استفاده EhCache:
 * کش از چندین الگوی دسترسی استفاده می کند.
 * الگوهای زیر وجود دارد که توسط EhCache استفاده شده است:
 *
 * 1. Cache-aside
 * In the cache-aside pattern, first, the application consults with the cache.
 * If the data is found, it returns the data directly.
 * In the opposite scenario, it fetches the data from the SoR, stores it into the cache, and then return.
 * در الگوی کش ، ابتدا برنامه با کش مشورت می کند.
 * اگر داده یافت شود ، داده را مستقیماً برمی گرداند.
 * در سناریوی مقابل ، داده ها را از SoR واکشی می کند ، آن را در کش ذخیره می کند ، و سپس برمی گرداند.
 *
 * 2. Cache-as-SoR (system-of-record):
 * The cache-as-SoR pattern represents SoR reading and writing operations to the cache.
 * It reduces the responsibility of the application.
 * It uses the combination of read and write pattern that includes read-through, write-through, and write-behind.
 * It reduces the difficulty of the application.
 * It allows the cache to solve the thundering-herd problem
 * الگوی cache-as-SoR بیانگر عملیات خواندن و نوشتن SoR به کش است.
 * مسئولیت برنامه را کاهش می دهد.
 * این ترکیب از الگوی خواندن و نوشتن استفاده می کند که شامل خواندن ، نوشتن از طریق ، و نوشتن است.
 * این مشکل برنامه را کاهش می دهد.
 * این به کش اجازه می دهد تا مشکل thundering-herd  را حل کند
 *
 * 3. Read-through:
 * The read-through pattern also copies the cache-aside pattern while reading data from the cache.
 * The difference between the read-through and cache-aside is that read-through pattern implements the CacheEntryFactory interface.
 * It guides the cache how to read an object from the cache.
 * It is better to wrap the EhCache instance with the instance of SelfPopulatingCache while using the read-through pattern.
 * الگوی خواندن از طریق الگوی  cache-aside  هنگام خواندن داده از کش ، کپی می کند.
 * تفاوت بین read-through و cache-aside در این است که الگوی read-through رابط CacheEntryFactory را پیاده سازی می کند.
 * این کش را در چگونه خواندن یک شی از کش هدایت می کند.
 * بهتر است ضمن استفاده از الگوی خواندن ، نمونه EhCache را با نمونه SelfPopulatingCache بپیچانید.
 *
 * 4. Write-through:
 * The write-through pattern also copies the cache-aside pattern while writing data in the cache.
 * The difference between write-through and cache-aside pattern is that write-through pattern implements the CacheWriter interface.
 * It configures the cache for both write-through and write-behind pattern.
 * It writes data to the SoR(system-of-record) in the same thread of execution.
 * الگوی write-through   ، الگوی cache-aside را در زمان نوشتن در کش نیز کپی می کند.
 * تفاوت بین الگوی write-through و cache-aside در این است که الگوی نوشتن رابط CacheWriter را پیاده سازی می کند.
 * این کش را برای هر دو الگوی  write-through و write-behind  پیکربندی می کند.
 * این داده را به SoR در همان نخ اجرا می نویسد.
 *
 * 5. Write-behind:
 * The write-behind pattern is different form the other three patterns.
 * It modifies the cache entries after a configurable delay.
 * The delay may in seconds, minutes, a day, a week, or for a long time.
 * Simultaneously, it also queues the data to write at a later time in the same thread of execution.
 * الگوی write-behind از سه الگوی دیگر متفاوت است.
 * بعد از تأخیر قابل تنظیم ، ورودی های کش را تغییر می دهد.
 * تأخیر ممکن است در ثانیه ، دقیقه ، یک روز ، یک هفته یا برای مدت طولانی باشد.
 * به طور همزمان ، داده ها را نیز برای نوشتن در زمان بعدی در همان موضوع اجرا در صف قرار می دهد
 *
 * The data write using write-behind pattern happens outside of the scope of the transaction.
 * It means that it creates a new transaction to commit the data in the SoR that is distinct from the main transaction.
 * نوشتن داده ها با استفاده از الگوی write-behind در خارج از محدوده تراکنشها اتفاق می افتد.
 * این بدان معناست که یک تراکنش جدید برای کامیت داده ها در SoR ایجاد می کند که از تراکنش اصلی متمایز است.
 *
 *EhCaching Storage Tiers:
 * EhCache allows us to use various data storage areas, such as heap, disk and clustered.
 * We can configure a multi-storage cache (uses more than one storage area).
 * It can be arranged and managed as tiers.
 * The tiers are organized in order.
 * The bottom-most tier is known as authority tier, and the other tier is known as the caching tier.
 * It is also known as nearer or near cache.
 * The caching tier can have more than one storage area.
 * The hottest data kept in the caching tier because it is faster than the authority tier.
 * Other data is kept in the authority tier that is slower but richer in comparison to the caching tier.
 * There are four types of data storage supported by EhCache:
 * رده های ذخیره سازی EhCaching:
 * یک EhCache به ما امکان استفاده از مناطق مختلف ذخیره سازی داده ها ، مانند پشته ، دیسک و خوشه بندی را می دهد.
 * ما می توانیم یک کش چند حافظه را پیکربندی کنیم (از بیش از یک مکان ذخیره سازی استفاده می کند).
 * می توان آنرا مرتب و مدیریت کرد.
 * رده ها به ترتیب سازماندهی می شوند.
 * پایین ترین رده به عنوان رده authority شناخته می شود ، و رده دیگر به عنوان رده کشینگ شناخته می شود.
 * همچنین به عنوان نزدیکتر یا نزدیک به کش شناخته می شود.
 * رده کشینگ می تواند بیش از یک محل ذخیره داشته باشد.
 * داغترین داده ها در رده حافظه نگه داشته می شوند زیرا سریعتر از رده authority است.
 * سایر داده ها در ردیف authority قرار دارند که در مقایسه با رده کشینگ ، کندتر اما غنی تر هستند.
 * چهار نوع ذخیره داده وجود دارد که توسط EhCache پشتیبانی می شود:
 *
 * 1. On-Heap Store:
 * It stores cache entries in Java heap memory.
 * It shares the storage with Java application.
 * It is fast because it uses heap but has limited storage space.
 * The garbage collector also scans the on-heap store.
 * این ورودی های کش را در حافظه پشته جاوا ذخیره می کند.
 * این برنامه ذخیره سازی را با برنامه جاوا به اشتراک می گذارد.
 * این سریع است زیرا از پشته استفاده می کند اما فضای ذخیره سازی محدودی دارد.
 * جمع آوری زباله همچنین فضای ذخیره سازی موجود در پشته را اسکن می کند
 *
 * 2. Off-Heap Store:
 * It uses the primary memory (RAM) to store cache entries.
 * The garbage collector does not scan it.
 * It is slower than the on-heap store because the cache entries move to the on-heap store before use. It is limited in size.
 *از حافظه اولیه (RAM) برای ذخیره سازی کش استفاده می کند.
 * جمع آوری زباله آن را اسکن نمی کند.
 * این کندتر از فروشگاه روی پشته است زیرا ورودی های کش قبل از استفاده به فروشگاه پشته منتقل می شوند. اندازه محدود است
 *
 * 3. Disk Store:
 * It uses a disk to store cache entries.
 * It is much slower than RAM-based stores (on and off-heap store).
 * It is better to use a dedicated disk if you are using a disk store pattern.
 * It enhances throughput.
 * از این دیسک برای ذخیره کردن ورودی های کش استفاده می کند.
 * بسیار کندتر از انباره های مبتنی بر RAM (on and off-heap store).
 * اگر از الگوی انباره دیسک استفاده می کنید بهتر است از دیسک اختصاصی استفاده کنید.
 * این کارآیی را افزایش می دهد
 *
 * 4. Clustered Store:
 * It stores cache entries on the remote server.
 * It is slower than off-heap storage.
 * It may have a failover server that provides high availability.
 * ورودی های کش را روی سرور از راه دور ذخیره می کند.
 * کندتر از انبار off-heap است.
 * این ممکن است یک سرور غلبه بر خرابی است که در دسترس بودن بالا فراهم می کند.
 *
 * The above diagram shows that:
 * An application may have more than one Cache Manager.
 * Many caches can be handled by a Cache Manager.
 * The caches can use more than one tier for storing cache entries.
 * EhCache puts the recently used or frequently used data in the faster tier (caching tier).
 * نمودار فوق نشان می دهد:
 * یک برنامه ممکن است بیش از یک مدیر کش داشته باشد.
 * بسیاری از انبارها را می توان توسط یک مدیر کش ذخیره کرد.
 * انبارها می توانند از بیش از یک ردیف برای ذخیره کردن ورودی های کش استفاده کنند.
 * یک EhCache داده های اخیراً استفاده شده یا غالباً مورد استفاده را در ردیف سریع تر (ردیف کش) قرار می دهد.
 *
 * Configuring EhCache:
 * Place the EhCache jar in the classpath.
 * Configure the xml and put it in the classpath.
 * Create a
 * Reference a Cache.
 * پیکربندی EhCache:
 * فایل jar EhCache را در مسیر کلاس قرار دهید.
 * فایل xml را پیکربندی کنید و آن را در مسیر کلاس قرار دهید.
 * ایجاد a
 * به a کش ارجاع کنید.
 *
 */
public class SpringBootEhCaching {
}
