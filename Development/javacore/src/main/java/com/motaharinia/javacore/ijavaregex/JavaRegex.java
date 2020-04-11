package com.motaharinia.javacore.ijavaregex;

/**
 * https://www.javatpoint.com/java-regex
 * The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.
 * It is widely used to define the constraint on strings such as password and email validation.
 * After learning Java regex tutorial, you will be able to test your regular expressions by the Java Regex Tester Tool.
 * Java Regex API provides 1 interface and 3 classes in java.util.regex package.
 * جاوا Regex یا عبارات منظم یک API برای تعریف الگویی برای جستجوی یا دستکاری رشته ها است.
 * از آن برای تعریف محدودیت در رشته هایی مانند رمز عبور و اعتبار ایمیل استفاده می شود.
 * پس از یادگیری آموزش جاوا regex ، می توانید عبارات منظم خود را توسط ابزار تستر جاوا Regex تست کنید.
 * پکیج Java Regex API یک رابط و 3 کلاس در بسته java.util.regex ارائه می دهد.
 *
 * The Matcher and Pattern classes provide the facility of Java regular expression.
 * The java.util.regex package provides following classes and interfaces for regular expressions.
 * 1.MatchResult interface
 * 2.Matcher class
 * 3.Pattern class
 * 4.PatternSyntaxException class
 * کلاس های Matcher و Pattern امکان بیان منظم جاوا را فراهم می کنند.
 * پکیج java.util.regex کلاس ها و رابط های زیر را برای عبارات منظم ارائه می دهد.
 * 1.MatchResult interface
 * 2.Matcher class
 * 3.Pattern class
 * 4.PatternSyntaxException class
 *
 * Matcher class:
 * It implements the MatchResult interface.
 * It is a regex engine which is used to perform match operations on a character sequence.
 * 1	boolean matches()	test whether the regular expression matches the pattern.
 * 2	boolean find()	finds the next expression that matches the pattern.
 * 3	boolean find(int start)	finds the next expression that matches the pattern from the given start number.
 * 4	String group()	returns the matched subsequence.
 * 5	int start()	returns the starting index of the matched subsequence.
 * 6	int end()	returns the ending index of the matched subsequence.
 * 7	int groupCount()	returns the total number of the matched subsequence.
 * کلاس تطبیق دهنده:
 * این رابط MatchResult را پیاده سازی می کند.
 * این موتور regex است که برای انجام عملیات مطابقت با یک دنباله کاراکتر استفاده می شود.
 * 1	boolean matches()	 آزمایش می کند که آیا عبارت منظم با این الگوی مطابقت دارد یا خیر
 * 2	boolean find()	عبارت بعدی را پیدا می کند که با الگوی مطابقت دارد.
 * 3	boolean find(int start)	عبارت بعدی را پیدا می کند که با الگوی تعداد شروع داده شده مطابقت دارد
 * 4	String group()	زیررشته منطبق را خروجی میدهد
 * 5	int start()	شاخص شروع زیررشته منطبق را برمی گرداند.
 * 6	int end()	شاخص انتهایی زیررشته منطبق را باز می گرداند
 * 7	int groupCount()	تعداد کل زیررشته منطبق را باز می گرداند
 *
 * Pattern class:
 * It is the compiled version of a regular expression. t is used to define a pattern for the regex engine.
 * 1	static Pattern compile(String regex)	compiles the given regex and returns the instance of the Pattern.
 * 2	Matcher matcher(CharSequence input)	creates a matcher that matches the given input with the pattern.
 * 3	static boolean matches(String regex, CharSequence input)	It works as the combination of compile and matcher methods. It compiles the regular expression and matches the given input with the pattern.
 * 4	String[] split(CharSequence input)	splits the given input string around matches of given pattern.
 * 5	String pattern()	returns the regex pattern.
 * کلاس الگو:
 * این نسخه کاملی از یک عبارت منظم است. برای تعریف الگویی برای موتور regex استفاده می شود.
 * 1	static Pattern compile(String regex)	عبارت منظم داده شده را کامپایل می کند و نمونه الگو را برمی گرداند
 * 2	Matcher matcher(CharSequence input)	یک matcher را ایجاد می کند که ورودی داده شده را با الگوی مطابقت می دهد
 * 3	static boolean matches(String regex, CharSequence input)	به عنوان ترکیبی از متدهای compile و matcher عمل می کند. این عبارت منظم را کامپایل می کند و ورودی داده شده را با الگو مطابقت می دهد
 * 4	String[] split(CharSequence input)	رشته ورودی داده شده را در اطراف تطبیق های الگوی داده شده تقسیم می کند
 * 5	String pattern()	الگوی عبارت منظم را برمی گرداند
 *
 *Regex Character classes:
 * 1	[abc]	a, b, or c (simple class)
 * 2	[^abc]	Any character except a, b, or c (negation)
 * 3	[a-zA-Z]	a through z or A through Z, inclusive (range)
 * 4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
 * 5	[a-z&&[def]]	d, e, or f (intersection)
 * 6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
 * 7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
 *
 * Regex Quantifiers:
 * X?	X occurs once or not at all
 * X+	X occurs once or more times
 * X*	X occurs zero or more times
 * X{n}	X occurs n times only
 * X{n,}	X occurs n or more times
 * X{y,z}	X occurs at least y times but less than z times
 *
 * Regex Metacharacters
 * .	Any character (may or may not match terminator)
 * \d	Any digits, short of [0-9]
 * \D	Any non-digit, short for [^0-9]
 * \s	Any whitespace character, short for [\t\n\x0B\f\r]
 * \S	Any non-whitespace character, short for [^\s]
 * \w	Any word character, short for [a-zA-Z_0-9]
 * \W	Any non-word character, short for [^\w]
 * \b	A word boundary
 * \B	A non word boundary
 */
public class JavaRegex {
}
