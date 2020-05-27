package com.motaharinia.springandboot.ispringbootstarters;

/**
 * https://www.javatpoint.com/spring-boot-starters
 * Spring Boot Starters:
 * Spring Boot provides a number of starters that allow us to add jars in the classpath.
 * Spring Boot built-in starters make development easier and rapid.
 * Spring Boot Starters are the dependency descriptors.
 * In the Spring Boot Framework, all the starters follow a similar naming pattern: spring-boot-starter-*, where * denotes a particular type of application.
 * For example, if we want to use Spring and JPA for database access, we need to include the spring-boot-starter-data-jpa dependency in our pom.xml file of the project.
 *شروع کننده های اسپرینگ بوت:
 * اسپرینگ بوت تعدادی از استارتاپ ها را فراهم می کند که به ما امکان می دهند تا jar هایی را در مسیر کلاس اضافه کنیم.
 * آغازگرهای داخلی Boot Spring توسعه را آسانتر و سریع می کند.
 * شروع کننده های اسپرینگ بوت توصیف کنندگان وابستگی هستند.
 * در Spring Boot Framework ، همه آغازگرها از الگوی نامگذاری مشابه پیروی می کنند: Spring-boot-starter- * ، جایی که * نوع خاصی از برنامه را مشخص می کند.
 * به عنوان مثال ، اگر می خواهیم از Spring و JPA برای دسترسی به پایگاه داده استفاده کنیم ، باید وابستگی اسپرینگ-boot-starter-data-jpa را در پرونده pom.xml پروژه خود بگنجانیم.
 *
 * Third-Party Starters:
 * We can also include third party starters in our project.
 * But we do not use spring-boot-starter for including third party dependency.
 * The spring-boot-starter is reserved for official Spring Boot artifacts.
 * The third-party starter starts with the name of the project.
 * For example, the third-party project name is abc, then the dependency name will be abc-spring-boot-starter.
 * شروع کننده های شخص ثالث:
 * ما همچنین می توانیم آغازگرهای شخص ثالث را در پروژه خود قرار دهیم.
 * اما ما برای ایجاد وابستگی شخص ثالث از start-boot starter استفاده نمی کنیم.
 * یک spring-boot-starter  برای artifacts  رسمی اسپرینگ رزرو شده است.
 * آغازگرهای شخص ثالث با نام پروژه شروع می شود.
 * به عنوان مثال ، نام پروژه شخص ثالث abc است ، سپس نام وابستگی abc-spring-boot-starter خواهد بود.
 *
 * The Spring Boot Framework provides the following application starters under the org.springframework.boot group:
 * فریم ورک  Spring Boot شامل برنامه های زیر در زیر گروه org.springframework.boot است:
 * spring-boot-starter-thymeleaf:
 * It is used to build MVC web applications using Thymeleaf views.
 * spring-boot-starter-data-couchbase	It is used for the Couchbase document-oriented database and Spring Data Couchbase.
 * برای ساخت برنامه های وب MVC با استفاده از نماهای Thymeleaf استفاده می شود.
 * از Spring-boot-starter-data-couchbase برای پایگاه داده مستند گرا Couchbase و Spring Data Couchbase استفاده می شود.
 *
 * spring-boot-starter-artemis:
 * It is used for JMS messaging using Apache Artemis.
 * برای پیام رسانی JMS با استفاده از Apache Artemis استفاده می شود.
 *
 * spring-boot-starter-web-services:
 * It is used for Spring Web Services.
 * این برای خدمات وب اسپرینگ استفاده می شود.
 *
 * spring-boot-starter-mail:
 * It is used to support Java Mail and Spring Framework's email sending.
 * این مورد برای پشتیبانی از ارسال ایمیل Java Mail و Spring Framework استفاده می شود.
 *
 * spring-boot-starter-data-redis:
 * It is used for Redis key-value data store with Spring Data Redis and the Jedis client.
 *برای فروشگاه داده با ارزش اصلی Redis با Spring Data Redis و مشتری Jedis استفاده می شود.
 *
 * spring-boot-starter-web:
 * It is used for building the web application, including RESTful applications using Spring MVC. It uses Tomcat as the default embedded container.
 * برای ساختن برنامه وب از جمله برنامه های RESTful با استفاده از Spring MVC استفاده می شود. از Tomcat به عنوان ظرف تعبیه شده پیش فرض استفاده می کند.
 *
 * spring-boot-starter-data-gemfire:
 * It is used to GemFire distributed data store and Spring Data GemFire.
 *از آن به فروشگاه داده توزیع شده GemFire ​​و Spring Data GemFire ​​استفاده می شود.
 *
 * spring-boot-starter-activemq:
 * It is used in JMS messaging using Apache ActiveMQ.
 * در پیام رسانی JMS با استفاده از Apache ActiveMQ استفاده می شود.
 *
 * spring-boot-starter-data-elasticsearch:
 * It is used in Elasticsearch search and analytics engine and Spring Data Elasticsearch.
 *از آن در موتور جستجو و تجزیه و تحلیل Elasticsearch و Spring Data Elasticsearch استفاده می شود.
 *
 * spring-boot-starter-integration:
 * It is used for Spring Integration.
 * برای ادغام اسپرینگ استفاده می شود.
 *
 * spring-boot-starter-test:
 * It is used to test Spring Boot applications with libraries, including JUnit, Hamcrest, and Mockito.
 * برای تست برنامه های کاربردی بوت اسپرینگ با کتابخانه ها ، از جمله JUnit ، Hamcrest و Mockito استفاده می شود.
 *
 * spring-boot-starter-jdbc:
 * It is used for JDBC with the Tomcat JDBC connection pool.
 * این است که برای JDBC با استخر اتصال Tomcat JDBC استفاده می شود.
 *
 * spring-boot-starter-mobile:
 * It is used for building web applications using Spring Mobile.
 * برای ساخت برنامه های وب با استفاده از Spring Mobile استفاده می شود.
 *
 * spring-boot-starter-validation:
 * It is used for Java Bean Validation with Hibernate Validator.
 * برای اعتبارسنجی Java Bean with Validator Hibernate استفاده می شود.
 *
 * spring-boot-starter-hateoas:
 * It is used to build a hypermedia-based RESTful web application with Spring MVC and Spring HATEOAS.
 * برای ساختن یک برنامه وب RESTful مبتنی بر هایپرمی مدیا با Spring MVC و Spring HATEOAS استفاده می شود.
 *
 * spring-boot-starter-jersey:
 * It is used to build RESTful web applications using JAX-RS and Jersey. An alternative to spring-boot-starter-web.
 * برای ساخت برنامه های وب RESTful با استفاده از JAX-RS و Jersey استفاده می شود. جایگزینی برای اسپرینگ-boot-starter-وب.
 *
 * spring-boot-starter-data-neo4j:
 * It is used for the Neo4j graph database and Spring Data Neo4j.
 * برای پایگاه داده های نمودار Neo4j و Spring Data Neo4j استفاده می شود.
 *
 * spring-boot-starter-data-ldap:
 * It is used for Spring Data LDAP.
 * این برای Spring Data LDAP استفاده می شود.
 *
 * spring-boot-starter-websocket:
 * It is used for building the WebSocket applications. It uses Spring Framework's WebSocket support.
 * برای ساخت برنامه های WebSocket استفاده می شود. از پشتیبانی WebSocket Spring Framework استفاده می کند.
 *
 * spring-boot-starter-aop:
 * It is used for aspect-oriented programming with Spring AOP and AspectJ.
 * این برای برنامه نویسی جنبه گرا با Spring AOP و AspectJ استفاده می شود.
 *
 * spring-boot-starter-amqp:
 * It is used for Spring AMQP and Rabbit MQ.
 * برای Spring AMQP و Rabbit MQ استفاده می شود.
 *
 * spring-boot-starter-data-cassandra:
 * It is used for Cassandra distributed database and Spring Data Cassandra.
 * برای پایگاه داده توزیع شده کاساندرا و Spring Data Cassandra استفاده می شود.
 *
 * spring-boot-starter-social-facebook:
 * It is used for Spring Social Facebook.
 * این برای فیس بوک اجتماعی اسپرینگی استفاده می شود.
 *
 * spring-boot-starter-jta-atomikos:
 * It is used for JTA transactions using Atomikos.
 * برای معاملات JTA با استفاده از Atomikos استفاده می شود.
 *
 * spring-boot-starter-security:
 * It is used for Spring Security.
 * این برای امنیت اسپرینگ استفاده می شود.
 *
 * spring-boot-starter-mustache:
 * It is used for building MVC web applications using Mustache views.
 * برای ساخت برنامه های وب MVC با استفاده از نمایش های Mustache استفاده می شود.
 *
 * spring-boot-starter-data-jpa:
 * It is used for Spring Data JPA with Hibernate.
 * این مورد برای Spring Data JPA با Hibernate استفاده می شود.
 *
 * spring-boot-starter:
 * It is used for core starter, including auto-configuration support, logging, and YAML.
 * این برای استارت هسته استفاده می شود ، از جمله پشتیبانی پیکربندی خودکار ، ورود به سیستم و YAML.
 *
 * spring-boot-starter-groovy-templates:
 * It is used for building MVC web applications using Groovy Template views.
 * برای ساخت برنامه های وب MVC با استفاده از نماهای Groovy Temple استفاده می شود.
 *
 * spring-boot-starter-freemarker:
 * It is used for building MVC web applications using FreeMarker views.
 * برای ساخت برنامه های وب MVC با استفاده از نمایش FreeMarker استفاده می شود.
 *
 * spring-boot-starter-batch:
 * It is used for Spring Batch.
 * این برای دسته های اسپرینگ استفاده می شود.
 *
 * spring-boot-starter-social-linkedin:
 * It is used for Spring Social LinkedIn.
 * این برای اسپرینگ اجتماعی LinkedIn استفاده می شود.
 *
 * spring-boot-starter-cache:
 * It is used for Spring Framework's caching support.
 * این برای پشتیبانی از ذخیره سازی Spring Framework استفاده می شود.
 *
 * spring-boot-starter-data-solr:
 * It is used for the Apache Solr search platform with Spring Data Solr.
 * این برای بستر جستجوی Apache Solr با Spring Data Solr استفاده می شود.
 *
 * spring-boot-starter-data-mongodb:
 * It is used for MongoDB document-oriented database and Spring Data MongoDB.
 * این برای پایگاه داده های مستند MongoDB و Spring Data MongoDB استفاده می شود.
 *
 * spring-boot-starter-jooq:
 * It is used for jOOQ to access SQL databases. An alternative to spring-boot-starter-data-jpa or spring-boot-starter-jdbc.
 * برای دسترسی به پایگاه داده های SQL از jOOQ استفاده می شود. جایگزینی برای اسپرینگ-boot-starter-data-jpa یا Spring-boot-starter-jdbc.
 *
 * spring-boot-starter-jta-narayana:
 * It is used for Spring Boot Narayana JTA Starter.
 * از آن برای Spring Boot Narayana JTA Starter استفاده می شود.
 *
 * spring-boot-starter-cloud-connectors:
 * It is used for Spring Cloud Connectors that simplifies connecting to services in cloud platforms like Cloud Foundry and Heroku.
 * این برای اتصالات اسپرینگ ابر استفاده می شود که اتصال به سرویس ها در سیستم عامل های ابری مانند Cloud Foundry و Heroku را ساده می کند.
 *
 * spring-boot-starter-jta-bitronix:
 * It is used for JTA transactions using Bitronix.
 * این برای معاملات JTA با استفاده از Bitronix استفاده می شود.
 *
 * spring-boot-starter-social-twitter:
 * It is used for Spring Social Twitter.
 * این برای توییتر اجتماعی اسپرینگی استفاده می شود.
 *
 * spring-boot-starter-data-rest:
 * It is used for exposing Spring Data repositories over REST using Spring Data REST.
 * از آن برای افشای مخازن داده اسپرینگ در طول REST با استفاده از Spring Data REST استفاده می شود.
 *
 *
 * Spring Boot Production Starters:
 * spring-boot-starter-actuator:
 * It is used for Spring Boot's Actuator that provides production-ready features to help you monitor and manage your application.
 * از آن برای محرک Spring Spring Boot's استفاده می شود که ویژگی های آماده تولید را در اختیار شما قرار می دهد تا به شما در نظارت و مدیریت برنامه خود کمک کند.
 *
 * spring-boot-starter-remote-shell:
 * It is used for the CRaSH remote shell to monitor and manage your application over SSH. Deprecated since 1.5.
 *این برای پوسته از راه دور CRaSH استفاده می شود تا برنامه خود را بر SSH نظارت و مدیریت کند. از 1.5 کاهش یافته است
 *
 * Spring Boot Technical Starters:
 * spring-boot-starter-undertow:
 * It is used for Undertow as the embedded servlet container. An alternative to spring-boot-starter-tomcat.
 * از آن برای Undertow به عنوان ظرف سرویس servlet تعبیه شده استفاده می شود. جایگزینی برای spring-boot-starter-tomcat.
 *
 * spring-boot-starter-jetty:
 * It is used for Jetty as the embedded servlet container. An alternative to spring-boot-starter-tomcat.
 * از آن برای Jetty به عنوان ظرف سرویس servated تعبیه شده استفاده می شود. جایگزینی برای spring-boot-starter-tomcat.
 *
 * spring-boot-starter-logging:
 * It is used for logging using Logback. Default logging starter.
 * این برای ورود به سیستم با استفاده از Logback استفاده می شود. استارت پیش فرض ورود به سیستم.
 *
 * spring-boot-starter-tomcat:
 * It is used for Tomcat as the embedded servlet container. Default servlet container starter used by spring-boot-starter-web.
 * این ماده برای Tomcat به عنوان ظرف سروی تعبیه شده استفاده می شود. پیش فرض ظروف سرویس پیش فرض استفاده شده توسط spring-boot-starter-web.
 *
 * spring-boot-starter-log4j2:
 * It is used for Log4j2 for logging. An alternative to spring-boot-starter-logging.
 * این برای Log4j2 برای ورود به سیستم استفاده می شود. جایگزینی برای spring-boot-starter-logging.
 */
public class SpringBootStarters {
}
