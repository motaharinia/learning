package com.motaharinia.springandboot.fspringbootannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * https://www.javatpoint.com/spring-boot-annotations
 * <p>
 * Spring Boot Annotations:
 * Spring Boot Annotations is a form of metadata that provides data about a program.
 * In other words, annotations are used to provide supplemental information about a program.
 * It is not a part of the application that we develop.
 * It does not have a direct effect on the operation of the code they annotate.
 * It does not change the action of the compiled program.
 * In this section, we are going to discuss some important Spring Boot Annotation that we will use later in this tutorial.
 * انوتیشن Spring Boot:
 * اسپرینگ Boot Annotations نوعی ابرداده است که داده های مربوط به یک برنامه را ارائه می دهد.
 * به عبارت دیگر ، انوتیشن برای ارائه اطلاعات تکمیلی در مورد یک برنامه استفاده می شود.
 * این بخشی از برنامه ای نیست که ما توسعه می دهیم.
 * این تأثیر مستقیمی بر عملکرد کدی که انوتیشن روی آن است ندارد.
 * عملکرد برنامه کامپایل شده را تغییر نمی دهد.
 * در این بخش ، ما در مورد برخی از مهمترین انوتیشن چکمه های اسپرینگ که در ادامه در این آموزش استفاده خواهیم کرد ، بحث خواهیم کرد.
 *
 * Core Spring Framework Annotations:
 * @Required:
 * It applies to the bean setter method.
 * It indicates that the annotated bean must be populated at configuration time with the required property, else it throws an exception BeanInitilizationException.
 * @Autowired:
 * Spring provides annotation-based auto-wiring by providing @Autowired annotation.
 * It is used to autowire spring bean on setter methods, instance variable, and constructor.
 * When we use @Autowired annotation, the spring container auto-wires the bean by matching data-type.
 * @Configuration:
 * It is a class-level annotation.
 * The class annotated with @Configuration used by Spring Containers as a source of bean definitions.
 * @ComponentScan:
 * It is used when we want to scan a package for beans.
 * It is used with the annotation @Configuration.
 * We can also specify the base packages to scan for Spring Components.
 * @Bean:
 * It is a method-level annotation. It is an alternative of XML <bean> tag. It tells the method to produce a bean to be managed by Spring Container.
 * انوتیشن های فریمورک اسپرینگ هسته:
 * @Required :
 * این متد در مورد متد تنظیم کننده بین صدق می کند.
 * این نشان می دهد که بین ها حاشیه نشین باید در زمان پیکربندی با خاصیت لازم جمع شود ، در غیر این صورت استثنا BeanInitilizationException را پرتاب می کند.
 * @Autowired :
 * اسپرینگ با ارائه انوتیشنAutowired ، سیم کشی مبتنی بر انوتیشن را فراهم می کند.
 * از آن برای تأمین نیرو بین اسپرینگی در متد های تنظیم کننده ، متغیر نمونه و سازنده استفاده می شود.
 * هنگامی که از انوتیشنAutowired استفاده می کنیم ، ظروف اسپرینگ خودکار با مطابقت نوع داده ، بین را سیم می کند.
 * @Configuration :
 * این یک انوتیشن سطح کلاس است.
 * این کلاس باConfiguration که توسط Spring Containers بعنوان منبع تعاریف بین استفاده می شود ، انوتیشن شده است.
 * @ComponentScan :
 * این مورد زمانی استفاده می شود که می خواهیم پکیجهاای بین را اسکن کنیم.
 * این با انوتیشنConfiguration استفاده می شود.
 * ما همچنین می توانیم بسته های پایه را برای اسکن Spring Component مشخص کنیم.
 * @Bean :
 * این یک انوتیشن در سطح متد است. این یک جایگزین از برچسب XML  bean  است. این متد را برای تولید بین برای مدیریت توسط Spring Container می گوید.
 *
 * Spring Framework Stereotype Annotations:
 * @Component:
 * It is a class-level annotation. It is used to mark a Java class as a bean.
 * A Java class annotated with @Component is found during the classpath.
 * The Spring Framework pick it up and configure it in the application context as a Spring Bean.
 * @Controller:
 * The @Controller is a class-level annotation.
 * It is a specialization of @Component. It marks a class as a web request handler.
 * It is often used to serve web pages.
 * By default, it returns a string that indicates which route to redirect.
 * It is mostly used with @RequestMapping annotation.
 * @Service:
 * It is also used at class level.
 * It tells the Spring that class contains the business logic.
 * @Repository:
 * It is a class-level annotation.
 * The repository is a DAOs (Data Access Object) that access the database directly.
 * The repository does all the operations related to the database.
 * انوتیشن های Stereotype فریمورک اسپرینگ:
 * @Component :
 * این یک انوتیشن سطح کلاس است. از آن برای علامت گذاری یک کلاس جاوا به عنوان بین استفاده می شود.
 * یک کلاس جاوا که با @ Component انوتیشن شده است در طول مسیر کلاس پیدا می شود.
 * چارچوب اسپرینگ آن را انتخاب کرده و آن را در متن برنامه به عنوان یک بین اسپرینگ پیکربندی میکند.
 * @Controller :
 * Controller انوتیشن در سطح کلاس است.
 * این یک تخصص از @ Component است. این کلاس را به عنوان یک کنترل کننده درخواست وب علامت گذاری می کند.
 * اغلب برای سرویس دهی به صفحات وب استفاده می شود.
 * به طور پیش فرض ، رشته ای را نشان می دهد که مشخص می کند کدام مسیر برای تغییر مسیر است.
 * بیشتر با انوتیشنRequestMapping استفاده می شود.
 * @Service :
 * همچنین در سطح کلاس استفاده می شود.
 * این اسپرینگ می گوید کلاس شامل منطق تجارت است.
 * @Repository :
 * این یک انوتیشن سطح کلاس است.
 * مخزن DAOs (Data Access Object) است که مستقیماً به پایگاه داده دسترسی پیدا می کند.
 * مخزن کلیه عملیات مربوط به پایگاه داده را انجام می دهد.
 *
 * Spring Boot Annotations:
 * @EnableAutoConfiguration:
 * It auto-configures the bean that is present in the classpath and configures it to run the methods.
 * The use of this annotation is reduced in Spring Boot 1.2.0 release because developers provided an alternative of the annotation, i.e. @SpringBootApplication.
 * @SpringBootApplication:
 * It is a combination of three annotations @EnableAutoConfiguration, @ComponentScan, and @Configuration.
 * انوتیشن اسپرینگ چکمه:
 * @EnableAutoConfiguration :
 * این بین موجود در کلاس را بطور خودکار پیکربندی می کند و آن را برای اجرای متد ها پیکربندی می کند.
 * استفاده از این انوتیشن در نسخه Spring Boot 1.2.0 کاهش می یابد زیرا توسعه دهندگان جایگزینی از انوتیشن ، یعنیSpringBootApplication را ارائه می دهند.
 * @SpringBootApplication :
 * این ترکیبی از سه انوتیشنEnableAutoConfiguration ، @ ComponentScan وConfiguration است.
 *
 * Spring MVC and REST Annotations:
 * @RequestMapping:
 * It is used to map the web requests.
 * It has many optional elements like consumes, header, method, name, params, path, produces, and value.
 * We use it with the class as well as the method.
 * @GetMapping:
 * It maps the HTTP GET requests on the specific handler method.
 * It is used to create a web service endpoint that fetches It is used instead of using: @RequestMapping(method = RequestMethod.GET)
 * @PostMapping:
 * It maps the HTTP POST requests on the specific handler method.
 * It is used to create a web service endpoint that creates It is used instead of using: @RequestMapping(method = RequestMethod.POST)
 * @PutMapping:
 * It maps the HTTP PUT requests on the specific handler method.
 * It is used to create a web service endpoint that creates or updates It is used instead of using: @RequestMapping(method = RequestMethod.PUT)
 * @DeleteMapping:
 * It maps the HTTP DELETE requests on the specific handler method.
 * It is used to create a web service endpoint that deletes a resource.
 * It is used instead of using: @RequestMapping(method = RequestMethod.DELETE)
 * @PatchMapping:
 * It maps the HTTP PATCH requests on the specific handler method.
 * It is used instead of using: @RequestMapping(method = RequestMethod.PATCH)
 * @RequestBody:
 * It is used to bind HTTP request with an object in a method parameter. Internally it uses HTTP MessageConverters to convert the body of the request.
 * When we annotate a method parameter with @RequestBody, the Spring framework binds the incoming HTTP request body to that parameter.
 * @ResponseBody:
 * It binds the method return value to the response body.
 * It tells the Spring Boot Framework to serialize a return an object into JSON and XML format.
 * @PathVariable:
 * It is used to extract the values from the URI.
 * It is most suitable for the RESTful web service, where the URL contains a path variable.
 * We can define multiple @PathVariable in a method.
 * @RequestParam:
 * It is used to extract the query parameters form the URL.
 * It is also known as a query parameter. It is most suitable for web applications.
 * It can specify default values if the query parameter is not present in the URL.
 * @RequestHeader:
 * It is used to get the details about the HTTP request headers.
 * We use this annotation as a method parameter.
 * The optional elements of the annotation are name, required, value, defaultValue.
 * For each detail in the header, we should specify separate annotations. We can use it multiple time in a method
 * @RestController:
 * It can be considered as a combination of @Controller and @ResponseBody annotations.
 * The @RestController annotation is itself annotated with the @ResponseBody annotation.
 * It eliminates the need for annotating each method with @ResponseBody.
 * @RequestAttribute:
 * It binds a method parameter to request attribute.
 * It provides convenient access to the request attributes from a controller method.
 * With the help of @RequestAttribute annotation, we can access objects that are populated on the server-side.
 * انوتیشن های اسپرینگ MVC و REST:
 * @RequestMapping :
 * برای نقشه برداری از درخواست های وب استفاده می شود.
 * این عنصر عناصر اختیاری زیادی مانند consumes, header, method, name, params, path, produces, and value دارد.
 * ما آن را با کلاس و همچنین متد استفاده می کنیم.
 * @GetMapping :
 * این درخواست های HTTP GET را به متد کنترل کننده خاص نقشه برداری می کند.
 * برای ایجاد یک نقطه پایانی سرویس وب استفاده می شود که به جای استفاده از آن استفاده می شود:RequestMapping (متد = RequestMethod.GET)
 * @PostMapping :
 * این درخواست های HTTP POST را به متد کنترل کننده خاص نقشه برداری می کند.
 * از آن برای ایجاد یک نقطه پایانی سرویس وب استفاده می شود که ایجاد می کند به جای استفاده از آن استفاده می شود:RequestMapping (متد = RequestMethod.POST)
 * @PutMapping :
 * این درخواست های HTTP PUT را به متد کنترل کننده خاص نقشه برداری می کند.
 * برای ایجاد یک نقطه پایانی سرویس وب استفاده می شود که ایجاد یا به روزرسانی می کند و به جای استفاده از آن استفاده می شود:RequestMapping (متد = RequestMethod.PUT)
 * @DeleteMapping :
 * این برنامه درخواست HTTP DELETE را به متد کنترل کننده خاص نقشه می کند.
 * از آن برای ایجاد یک نقطه پایانی سرویس وب استفاده می شود که منبع را حذف می کند.
 * به جای استفاده از آن استفاده می شود:RequestMapping (متد = RequestMethod.DELETE)
 * @PatchMapping :
 * این درخواست های HTTP PATCH را به متد کنترل کننده خاص نقشه برداری می کند.
 * به جای استفاده از آن استفاده می شود:RequestMapping (متد = RequestMethod.PATCH)
 * @RequestBody :
 * از آن برای پیوند دادن درخواست HTTP با یک شی در پارامتر متد استفاده می شود. در داخل آن از HTTP MessageConverters برای تبدیل بدنه درخواست استفاده می کند.
 * هنگامی که یک پارامتر متد را باRequestBody انوتیشن می کنیم ، چارچوب Spring بدنه درخواست HTTP ورودی را به آن پارامتر متصل می کند.
 * @ResponseBody :
 * مقدار برگشتی متد را به بدن پاسخ می دهد.
 * این به فریم ورک Spring Boot می گوید تا یک شیء را به فرمت JSON و XML سریالی سازی کند.
 * @PathVariable :
 * برای استخراج مقادیر از URI استفاده می شود.
 * این سرویس برای سرویس وب RESTful مناسب است ، جایی که URL شامل یک متغیر مسیر است.
 * ما می توانیم چند متدPathVariable را با متدی تعریف کنیم.
 * @RequestParam :
 * برای استخراج پارامترهای پرس و جو از URL استفاده می شود.
 * همچنین به عنوان یک پارامتر query شناخته می شود. این مناسب برای برنامه های وب است.
 * اگر پارامتر query در URL موجود نباشد می تواند مقادیر پیش فرض را مشخص کند.
 * @RequestHeader :
 * برای بدست آوردن جزئیات در مورد هدرهای درخواست HTTP استفاده می شود.
 * ما از این انوتیشن به عنوان یک پارامتر متد استفاده می کنیم.
 * عناصر اختیاری انوتیشن نام ، ضروری ، ارزش ، پیش فرض Value است.
 * برای هر جزئیات موجود در عنوان باید انوتیشن جداگانه را مشخص کنیم. می توانیم از یک متد چند بار استفاده کنیم
 * @RestController :
 * این می تواند به عنوان ترکیبی از انوتیشنهایController وResponseBody در نظر گرفته شود.
 * انوتیشنRestController با انوتیشنResponseBody همراه است.
 * این نیاز به انوتیشن هر متد را باResponseBody از بین می برد.
 * @RequestAttribute :
 * این یک پارامتر متد را برای درخواست ویژگی متصل می کند.
 * دسترسی راحت به ویژگی های درخواست از یک متد کنترل کننده را فراهم می کند.
 * با کمک انوتیشنRequestAttribute ، می توانیم به اشیایی که در سمت سرور جمع شده اند دسترسی پیدا کنیم.
 */
public class SpringBootAnnotations {
    @Autowired
    Customer customer;

    private Integer cost;

    @Required
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getCost() {
        return cost;
    }
}

