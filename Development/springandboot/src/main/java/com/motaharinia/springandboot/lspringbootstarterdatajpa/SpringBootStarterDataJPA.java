package com.motaharinia.springandboot.lspringbootstarterdatajpa;

/**
 *
 * Spring Data JPA:
 * Spring Data is a high-level Spring Source project.
 * Its purpose is to unify and easy access to the different kinds of persistence stores, both relational database systems, and NoSQL data stores.
 * When we implement a new application, we should focus on the business logic instead of technical complexity and boilerplate code.
 * That's why the Java Persistent API (JPA) specification and Spring Data JPA are extremely popular.
 * Spring Data JPA adds a layer on the top of JPA.
 * It means, Spring Data JPA uses all features defined by JPA specification, especially the entity, association mappings, and JPA's query capabilities.
 * Spring Data JPA adds its own features such as the no-code implementation of the repository pattern and the creation of database queries from the method name.
 *Spring Data JPA:
 * یک Spring Data یک پروژه Spring Source سطح بالا است.
 * هدف آن اتحاد و دسترسی آسان به انواع مختلف ریپازیتوری ماندگار ، هر دو سیستم پایگاه داده رابطه و ریپازیتوری داده NoSQL است.
 * هنگامی که ما یک برنامه جدید را پیاده سازی می کنیم ، باید به جای پیچیدگی فنی و کد بویلر ، روی منطق تجارت تمرکز کنیم.
 * به همین دلیل مشخصات Java persistent API (JPA) و Spring Data JPA بسیار محبوب هستند.
 * یک Spring Data JPA لایه ای در بالای JPA اضافه می کند.
 * این بدان معناست ، Spring Data JPA از تمام ویژگیهای تعریف شده با مشخصات JPA ، به ویژه entity ، نگاشتهای انجمن و قابلیت های پرس و جو JPA استفاده می کند.
 * یک Spring Data JPA ویژگی های خاص خود را مانند پیاده سازی no-code از الگوی ریپازیتوری و ایجاد پرس و جوهای پایگاه داده از نام متد اضافه می کند.
 *
 * Spring Data JPA:
 * Spring Data JPA handles most of the complexity of JDBC-based database access and ORM (Object Relational Mapping).
 * It reduces the boilerplate code required by JPA.
 * It makes the implementation of your persistence layer easier and faster.
 * Spring Data JPA aims to improve the implementation of data access layers by reducing the effort to the amount that is needed.
 * Spring Data JPA:
 * یک Spring Data JPA بیشتر پیچیدگی دسترسی به بانک اطلاعاتی مبتنی بر JDBC و ORM (نگاشت رابطه ای شی) را در اختیار دارد.
 * این کد بویلر مورد نیاز JPA را کاهش می دهد.
 * اجرای لایه ماندگاری شما را آسانتر و سریعتر می کند.
 * یک Spring Data JPA با هدف كاهش تلاش در میزان مورد نیاز ، اجرای لایه های دسترسی به داده را بهبود می بخشد.
 *
 * Spring Data JPA Features:
 * There are three main features of Spring Data JPA are as follows:
 * 1. No-code repository:
 * It is the most popular persistence-related pattern.
 * It enables us to implement our business code on a higher abstraction level.
 * 2. Reduced boilerplate code:
 * It provides the default implementation for each method by its repository interfaces.
 * It means that there is no longer need to implement read and write operations.
 * 3. Generated Queries:
 * Another feature of Spring Data JPA is the generation of database queries based on the method name.
 * If the query is not too complex, we need to define a method on our repository interface with the name that starts with findBy.
 * After defining the method, Spring parses the method name and creates a query for it.
 * For example:
 * ویژگی های Spring Data JPA:
 * سه ویژگی اصلی از Spring Data JPA به شرح زیر است:
 * 1. ریپازیتوری بدون کد:
 * این محبوب ترین الگوی مرتبط با پایداری است.
 * این امکان را برای ما فراهم می کند تا کد تجاری خود را در سطح انتزاعی بالاتر پیاده سازی کنیم.
 * 2. کاهش کد تکراری اضافی:
 * این پیاده سازی پیش فرض برای هر روش توسط رابط های ریپازیتوری آن را فراهم می کند.
 * این بدان معناست که دیگر نیازی به اجرای عملیات خواندن و نوشتن نیست.
 * 3.کوئری های ایجاد شده:
 * یکی دیگر از ویژگی های Spring Data JPA ، تولید نمایش داده های پایگاه داده بر اساس نام متد است.
 * اگر پرس و جو خیلی پیچیده نیست ، ما باید متدی را در رابط ریپازیتوری خود با نامی که با findBy شروع می شود تعریف کنیم.
 * اسپرینگ پس از تعریف متد ، نام متد را تجزیه کرده و یک پرس و جو برای آن ایجاد می کند.
 * مثلا:
 *
 * public interface EmployeeRepository extends CrudRepository<Employee, Long>{
 * Employee findByName(String name);
 * }
 *
 * In the above example, we extend the CrudRepository that uses two generics: Employee and Long.
 * The Employee is the entity that is to be managed, and Long is the data type of primary key
 * Spring internally generates a JPQL (Java Persistence Query Language) query based on the method name.
 * The query is derived from the method signature.
 * It sets the bind parameter value, execute the query, and returns the result.
 * در مثال بالا ، CrudRepository را گسترش می دهیم که از دو ژنریک استفاده می کند: Employee و Long.
 * یک Employee موجودی است که باید مدیریت شود و Long نوع داده اصلی کلید است
 * اسپرینگ به صورت داخلی یک query JPQL (Java persistence Query Language) را بر اساس نام متد تولید می کند.
 * پرس و جو از امضای متد گرفته شده است.
 * مقدار پارامتر bind را تعیین می کند ، query را اجرا می کند و نتیجه را برمی گرداند.
 *
 * There are some other features are as follows:
 * 1. It can integrate custom repository code.
 * 2. It is a powerful repository and custom object-mapping abstraction.
 * 3. It supports transparent auditing.
 * 4. It implements a domain base class that provides basic properties.
 * 5. It supports several modules such as Spring Data JPA, Spring Data MongoDB, Spring Data REST, Spring Data Cassandra, etc.
 * برخی از ویژگی های دیگر به شرح زیر است:
 * 1. این می تواند کد ریپازیتوری سفارشی ادغام شود.
 * 2. این یک ریپازیتوری قدرتمند و انتزاع نقشه برداری شیء است.
 * 3. از حسابرسی شفاف پشتیبانی می کند.
 * 4- این کلاس بر پایه دامنه را پیاده سازی می کند که خصوصیات اساسی را ارائه می دهد.
 * 5- از چندین ماژول مانند Spring Data JPA ، Spring Data MongoDB ، Spring Data REST ، Spring Data Cassandra و غیره پشتیبانی می کند.
 *
 * Spring Data Repository:
 * Spring Data JPA provides three repositories are as follows:
 * 1. CrudRepository:
 * It offers standard create, read, update, and delete It contains method like findOne(), findAll(), save(), delete(), etc.
 * 2. PagingAndSortingRepository:
 * It extends the CrudRepository and adds the findAll methods. It allows us to sort and retrieve the data in a paginated way.
 * 3. JpaRepository:
 * It is a JPA specific repository It is defined in Spring Data Jpa. It extends the both repository CrudRepository and PagingAndSortingRepository.
 * It adds the JPA-specific methods, like flush() to trigger a flush on the persistence context.
 *ریپازیتوری داده اسپرینگ:
 * یک Spring Data JPA سه ریپازیتوری به شرح زیر را فراهم میکند:
 * 1. CrudRepository:
 * ایجاد ، خواندن ، به روزرسانی و حذف استاندارد را ارائه می دهد. این شامل متدهایی مانند findOne, findAll, save, delete و غیره است.
 * 2. PagingAndSortingRepository:
 * یک CrudRepository را گسترش می دهد و روش های findAll را اضافه می کند. این امکان را به ما می دهد تا داده ها را به صورت مرتب سازی شده و صفحه بندی شده بازیابی کنیم.
 * 3. JpaRepository:
 * این یک ریپازیتوری اختصاصی JPA است که در Spring Data Jpa تعریف شده است. این هر دو ریپازیتوری CrudRepository و PagingAndSortingRepository را گسترش می دهد.
 * این متد های اختصاصی JPA ، مانند flush را برای فراخوانی یک flush در کانتکست persistence اضافه می کند
 *
 * <dependency>
 * <groupId>org.springframework.data</groupId>
 * <artifactId>spring-data-jpa</artifactId>
 * <version>2.2.3.RELEASE</version>
 * </dependency>
 *
 * Spring Boot Starter Data JPA:
 * Spring Boot provides spring-boot-starter-data-jpa dependency to connect Spring application with relational database efficiently.
 * The spring-boot-starter-data-jpa internally uses the spring-boot-jpa dependency (since Spring Boot version 1.5.3).
 * Spring Boot Starter Data JPA:
 * اسپرینگ بوت وابستگی spring-boot-starter-data-jpa را برای شما فراهم می کند تا بتواند برنامه اسپرینگی را با بانک اطلاعاتی رابطه ای به طور موثر متصل کند.
 * این  spring-boot-starter-data-jpa به صورت داخلی از وابستگی spring-boot-jpa استفاده می کند (از نسخه Boot Spring نسخه 1.5.3).
 *
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-starter-data-jpa</artifactId>
 * <version>2.2.2.RELEASE</version>
 * </dependency>
 *
 * The databases are designed with tables/relations.
 * Earlier approaches (JDBC) involved writing SQL queries.
 * In the JPA, we will store the data from objects into table and vice-versa.
 * However, JPA evolved as a result of a different thought process.
 * Before JPA, ORM was the term more commonly used to refer to these frameworks.
 * It is the reason Hibernate is called the ORM framework.
 * JPA allows us to map application classes to table in the database.
 * 1. Entity Manager:
 * Once we define the mapping, it handles all the interactions with the database.
 * 2. JPQL (Java Persistence Query Language):
 * It provides a way to write queries to execute searches against entities. It is different from the SQL queries.
 * JPQL queries already understand the mapping that is defined between entities. We can add additional conditions if required.
 * 3. Criteria API:
 * It defines a Java-based API to execute searches against the database.
 * دیتابیس ها با جداول / روابط طراحی شده اند.
 * رویکردهای اولیه (JDBC) شامل نوشتن کوئری های SQL بود.
 * در JPA ، داده ها را از اشیاء در جدول و برعکس ذخیره می کنیم.
 * با این حال ، JPA در نتیجه یک فرآیند تفکر متفاوت تحول یافت.
 * قبل از JPA ، ORM اصطلاحی بود که بیشتر برای مراجعه به این چهارچوبها به کار می رفت.
 * به همین دلیل Hibernate چارچوب ORM خوانده می شود.
 * یک JPA به ما امکان می دهد کلاس های برنامه را به صورت جدول بندی در پایگاه داده ترسیم کنیم.
 * 1. Entity Manager:
 * هنگامی که نگاشت را تعریف می کنیم ، همه تعامل با بانک اطلاعات را کنترل می کند.
 * 2. JPQL (زبان پرس و جو ماندگاری جاوا):
 * این راهی برای نوشتن کوئری برای انجام جستجوها بر روی انتیتی ها را فراهم می کند. این با کوئری های SQL متفاوت است.
 * کوئری های JPQL در حال حاضر نگاشتی که بین انتیتی ها تعریف شده است را درک می کند. در صورت لزوم می توانیم شرایط اضافی اضافه کنیم.
 * 3. Criteria API:
 * این یک API مبتنی بر جاوا را برای انجام جستجوها در برابر پایگاه داده تعریف می کند.
 *
 *
 * Hibernate vs. JPA:
 * Hibernate is the implementation of JPA.
 * It is the most popular ORM framework, while JPA is an API that defines the specification.
 * Hibernate understands the mapping that we add between objects and tables.
 * It ensures that data is retrieved/ stored from the database based on the mapping.
 * It also provides additional features on the top of the JPA.
 * Hibernate در مقابل JPA:
 * یک Hibernate پیاده سازی JPA است.
 * این محبوب ترین چارچوب ORM است ، در حالی که JPA یک API است که مشخصات را تعریف می کند.
 * یک Hibernate نگاشت را که ما بین اشیاء و جداول اضافه می کنیم درک می کند.
 * این اطمینان را می دهد که داده ها بر اساس نگاشت از داده ها از پایگاه داده بازیابی و ذخیره می شوند.
 * همچنین ویژگی های دیگری را در بالای JPA ارائه می دهد.
 * 
 *
 * Spring Boot JPA Example:
 * In this example, we will use spring-boot-starter-data-jpa dependency to create a connection with the H2 database.
 * Step 1:
 * Open spring Initializr https://start.spring.io/.
 * Step 2:
 * Provide the Group name. We have provided com.javatpoint.
 * Step 3:
 * Provide the Artifact Id. We have provided spring-boot-jpa-example.
 * Step 4:
 * Add the dependencies: Spring Web, Spring Data JPA, and H2 Database.
 * Step 5:
 * Click on the Generate button.
 * When we click on the Generate button, it wraps the project in Jar file and downloads it to the local system.
 * Step 6:
 * Extract the Jar file and paste it into the STS workspace.
 * Step 7:
 * Import the project folder into STS.
 * File -> Import -> Existing Maven Projects -> Browse -> Select the folder spring-boot-jpa-example -> Finish
 * It takes some time to import.
 * Step 8:
 * Create a package with the name com.javatpoint.controller in the folder src/main/java.
 * Step 9:
 * Create a Controller class with the name ControllerDemo in the package com.javatpoint.controller.
 * Step 10:
 * Create another package with the name com.javatpoint.model in the folder src/main/java.
 * Step 11:
 * Create a class with the name User in the package com.javatpoint.model.
 * Now we need to Configure the H2 database.
 * Step 12:
 * Open the application.properties file and configure the following things: port, enable the H2 console, datasource, and URL.
 *
 * application.properties:
 * server.port=8085
 * spring.h2.console.enabled=true
 * spring.datasource.plateform=h2
 * spring.datasource.url=jdbc:h2:mem:javatpoint
 *
 * Step 13:
 * Create a SQL file in the folder src/main/resources.
 * Right-click on the folder src/main/resources -> New -> File -> Provide the File name -> Finish
 * We have provided the file name data.sql and insert the following data into it.
 *
 * data.sql:
 * insert into userdata values(101,'Tom');
 * insert into userdata values(102,'Andrew');
 * insert into userdata values(103,'Tony');
 * insert into userdata values(104,'Bob');
 * insert into userdata values(105,'Sam');
 *
 * Step 14:
 * Create a folder with the name webapp in the src folder.
 * Step 15:
 * Create a JSP file with the name that we have returned in the ControllerDemo.
 * In the ControllerDemo.java, we have returned home.jsp.
 * Step 16:
 * Run the SpringBootJpaExampleApplication.java file.
 * We can see in the console that our application is successfully running on port 8085.
 * Step 17:
 * Open the browser and invoke the URL http://localhost:8085/h2-console/.
 * It shows the Driver Class, JDBC URL that we have configured in the application.properties file, and the default User Name sa.
 * We can also test the connection by clicking on the Test Connection button.
 * If the connection is successful, it shows a message Test Successful.
 * Step 18:
 * Click on the Connect button. It shows the structure of the table userdata that we have defined in the User.java.
 * Step 19:
 * Execute the following query to see the data that we have inserted in the data.sql file.
 * SELECT * FROM USERDATA;
 */
public class SpringBootStarterDataJPA {
}
