package com.motaharinia.javacore.gjavaoopsmisc.icommandlinearg;

import com.motaharinia.javacore.gjavaoopsmisc.ejavarecursion.RecursionInJava;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.unitils.reflectionassert.ReflectionAssert;

//https://www.javatpoint.com/command-line-argument
@SpringBootTest(args = "--testArgument=hello")
public class CommandLineArgumentTest {
    @Test
    public void commandLineArgumentTest(@Autowired Environment env) {
        ReflectionAssert.assertReflectionEquals("hello", env.getProperty("testArgument"));
    }
}
