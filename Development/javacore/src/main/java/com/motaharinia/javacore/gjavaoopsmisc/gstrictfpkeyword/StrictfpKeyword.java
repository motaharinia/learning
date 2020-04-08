package com.motaharinia.javacore.gjavaoopsmisc.gstrictfpkeyword;

//https://www.javatpoint.com/strictfp-keyword
//Java strictfp keyword ensures that you will get the same result on every platform if you perform operations in the floating-point variable.
//The precision may differ from platform to platform that is why java programming language have provided the strictfp keyword, so that you get same result on every platform.
//So, now you have better control over the floating-point arithmetic.
// کلمه کلیدی جاوا strictfp اطمینان می دهد که اگر فعالیتهایی را در متغیر floating-point انجام دهید ، در هر پلتفرم همان نتیجه را کسب خواهید کرد.
// ممکن است دقت از پلتفرم به پلتفرم متفاوت باشد به همین دلیل است که زبان برنامه نویسی java کلمه کلیدی strictfp را ارائه داده است ، به طوری که در هر سیستم عامل نتیجه مشابهی کسب می کنید.
// بنابراین ، اکنون شما کنترل بهتری بر روی حسگر floating-point  دارید.
//
//Legal code for strictfp keyword:
//The strictfp keyword can be applied on methods, classes and interfaces.
//Illegal code for strictfp keyword:
//The strictfp keyword cannot be applied on abstract methods, variables or constructors.
//محل کدزنی مجاز برای کلمه کلیدی strictfp:
//كلمه کلیدی strictfp را می توان برای متدها ، كلاسها و رابطها به كار برد.
//محل کدزنی غیرمجاز برای کلمه کلیدی strictfp:
//كلمه کلیدی strictfp را نمی توان برای متدهای انتزاعی ، متغیرها و سازنده ها به كار برد.
//strictfp class A{}//strictfp applied on class
//strictfp interfac
// e M{}//strictfp applied on interface
//class A{
//strictfp void m(){}//strictfp applied on method
//}
//
//
public strictfp class StrictfpKeyword {
    strictfp float test() {
        return  1f;
    }
}

strictfp interface StrictfpKeywordInterface {

}
