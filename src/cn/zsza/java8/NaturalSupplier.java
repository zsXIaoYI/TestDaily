package cn.zsza.java8;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 打印自然数
 * Created by ZhangSong on 2017/2/26.
 * 20:07
 */
public class NaturalSupplier implements Supplier<Long> {

    long value = 0;
    @Override
    public Long get() {
        this.value = this.value + 1;
        return this.value;
    }

    public static void main(String[] args) {
        Stream<Long> natural = Stream.generate(new NaturalSupplier());

        natural.map((x) ->  x * x).limit(10).forEach(System.out::println);
    }
}
