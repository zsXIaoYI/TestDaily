package cn.zsza.java8;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by zs on 2017/3/30.
 * 10:12
 */
public class StreamTest2 {


    public static void main(String[] args) {

        System.out.println(get());
    }

    public static Map<String,String> get(){
        Map<String,String> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = numbers.stream();



        String s = stream.map((a) -> {
            String str = a + "3";
            if ("33".equals(str)) {
                return "success";
            }
            return "fail";
        }).findFirst().get();
        map.put("key",s);

        return map;
    }


}
