package com.motaharinia.javacore.tjava9feachers.lstreamapiimprovement;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.javatpoint.com/java-9-stream-api-improvement
 * Java 9 Stream API Improvement:
 * In Java 9, Stream API has improved and new methods are added to the Stream interface.
 * These methods are tabled below.
 * default Stream<T>	takeWhile(Predicate<? super T> predicate):
 * It returns, if this stream is ordered, a stream consisting of the longest prefix of elements taken from this stream that match the given predicate.
 * Otherwise returns, if this stream is unordered, a stream consisting of a subset of elements taken from this stream that match the given predicate.
 * default Stream<T>	dropWhile(Predicate<? super T> predicate):
 * It returns, if this stream is ordered, a stream consisting of the remaining elements of this stream after dropping the longest prefix of elements that match the given predicate.
 * Otherwise returns, if this stream is unordered, a stream consisting of the remaining elements of this stream after dropping a subset of elements that match the given predicate.
 * static <T> Stream<T>	ofNullable(T t):
 * It returns a sequential Stream containing a single element, if non-null, otherwise returns an empty Stream.
 * static <T> Stream<T>	iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next):
 * It returns a sequential ordered Stream produced by iterative application of the given next function to an initial element, conditioned on satisfying the given hasNext predicate.
 * The stream terminates as soon as the hasNext predicate returns false.
 * بهبود API Java 9 Stream:
 * در جاوا 9 ، Stream API بهبود یافته و متدهای جدیدی به رابط Stream اضافه شده است.
 * این متد ها در زیر آورده شده است.
 * default Stream<T>	takeWhile(Predicate<? super T> predicate):
 * اگر این جریان سفارش شود ، یک جریان متشکل از طولانی ترین پیشوند از عناصر گرفته شده از این جریان که مطابق با گزاره داده شده است ، برمی گردد.
 * در غیر این صورت ، اگر این جریان بدون هماهنگی باشد ، جریان متشکل از زیر مجموعه ای از عناصر گرفته شده از این جریان که مطابق با گزاره داده شده است ، برمی گردد.
 * default Stream<T>	dropWhile(Predicate<? super T> predicate):
 * اگر این جریان سفارش شود ، جریان پس از انداختن طولانی ترین پیشوند از عناصر مطابق با گزاره داده شده ، جریان را تشکیل می دهد.
 * در غیر این صورت ، اگر این جریان بدون هماهنگی باشد ، جریان پس از انداختن زیر مجموعه ای از عناصر مطابق با گزاره داده شده ، متشکل از عناصر باقی مانده این جریان است.
 * static <T> Stream<T>	ofNullable(T t):
 * این یک جریان پی در پی حاوی یک عنصر واحد را برمی گرداند ، اگر غیر تهی باشد ، در غیر این صورت یک جریان خالی را برمی گرداند.
 * static <T> Stream<T>	iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next):
 * این یک جریان دستور داده شده متوالی تولید شده توسط برنامه تکراری عملکرد بعدی داده شده را به یک عنصر اولیه بازمی گرداند ، که شرط آن بر رضایت گزاره hasNext داده شده است.
 * جریان به محض برگرداندن گزاره hasNext نادرست پایان می یابد.
 *
 * Java Stream takeWhile() Method:
 * Stream takeWhile method takes each element that matches its predicate. It stops when it get unmatched element.
 * It returns a subset of elements that contains all matched elements, other part of stream is discarded.
 * Java Stream takeWhile() متد:
 * متد takeWhile از هر عنصر مطابق با گزاره خود استفاده می کند. وقتی عنصر غیر قابل مقایسه می شود متوقف می شود.
 * این زیر مجموعه ای از عناصر را که شامل همه عناصر همسان است ، برمی گرداند ، بخش دیگری از جریان دور ریخته می شود
 *
 * Java Stream dropWhile() Method:
 * Stream dropWhile method returns result on the basis of order of stream elements.
 * Ordered stream: It returns a stream that contains elements after dropping the elements that match the given predicate.
 * Unordered stream: It returns a stream that contains remaining elements of this stream after dropping a subset of elements that match the given predicate.
 * Java Stream dropWhile() متد:
 * متد dropWhile نتیجه بر اساس ترتیب عناصر جریان نتیجه را برمی گرداند.
 * جریان مرتب: پس از رها کردن عناصر مطابق با گزاره داده شده ، جریانی را در بر می گیرد که حاوی عناصر است.
 * جریان نامرتب: پس از انداختن زیر مجموعه ای از عناصر مطابق با گزاره داده شده ، جریانی را که حاوی عناصر باقیمانده این جریان است ، برمی گرداند.
 *
 * Java 9 Stream ofNullable Method:
 * Stream ofNullable method returns a sequential stream that contains a single element, if non-null.
 * Otherwise, it returns an empty stream.
 * It helps to handle null stream and NullPointerException.
 * Java 9 Stream ofNullable متد:
 * متد جریان از Nullable یک جریان متوالی را که شامل یک عنصر واحد است ، در صورت غیر تهی بودن ، برمی گرداند.
 * در غیر این صورت ، یک جریان خالی برمی گرداند.
 * این کمک می کند تا جریان صفر و NullPointerException را کنترل کنید.
 *
 * Java Stream Iterate Method:
 * A new overloaded method iterate is added to the Java 9 stream interface.
 * This method allows us to iterate stream elements till the specified condition.
 * It takes three arguments, seed, hasNext and next.
 * متد Iterate Java Stream:
 * یک متد جدید بارگذاری مجدد به رابط جریان 9 جاوا اضافه شده است.
 * این متد به ما اجازه می دهد تا عناصر جریان را تا شرایط مشخص شده تکرار کنیم.
 * این سه آرگومان ، seed ، hasNext و next را ورودی می گیرد
 */
public class Java9Stream {
    /**
     * Java Stream takeWhile() Method Example1
     */
    public String streamTakeWhileExample1() {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        return list.stream().map(item->item.toString()).collect(Collectors.joining(","));
    }

    /**
     * Java Stream takeWhile() Method Example2
     */
    public String streamTakeWhileExample2() {
        List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        return list.stream().map(item->item.toString()).collect(Collectors.joining(","));
    }

    /**
     * Java Stream dropWhile() Method Example
     */
    public String streamDropWhileExample() {
        List<Integer> list = Stream.of(2, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        return list.stream().map(item->item.toString()).collect(Collectors.joining(","));
    }

    /**
     * Java Stream ofNullable() Method Example
     */
    public String streamOfNullableExample() {
        List<String> list = Stream.ofNullable(null)
                .map(i -> i.toString()).collect(Collectors.toList());
        return list.stream().map(item->item.toString()).collect(Collectors.joining(","));
    }

    /**
     * Java Stream Iterate() Method Example
     */
    public String streamIterateExample() {
        List<Integer> list = Stream.iterate(1, i -> i <= 10, i -> i * 3).collect(Collectors.toList());
        return list.stream().map(item->item.toString()).collect(Collectors.joining(","));
    }
}
