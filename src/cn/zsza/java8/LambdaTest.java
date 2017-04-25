package cn.zsza.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ZhangSong on 2017/2/25.
 * 22:52
 */
public class LambdaTest {
    @Test
    public void  test1(){
        List<String> list = Arrays.asList("a", "b", "d");
        System.out.println(list);

        list.forEach( e -> System.out.println(e));
        list.forEach(System.out::println);


        list.forEach((String e) -> {
            if (e.equals("a")){
                System.out.println(e);
            }else {
                return;
            }

        });

    }
    @Test
    public void testThread(){
        new Thread(() -> System.out.println("Java8"));
    }
}
