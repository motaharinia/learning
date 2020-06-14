package com.motaharinia.msutility;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




/**
 *         https://www.baeldung.com/spring-boot-dependency
 *         https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html
 *         Using a Spring Boot Application as a Dependency :
 *         to have new build:
 *         1.increase pom version tag.
 *         2.in IntelliJ in maven window select below lifecycle and "Run maven build" button:
 *            -clean
 *            -validate (validate the project is correct and all necessary information is available)
 *            -compile (compile the source code of the project)
 *            -test (test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed)
 *            -package (take the compiled code and package it in its distributable format, such as a JAR.)
 *            -verify (run any checks on results of integration tests to ensure quality criteria are met)
 *            -install (install the package into the local repository, for use as a dependency in other projects locally)
 *         3.the dependancy is available in c:\\users\\{myuser}\\.m2\\repository\\com\\motaharinia
 *         4.add dependency to another project as:
 *                 <dependency>
 *                    <groupId>com.motaharinia</groupId>
 *                    <artifactId>MsUtility</artifactId>
 *                    <version>0.0.1-SNAPSHOT</version>
 *                 </dependency>
 */
@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class MsUtilityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsUtilityApplication.class, args);
    }

}
