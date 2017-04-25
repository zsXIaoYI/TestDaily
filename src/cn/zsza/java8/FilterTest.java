package cn.zsza.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by ZhangSong on 2017/2/26.
 * 18:29
 */
public class FilterTest {
    public static void main(String args[]){
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        filter(languages, (str)->str.startsWith("J"));
    }


    public static void filter(List<String> names, Predicate<String> condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
}
