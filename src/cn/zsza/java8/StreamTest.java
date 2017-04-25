package cn.zsza.java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by ZhangSong on 2017/2/26.
 * 18:20
 */
public class StreamTest {
    @Test
    public void test1(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Stream<Integer> stream = numbers.stream();
        /**
         * 如果元素对2取余等于0,则进行平方操作，然后打印之
         * x前后括号可以去掉
         */
        stream.filter((x) -> x % 2 == 0).map((x) -> x * x).forEach(System.out::println);

    }
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = numbers.stream();
        /**
         * 在上述测试方法的基础上，把得到的结果元素存到list中
         * 参数e的类型是由编译器推理得出的
         */
//        stream.filter(x -> x % 2 == 0).map(x -> x * x).forEach(e -> list.add(e));
        /**
         * 如果Lambda有更复杂语句块，则可以使用花括号将语句包括起来
         */
        stream.filter(x -> x % 2 == 0).map(x -> x * x).forEach(e -> {
            if (e % 8 == 0){
                System.out.println(e);
                list.add(e);
            }
        });
        System.out.println(list);
    }

}
