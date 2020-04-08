package com.motaharinia.javacore.gjavaoopsmisc.cmathclass;

//https://www.javatpoint.com/java-math
//Java Math class provides several methods to work on math calculations like min(), max(), avg(), sin(), cos(), tan(), round(), ceil(), floor(), abs() etc.
//Unlike some of the StrictMath class numeric methods, all implementations of the equivalent function of Math class can't define to return the bit-for-bit same results.
//This relaxation permits implementation with better-performance where strict reproducibility is not required.
//If the size is int or long and the results overflow the range of value, the methods addExact(), subtractExact(), multiplyExact(), and toIntExact() throw an ArithmeticException.
//For other arithmetic operations like increment, decrement, divide, absolute value, and negation overflow occur only with a specific minimum or maximum value.
//It should be checked against the maximum and minimum value as appropriate.
// کلاس ریاضی جاوا چندین روش برای کار در محاسبات ریاضی مانند min ، max ، avg ، gun ، cos ، tan ، round ، ceil ، floor ، abs و غیره
// برخلاف برخی از متدهای عددی کلاس StrictMath ، تمام پیاده سازی های عملکرد معادل کلاس Math نمی توانند برای بازگشت نتایج مشابه بیت برای بیت تعریف کنند.
// این آرامش اجازه می دهد تا اجرای با عملکرد بهتر در جایی که تولید انعطاف پذیری دقیق لازم نباشد ، انجام دهد.
// اگر اندازه int یا long باشد و مقدار نتایج از محدوده overflow کند ، متدهای addExact ، subtractExact ، multiplyExact و toIntExact یک ArithmeticException پرتاب می کنند.
//برای سایر اقدامات حسابی مانند افزایش ، کاهش ، تقسیم ، مقدار مطلق و نفی overflow فقط با حداقل یا حداکثر مقدار خاص اتفاق می افتد.
//باید مطابق حد مناسب در برابر حداکثر و حداقل مقدار بررسی شود.
//
//Basic Math methods:
//Math.abs()	It will return the Absolute value of the given value.
//Math.max()	It returns the Largest of two values.
//Math.min()	It is used to return the Smallest of two values.
//Math.round()	It is used to round of the decimal numbers to the nearest value.
//Math.sqrt()	It is used to return the square root of a number.
//Math.cbrt()	It is used to return the cube root of a number.
//Math.pow()	It returns the value of first argument raised to the power to second argument.
//Math.signum()	It is used to find the sign of a given value.
//Math.ceil()	It is used to find the smallest integer value that is greater than or equal to the argument or mathematical integer.
//Math.copySign()	It is used to find the Absolute value of first argument along with sign specified in second argument.
//Math.nextAfter()	It is used to return the floating-point number adjacent to the first argument in the direction of the second argument.
//Math.nextUp()	It returns the floating-point value adjacent to d in the direction of positive infinity.
//Math.nextDown()	It returns the floating-point value adjacent to d in the direction of negative infinity.
//Math.floor()	It is used to find the largest integer value which is less than or equal to the argument and is equal to the mathematical integer of a double value.
//Math.floorDiv()	It is used to find the largest integer value that is less than or equal to the algebraic quotient.
//Math.random()	It returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
//Math.rint()	It returns the double value that is closest to the given argument and equal to mathematical integer.
//Math.hypot()	It returns sqrt(x2 +y2) without intermediate overflow or underflow.
//Math.ulp()	It returns the size of an ulp of the argument.
//Math.getExponent()	It is used to return the unbiased exponent used in the representation of a value.
//Math.IEEEremainder()	It is used to calculate the remainder operation on two arguments as prescribed by the IEEE 754 standard and returns value.
//Math.addExact()	It is used to return the sum of its arguments, throwing an exception if the result overflows an int or long.
//Math.subtractExact()	It returns the difference of the arguments, throwing an exception if the result overflows an int.
//Math.multiplyExact()	It is used to return the product of the arguments, throwing an exception if the result overflows an int or long.
//Math.incrementExact()	It returns the argument incremented by one, throwing an exception if the result overflows an int.
//Math.decrementExact()	It is used to return the argument decremented by one, throwing an exception if the result overflows an int or long.
//Math.negateExact()	It is used to return the negation of the argument, throwing an exception if the result overflows an int or long.
//Math.toIntExact()	It returns the value of the long argument, throwing an exception if the value overflows an int.
//
// روشهای اصلی ریاضی:
//Math.abs () این مقدار مطلق مقدار داده شده را برمی گرداند.
//Math.max () بزرگترین دو مقدار را برمی گرداند.
//Math.min () برای بازگشت کوچکترین دو مقدار استفاده می شود.
//Math.round () برای دور زدن اعداد اعشاری به نزدیکترین مقدار استفاده می شود.
//Math.sqrt () برای بازگشت ریشه مربع یک عدد استفاده می شود.
//Math.cbrt () برای بازگشت ریشه مکعب یک عدد استفاده می شود.
//Math.pow () مقدار آرگومان اول مطرح شده در قدرت را به آرگومان دوم بازمی گرداند.
//Math.signum () برای یافتن علامت مقدار مشخصی استفاده می شود.
//Math.ceil () برای یافتن کوچکترین مقدار عدد صحیح که بزرگتر از یا برابر استدلال یا عدد صحیح ریاضی باشد استفاده می شود.
//Math.copySign () برای یافتن مقدار مطلق آرگومان اول به همراه علامت مشخص شده در آرگومان دوم استفاده می شود.
//Math.nextAfter () برای بازگشت عدد نقطه شناور در مجاورت آرگومان اول در جهت آرگومان دوم استفاده می شود.
//Math.nextUp () مقدار نقطه شناور مجاور d را در جهت بی نهایت مثبت باز می گرداند.
//Math.nextDown () مقدار نقطه شناور مجاور d را در جهت بی نهایت منفی باز می گرداند.
//Math.floor () برای یافتن بزرگترین عدد صحیح استفاده می شود که کمتر از یا برابر استدلال باشد و برابر با عدد صحیح ریاضی با یک مقدار دو برابر است.
//Math.floorDiv () برای یافتن بزرگترین مقدار عدد صحیح که کمتر یا مساوی با جبر باشد ، استفاده می شود.
//Math.random () مقدار دو برابر را با یک علامت مثبت ، بزرگتر از یا برابر با 0.0 و کمتر از 1.0 برمی گرداند.
//Math.rint () مقدار دو برابر است که به آرگومان داده شده نزدیک است و برابر با عدد صحیح ریاضی است.
//Math.hypot () sqrt (x2 + y2) را بدون سرریز متوسط ​​یا جریان سرریز باز می گرداند.
//Math.ulp () اندازه ی یک قطعه استدلال را برمی گرداند.
//Math.getExponent () از آن برای بازگرداندن نمایانگر بی طرف استفاده شده در بازنمایی یک مقدار استفاده می شود.
//Math.IEEEremainder () برای محاسبه عملیات باقیمانده در دو آرگومان طبق استاندارد IEEE 754 و مقدار بازده استفاده می شود.
//Math.addExact () برای بازگرداندن مجموع آرگومان های آن ، استفاده از استثناء مورد استفاده قرار می گیرد ، اگر نتیجه بیش از حد طولانی باشد.
//Math.subtractExact () این اختلاف آرگومان ها را برمی گرداند ، در صورت سرریز نتیجه یک استثناء است.
//Math.multiplyExact () برای بازگشت محصول آرگومان ها استفاده می شود ، در صورت سرریز نتیجه استثنا ، اگر نتیجه سرریز شود.
//Math.incrementExact () این استدلال را که یک مورد افزایش یافته است برمی گرداند و در صورت سرریز نتیجه ، یک استثنا را به وجود می آورد.
//Math.decrementExact () برای بازگرداندن آرگومان کاهش یافته توسط یک استفاده می شود ، در صورت سرریز نتیجه استثنا ، اگر نتیجه سرریز شود.
//Math.negateExact () برای بازگشت نفی استدلال مورد استفاده قرار می گیرد ، در صورت سرریز نتیجه استثنا ، اگر نتیجه سرریز شود.
//Math.toIntExact () مقدار آرگومان طولانی را برمی گرداند و در صورت سرریز مقدار ، یک استثنا را به وجود می آورد.
//
//Logarithmic Math Methods:
//Math.log()	It returns the natural logarithm of a double value.
//Math.log10()	It is used to return the base 10 logarithm of a double value.
//Math.log1p()	It returns the natural logarithm of the sum of the argument and 1.
//Math.exp()	It returns E raised to the power of a double value, where E is Euler's number and it is approximately equal to 2.71828.
//Math.expm1()	It is used to calculate the power of E and subtract one from it.
// روش های ریاضی لگاریتمی:
//Math.log () این لگاریتم طبیعی با ارزش دو برابر را برمی گرداند.
//Math.log10 () برای بازگشت لگاریتم پایه 10 با یک مقدار دو برابر استفاده می شود.
//Math.log1p () این لگاریتم طبیعی مجموع آرگومان و 1 را برمی گرداند.
//Math.exp () E را به توان دو برابر افزایش می دهد ، جایی که E عدد اویلر است و تقریباً برابر با 2.71828 است.
//Math.expm1 () برای محاسبه توان E و تفریق یکی از آن استفاده می شود.
//
//Hyperbolic Math Methods:
//Math.sinh()	It is used to return the trigonometric Hyperbolic Cosine value of a Given double value.
//Math.cosh()	It is used to return the trigonometric Hyperbolic Sine value of a Given double value.
//Math.tanh()	It is used to return the trigonometric Hyperbolic Tangent value of a Given double value.
// روشهای ریاضیات غلیظ:
//Math.sinh () برای بازگرداندن مقدار کینین مثلثاتی مثلثی با ارزش مضاعف داده شده استفاده می شود.
//Math.cosh () برای بازگرداندن مقدار بیش از حد سینوس مثلثاتی با ارزش دو برابر داده شده استفاده می شود.
//Math.tanh () از این مقدار برای بازگشت مقدار تانژنتریک مثلثاتی مضرات یک مقدار دو برابر داده شده استفاده می شود.
//
//Angular Math Methods:
//Math.toDegrees	It is used to convert the specified Radians angle to equivalent angle measured in Degrees.
//Math.toRadians	It is used to convert the specified Degrees angle to equivalent angle measured in Radians.
// روشهای ریاضی زاویه ای:
//Math.toDegrees برای تبدیل زاویه مشخص شده Radians به زاویه معادل اندازه گیری شده در درجه استفاده می شود.
//Math.toRadians برای تبدیل زاویه درجه مشخص شده به زاویه معادل اندازه گیری شده در رادیانها استفاده می شود.
public class JavaMath {
}
