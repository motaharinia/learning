package com.motaharinia.springandboot.qspringbootpackaging;

/**
 * https://www.javatpoint.com/spring-boot-packaging
 *
 *Spring Boot Packaging:
 * In the J2EE application, modules are packed as JAR, WAR, and EAR.
 * It is the compressed file formats that is used in the J2EE.
 * J2EE defines three types of archives:
 * بسته بندی اسپرینگ بوت:
 * در برنامه J2EE ماژول های JAR ، WAR و EAR بسته بندی شده اند.
 * این فرمت های فایل فشرده شده است که در J2EE استفاده می شود.
 * یک J2EE سه نوع بایگانی را تعریف می کند:
 * WAR
 * JAR
 * EAR
 *
 *
 * WAR:
 * WAR stands for Web Archive. WAR file represents the web application.
 * Web module contains servlet classes, JSP files, HTML files, JavaScripts, etc. are packaged as a JAR file with .war extension.
 * It contains a special directory called WEB-INF.
 * WAR is a module that loads into a web container of the Java Application Server.
 * The Java Application Server has two containers: Web Container and EJB Container.
 * The Web Container hosts the web applications based on Servlet API and JSP.
 * The web container requires the web module to be packaged as a WAR file.
 * It is a WAR file special JAR file that contains a web.xmlv file in the WEB-INF folder.
 * An EJB Container hosts Enterprise Java beans based on EJB API.
 * It requires EJB modules to be packaged as a JAR file.
 * It contains an ejb-jar.xml file in the META-INF folder.
 * The advantage of the WAR file is that it can be deployed easily on the client machine in a Web server environment.
 * To execute a WAR file, a Web server or Web container is required.
 * For example, Tomcat, Weblogic, and Websphere.
 *یک WAR مخفف Web Archive است. پرونده WAR برنامه وب را نشان می دهد.
 * ماژول وب شامل کلاسهای سرویس ، فایلهای JSP ، فایلهای HTML ، JavaScriptts و غیره به صورت فایل JAR با پسوند .war بسته بندی شده است.
 * این شامل یک فهرست ویژه به نام WEB-INF است.
 * یک WAR ماژولی است که در یک ظرف وب از سرور برنامه جاوا بارگیری می شود.
 * یک Java Application Server دارای دو ظرف است: Web Container و EJB Container.
 * یک Web Container بر اساس Servlet API و JSP میزبان برنامه های وب است.
 * ظرف وب نیاز دارد که ماژول وب به عنوان یک پرونده WAR بسته بندی شود.
 * این یک پرونده ویژه JAR برای فایل WAR است که حاوی یک پرونده web.xml در پوشه WEB-INF است.
 * ظروف EJB میزبان بین های Enterprise Java بر اساس API EJB است.
 * به ماژول های EJB نیاز است که به عنوان یک پرونده JAR بسته بندی شوند.
 * حاوی پرونده ejb-jar.xml در پوشه META-INF.
 * مزیت فایل WAR این است که می توان آن را به راحتی در محیط سرویس دهنده در محیط وب سرور مستقر کرد.
 * برای اجرای یک پرونده WAR ، یک سرور وب یا یک کانتینر وب لازم است.
 * به عنوان مثال ، Tomcat ، Weblogic و Websphere
 *
 * JAR:
 * JAR stands for Java Archive.
 * An EJB (Enterprise Java Beans) module that contains bean files (class files), a manifest, and EJB deployment descriptor (XML file) are packaged as JAR files with the extension .jar.
 * It is used by software developers to distribute Java classes and various metadata.
 * In other words, A file that encapsulates one or more Java classes, a manifest, and descriptor is called JAR file.
 * It is the lowest level of the archive.
 * It is used in J2EE for packaging EJB and client-side Java Applications.
 * It makes the deployment easy.
 *یک JAR مخفف Java Archive است.
 * یک ماژول EJB (Enterprise Java Beans) که حاوی پرونده های بین (فایل های کلاس) ، یک مانیفست و توصیف استقرار EJB (پرونده XML) به صورت پرونده های JAR با پسوند .jar بسته بندی شده است.
 * این توسط توسعه دهندگان نرم افزار برای توزیع کلاس های جاوا و ابرداده های مختلف استفاده می شود.
 * به عبارت دیگر ، پرونده ای که یک یا چند کلاس جاوا ، یک مانیفست و توصیف کننده را در خود محصور می کند ، پرونده JAR نام دارد.
 * این پایین ترین سطح بایگانی است.
 * این در J2EE برای بسته بندی EJB و برنامه های جاوا در سمت مشتری استفاده می شود.
 * استقرار را آسان می کند
 *
 * EAR:
 * EAR stands for Enterprise Archive.
 * EAR file represents the enterprise application.
 * The above two files are packaged as a JAR file with the .ear extension.
 * It is deployed into the Application Server.
 * It can contain multiple EJB modules (JAR) and Web modules (WAR).
 * It is a special JAR that contains an application.xml file in the META-INF folder.
 *یک EAR مخفف Enterprise Archive است.
 * پرونده EAR نشان دهنده برنامه سازمانی است.
 * دو پرونده فوق به صورت JAR با پسوند .ear بسته بندی شده اند.
 * در سرور Application مستقر می شود.
 * این می تواند شامل چندین ماژول EJB (JAR) و ماژول های وب (WAR) باشد.
 * این JAR ویژه ای است که حاوی یک پرونده Application.xml در پوشه META-INF است.
 */
public class SpringBootPackaging {
}
