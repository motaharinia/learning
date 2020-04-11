package com.motaharinia.javacore.jexceptionhandling.cjavamultiplecatchblock;

/**
 * https://www.javatpoint.com/multiple-catch-block-in-java
 * Java Multi-catch block:
 * A try block can be followed by one or more catch blocks. Each catch block must contain a different exception handler.
 * So, if you have to perform different tasks at the occurrence of different exceptions, use java multi-catch block.
 * Points to remember:
 * At a time only one exception occurs and at a time only one catch block is executed.
 * All catch blocks must be ordered from most specific to most general, i.e. catch for ArithmeticException must come before catch for Exception.
 * بلوک Multi-catch جاوا:
 * بلوک try را می توان توسط یک یا چند بلوک catch دنبال کرد. هر بلوک catch باید حاوی یک کنترل کننده استثناء متفاوت باشد.
 * بنابراین ، اگر در صورت استثنائات مختلف مجبورید کارهای مختلفی را انجام دهید ، از بلوک multi-catch جاوا استفاده کنید.
 * نکاتی که باید به خاطر بسپارید:
 * در هر زمان فقط یک استثناء رخ می دهد و در هر زمان فقط یک بلوک catch اجرا می شود.
 * همه بلوک های catch باید از خصوصی ترین تا عمومی ترین مرتب شوند ، برای مثال catch برای کلاس ArithmeticException باید قبل از catch کلاس Exception بیاید.
 */
public class CatchMultipleException {
    public Integer devideFromArray(Integer[] numberArray) {
        Integer result = 0;
        try {
            Integer number1 = numberArray[5];
            result = number1 / 0;
        } catch (ArithmeticException e) {
            result = 1000;
        } catch (ArrayIndexOutOfBoundsException e) {
            result = 2000;
        } catch (Exception e) {
            result = 3000;
        }
        return result;
    }
}
