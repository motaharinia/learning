package com.motaharinia.springandboot.tspringbootcacheprovider;

/**
 * https://www.javatpoint.com/spring-boot-cache-provider
 *
 * Spring Boot Cache Provider:
 * The Spring Boot framework allows the integration of various cache providers, such as EhCache, Redis, Hazelcast, Infinispan, Caffeine, etc.
 * The cache provider allows the developer to configure cache transparently and explicitly in an application.
 * We should use cache because it reduces the number of executions and increases the performance of the application.
 * In Spring Boot, the cache abstraction does not provide the actual space for the cache.
 * It depends on the abstraction that occurred by the org.springframework.cache.Cache or org.springframework.cache.CacheManager interfaces.
 *ارائه دهنده کش اسپرینگ بوت:
 * چارچوب Spring Boot امکان ادغام ارائه دهندگان کش مختلف ، مانند EhCache ، Redis ، Hazelcast ، Infinispan ، کافئین و غیره را فراهم می آورد.
 * ارائه دهنده کش به توسعه دهنده امکان می دهد کش را به صورت شفاف و صریح در یک برنامه تنظیم کند.
 * ما باید از کش استفاده کنیم زیرا تعداد اجرا ها را کاهش می دهد و عملکرد برنامه را افزایش می دهد.
 * در Spring Boot ، انتزاع کش فضای واقعی کش را فراهم نمی کند.
 * بستگی به انتزاعی دارد که توسط اینترفیسهای org.springframework.cache.Cache یا org.springframework.cache.CacheManager رخ داده است.
 *
 * Caching Auto-configuration:
 * The Spring Boot Framework simplifies the implementation of caching by auto-configuration support.
 * It searches for the libraries and configuration-files in the classpath and initializes the required dependency beans at the time of application startup.
 * The auto-configuration of caching includes the following steps:
 * 1. Add the annotation @EnableCaching in the configuration file.
 * 2. Add the required caching libraries in the classpath.
 * 3. In the root of the classpath, add the configuration filefor the cache provider.
 *پیکربندی خودکار کشینگ:
 * چارچوب Spring Boot ، اجرای کش را با پشتیبانی از تنظیمات خودکار ساده می کند.
 * این کتابخانه ها و پرونده های پیکربندی موجود در کلاس را جستجو می کند و بین وابستگی مورد نیاز را در زمان راه اندازی برنامه آماده می کند.
 * پیکربندی خودکار کشینگ شامل مراحل زیر است:
 * 1. انوتیشن EnableCaching را در پرونده پیکربندی اضافه کنید.
 * 2. کتابخانه های ذخیره سازی مورد نیاز را در مسیر کلاس اضافه کنید.
 * 3. در ریشه classpath ، فایل پیکربندی را برای ارائه دهنده کش اضافه کنید.
 *
 * if we want to implement EhCache in an application, first we enable the cache in the configuration file.
 * اگر می خواهیم EhCache را در یک برنامه پیاده سازی کنیم ، ابتدا کش را در پرونده پیکربندی فعال می کنیم.
 * @SpringBootApplication
 * @EnableCaching
 * Add EhCache dependency in the pom.xml file. It adds the required libraries in the classpath:
 * وابستگی EhCache را در پرونده pom.xml اضافه کنید. این کتابخانه های مورد نیاز را در کلاس می افزاید:
 * <dependency>
 * <groupId>org.ehcache</groupId>
 * <artifactId>ehcache</artifactId>
 * </dependency>
 * At the end, configure the file for cache provider.
 * Here, we are using the EhCache so need to configure ehcache.xml file at the root of the classpath
 * در پایان ، پرونده را برای ارائه دهنده کش پیکربندی کنید.
 * در اینجا ، ما با استفاده از EhCache ، بنابراین باید پیکربندی پرونده ehcache.xml را در ریشه کلاس انجام دهیم
 *
 * When we do not define a bean of type CacheManager or CacheResolver, the Spring Boot Framework tries to detect the following cache provider:
 * هنگامی که ما یک بین از نوع CacheManager یا CacheResolver تعریف نمی کنیم ، Spring Boot Framework سعی دارد ارائه دهنده کش زیر را تشخیص دهد:
 * 1. Generic
 * 2. JCache
 * 3. EhCache
 * 4. Hazelcast
 * 5. Infinispan
 * 6. Couchbase
 * 7. Redis
 * 8. Caffeine
 * 9. Simple
 *
 * If the Spring Boot finds the more than one cache provider in the classpath, in such cases, we must specify the cache provider explicitly in the application.properties file.
 * اگر Spring Boot بیش از یک ارائه دهنده کش را در classpath پیدا کند ، در چنین مواردی ، ما باید ارائه دهنده کش را به طور صریح در پرونده Application.properties مشخص کنیم.
 * spring.cache.ehcache.provider=net.sf.ehcache.CacheManager
 * spring.cache.ehcache.config=classpath:config/another-config.xml
 *
 * We can set up a particular cache provider by using the property spring.cache.type.
 * It is used in a certain environment if we want to disable caching.
 * ما می توانیم با استفاده از خاصیت Spring.cache.type یک ارائه دهنده کش خاص را تنظیم کنیم.
 * اگر بخواهیم کش را غیرفعال کنیم ، در یک محیط خاص استفاده می شود.
 * spring.cache.type=none
 * The Spring Boot Framework provides a starter dependency that adds basic cache dependency in the application.
 * The starter cache dependency, by default, provides the spring-context-support dependency.
 * فریم ورک Spring Boot  یک وابستگی شروع کننده را ایجاد می کند که وابستگی کش به برنامه را اضافه می کند.
 * وابستگی به شروع کننده کش ، به طور پیش فرض ، وابستگی spring-context-support  را فراهم می کند
 *
 * Note:
 * We must include spring-context-support dependency in pom.xml file if we add cache dependency manually. Because, it provides support for Jcache, EhCache, and Caffiene.
 * توجه داشته باشید:
 * اگر وابستگی به کش را به صورت دستی اضافه کنیم ، باید وابستگی spring-context-support  را در پرونده pom.xml قرار دهیم زیرا ، پشتیبانی از Jcache ، EhCache و کافئین را فراهم می کند.
 * <dependency>
 * <groupId>org.springframework</groupId>
 * <artifactId>spring-context-support</artifactId>
 * <version>5.2.3.RELEASE</version>
 * </dependency>
 * The Spring Boot Framework automatically configures the CacheManager that can be further customized by implementing the CacheManagerCustomizer interface.
 * چارچوب Spring Boot بطور خودکار CacheManager را تنظیم می کند که می تواند با اجرای رابط CacheManagerCustomizer سفارشی سازی شود
 *
 * In the following example, we have set up a flag that passes the null values to the primary map.
 * در مثال زیر ، پرچمی را تنظیم کرده ایم که مقادیر تهی را به نقشه اصلی منتقل می کند
 * @Bean
 * public CacheManagerCustomizer<ConcurrentMapCacheManager> cacheManagerCustomizer()   {
 *    return new CacheManagerCustomizer<ConcurrentMapCacheManager>()   {
 *       @Override
 *       public void customize(ConcurrentMapCacheManager cacheManager)   {
 *          cacheManager.setAllowNullValues(false);
 *       }
 *    };
 * }
 * The above bean expects a auto-configured ConcurrentMapCacheManager.
 * If the ConcurrentMapCacheManager is not auto-configures, the customizer will not invoke in any way.
 * We can have any number of customizer and arrange them in order by using the annotation @Order or @Ordered.
 * بین فوق انتظار یک ConcurrentMapCacheManager پیکربندی شده خودکار را دارد.
 * اگر ConcurrentMapCacheManager به صورت خودکار پیکربندی نشده باشد ، شخصی سازی کننده به هیچ وجه فراخوانی نمی کند.
 * ما می توانیم هر تعداد سفارشی سازی داشته باشیم و با استفاده از انوتیشنOrder یاOrdered آنها را به ترتیب سفارش دهیم.
 *
 * Generic Caching:
 * If the spring-context-support defines at least one org.springframework.cache.Cache bean, it uses the Generic cache.
 * The CacheManager bundled all the beans and configured them.
 * اگر spring-context-support پشتیبانی حداقل یک بین org.springframework.cache.Cache را تعریف کند ، از کش عمومی استفاده می کند.
 * یک CacheManager همه بین ها را بسته بندی و آنها را پیکربندی کرد.
 *
 * JCache:
 * JCache is a self-starting process that is provided by the javax.cache.spi.CahingProvider.
 * It is present on the classpath JSR 107.
 * The spring-boot-starter-cache provides the JCacheCacheManager.
 * We can add any other cache library as well.
 * Note:
 * Spring Boot prefers the JSR support if a cache library provides both native implementation and JSR support.
 * یک JCache یک فرآیند خود شروع است که توسط javax.cache.spi.CahingProvider ارائه شده است.
 * در مسیر کلاس JSR 107 وجود دارد.
 * یک spring-boot-starter-cache میتواند JCacheCacheManager را فراهم می کند.
 * همچنین می توانیم کتابخانه کش دیگری را نیز اضافه کنیم.
 * توجه داشته باشید:
 * اسپرینگ بوت پشتیبانی JSR را ترجیح می دهد اگر یک کتابخانه کش ، پیاده سازی بومی و همچنین پشتیبانی JSR را فراهم کند
 *
 * EhCache 2.x:
 * EHCache is Java-based, open-source, and widely used cache.
 * In order to use EhCache we should use the following dependency.
 * یک EHCache کش مبتنی بر جاوا ، منبع باز و گسترده است.
 * برای استفاده از EhCache باید از وابستگی زیر استفاده کنیم
 * <dependency>
 * <groupId>org.ehcache</groupId>
 * <artifactId>ehcache</artifactId>
 * </dependency>
 * There are two ways to configure EhCache:
 * First, by configuring Java POJO file where all configuration parameters are configured through EhCache API.
 * Second, by configuring the XML file where we configure EhCache according to the provided schema definition.
 * EhCache used a file called ehcache.xml.
 * If the application found the file on the classpath, the EhCacheCacheManager provided by the spring-boot-starter-cache.
 * We can configure the XML file by using the following property:
 * دو روش برای پیکربندی EhCache وجود دارد:
 * ابتدا با پیکربندی پرونده Java POJO که در آن همه پارامترهای پیکربندی از طریق API EhCache پیکربندی شده است.
 * دوم ، با پیکربندی پرونده XML که در آن پیکربندی EhCache را با توجه به تعریف طرح ارائه شده ارائه می دهیم.
 * یک EhCache از پرونده ای به نام ehcache.xml استفاده کرد.
 * اگر برنامه فایل را در مسیر کلاس یافت ، EhCacheManager توسط spring-boot-starter-cache  ارائه شده است.
 * ما می توانیم با استفاده از خاصیت زیر پرونده XML را پیکربندی کنیم:
 * spring.cache.ehcache.config=classpath:config/demo-config.xml
 *
 * Hazelcast:
 * When we enable the caching in an application, Spring Boot wraps the HazelcastInstance automatically in the CacheManager.
 * It distributes the data equally among the nodes.
 * We can configure Hazelcast by using the following property.
 * وقتی کش را در یک برنامه فعال کنیم ، Spring Boot HazelcastInstance را به طور خودکار در CacheManager می پیچد.
 * داده ها را به طور مساوی بین نود ها توزیع می کند.
 * با استفاده از ویژگی زیر می توانیم Hazelcast را پیکربندی کنیم.
 * spring.hazelcast.config=classpath:config/demo-hazelcast.xml
 * If the property is not set, Spring Boot tries to find the hazelcast.xml (Hazelcast configuration) file on the classpath.
 * اگر این ویژگی تنظیم نشده باشد ، Spring Boot سعی می کند پرونده hazelcast.xml (تنظیمات Hazelcast) را در مسیر کلاس پیدا کند.
 *
 * Infinispan:
 * Infinispan is an embedded Java library. It is used as a cache or a data grid.
 * It stores data in the key-value form.
 * It can be easily integrated with JCache, JPA Quarkus, Spring, etc.
 * It does not have a default file location, so we should specify it explicitly.
 * If the infinispan is not specified explicitly, it uses default bootstrap.
 * یک Infinispan یک کتابخانه جاوا تعبیه شده است. به عنوان کش یا شبکه داده استفاده می شود.
 * داده ها را در فرم  کلید-مقدار ذخیره می کند.
 * می توان آن را به راحتی با JCache ، JPA Quarkus ، Spring و غیره ادغام کرد.
 * مکان پیش فرض فایل ندارد ، بنابراین باید صریحاً آن را مشخص کنیم.
 * اگر infinispan به صراحت مشخص نشده باشد ، از bootstrap پیش فرض استفاده می کند.
 * spring.cache.infinispan.config=infinispan.xml
 *
 * Couchbase:
 * The CouchebaseCacheManager is automatically configured when we implement couchbase-spring-cache, and Couchbase is configured.
 * All the operations related to the cache perform in the Bucket.
 * It allows us to create additional caches (if required) by setting up the property spring.cache.cache-name.
 * The customizer allows us to create additional Buckets, in which we can create another cache.
 * Let's understand the above concept through an example.
 * Suppose that we need three caches named cacheA, cacheB, and cacheC.
 * The cacheA and cacheB are on the main Bucket (i.e., auto-configured Bucket).
 * The cacheC is on another Bucket that is to live for a few seconds, say 4 seconds.
 * Hence, we can create cacheA and cacheB by specifying the property, as follows:
 * وقتی Couchbase-spring-cache را تنظیم می کنیم ، CouchebaseCacheManager بطور خودکار پیکربندی می شود و Couchbase پیکربندی می شود.
 * تمام عملیات مربوط به کش در Bucket انجام می شود.
 * این امکان را به ما می دهد که با تنظیم ویژگی Spring.cache.cache-name ، کشی اضافی ایجاد کنیم (در صورت لزوم).
 * این سفارشی ساز به ما امکان می دهد Bucket های دیگری ایجاد کند ، که در آن می توان کش دیگری را ایجاد کرد.
 * بیایید مفهوم فوق را از طریق یک مثال درک کنیم.
 * فرض کنید ما به سه کش به نام cacheA ، cacheB و cacheC نیاز داریم.
 * که cacheA و cacheB در Bucket اصلی قرار دارند (برای مثال Bucket تنظیم شده خودکار).
 * گفتنی است cacheC روی Bucket دیگری است که می خواهیم برای چند ثانیه زندگی کنید ، مثلاً 4 ثانیه.
 * از این رو ، می توانیم با مشخص کردن خاصیت ، cacheA و cacheB ایجاد کنیم:
 * spring.cache.cache-names=cacheA, cacheB
 *
 * Redis:
 * The RedisCacheManager is autoconfigured when we configure Redis.
 * It also allows us to create additional cache by using the property spring.cache.cache-names.
 * The default configuration can be achieved by using the property spring.cache.redis.*.
 * We can take full control over the default configuration by using the RedisCacheConfiguration bean.
 * spring.cache.cache-names=cacheA, cacheB
 * spring.cache.redis.time-to-live=100000
 * The above properties configure two caches named cacheA and cacheB, that lives for 10 minutes.
 * هنگامی که Redis را پیکربندی می کنیم ، RedisCacheManager به صورت خودکار تنظیم می شود.
 * همچنین این امکان را به ما می دهد تا با استفاده از ویژگی های Spring.cache.cache-names ، کش اضافی ایجاد کنیم.
 * پیکربندی پیش فرض را می توان با استفاده از خاصیت  *Spring.cache.redis انجام داد..
 * ما می توانیم با استفاده از بین RedisCacheConfiguration ، تنظیمات پیش فرض را به طور کامل کنترل کنیم.
 * Spring.cache.cache-names = cacheA ، cacheB
 * Spring.cache.redis.time-to-live = 100000
 * خواص فوق دو کش به نام cacheA و cacheB را تنظیم می کند ، که به مدت 10 دقیقه زندگی می کند.
 *
 * Caffeine:
 * The caffeine is a Java based caching library.
 * It also provides an in-memory cache.
 * The spring-boot-starter-cache dependency automatically configures the CaffeineCacheManger, if it founds the Caffeine in the classpath.
 * If we want to use Caffeine in an application, we need to add the following dependency:
 * کافئین یک کتابخانه ذخیره سازی مستقر در جاوا است.
 * همچنین کش حافظه را در اختیار شما قرار می دهد.
 * در صورت پیدا کردن کافئین در مسیر ، وابستگیspring-boot-starter-cache  به طور خودکار  CaffeineCacheManger را پیکربندی می کند.
 * اگر می خواهیم از کافئین در یک برنامه استفاده کنیم ، باید وابستگی زیر را اضافه کنیم:
 * <dependency>
 * <groupId>com.github.ben-manes.caffeine</groupId>
 * <artifactId>caffeine</artifactId>
 * <version>2.7.0</version>
 * </dependency>
 * The caffeine cache allows us to define size and time to live of the cache by using the property spring.cache.caffeine.spec. For example:
 * کش کافئین به ما اجازه می دهد تا با استفاده از خاصیت Spring.cache.caffeine.spec اندازه و زمان زندگی از کش را تعیین کنیم. مثلا:
 * spring.cache.cache-names=cacheA,cacheB
 * spring.cache.caffeine.spec=maximumSize=500,expireAfterAccess=600s
 * The above configuration creates two caches named cache1 and cache2.
 * The maximum size of the cache is 500 and the maximum time to live cache is 6 seconds.
 * پیکربندی فوق دو کش به نام cache1 و cache2 ایجاد می کند.
 * حداکثر اندازه کش 500 و حداکثر زمان برای ذخیره کش 6 ثانیه است.
 *
 * Simple:
 * It is the default implementation.
 * If no cache provider is specified It configures a ConcurrentHashMap as a cache store if the Spring Boot does not find any cache provider in the classpath.
 * For example, if we want two caches, set their name by using the following property:
 * این پیاده سازی پیش فرض است.
 * اگر هیچ ارائه دهنده کش مشخص نشده باشد ، در صورتی که اسپرینگ بوت هیچ یک از کش را در مسیر کلاس پیدا نکند ، یک ConcurrentHashMap را به عنوان یک کش پیکربندی می کند.
 * به عنوان مثال ، اگر دو کش می خواهیم ، با استفاده از ویژگی زیر نام آنها را تعیین کنید:
 * spring.cache.cache-names=cache1,cache2
 *
 * None:
 * When we enable the cache by using the annotation @EnableCaching, the application expects a suitable configuration.
 * It is used when we want to disable the cache in a certain environment.
 * We use the property spring.cache.type to disable the cache.
 * وقتی کش را با استفاده از انوتیشنEnableCaching فعال کنیم ، برنامه انتظار پیکربندی مناسب را دارد.
 * از آن استفاده می شود که می خواهیم کش را در یک محیط خاص غیرفعال کنیم.
 * ما برای غیرفعال کردن کش از خاصیت Spring.cache.type استفاده می کنیم.
 * spring.cache.type=none
 */
public class SpringBootCacheProvider {
}
