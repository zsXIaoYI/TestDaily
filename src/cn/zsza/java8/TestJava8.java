package cn.zsza.java8;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ZhangSong on 2017/2/27.
 * 23:06
 */
public class TestJava8 {
    List<Integer> list = Arrays.asList(1,2,3,4);
    Stream<Integer> stream = list.stream();
    /**
     * findFirst()方法
     */
    @Test
    public void test1(){
        Optional<Integer> first = stream.findFirst();
        System.out.println(first.get());
    }

    /**
     * forEach()遍历
     */
    @Test
    public void test2(){
        stream.forEach(System.out::println);
    }

    /**
     *collect()
     */
    @Test
    public void test3(){

        IntSummaryStatistics stats = stream.collect(Collectors.summarizingInt(i -> i + i));       // 每个数进行自身相加操作

        System.out.println("总和:" + stats.getSum());        // 获取总和
        System.out.println("平均数" + stats.getAverage());   // 获取平均数
        System.out.println("元素个数" + stats.getCount());
    }

    /**
     * Stream.collect() using Supplier, Accumulator and Combiner
     */
    @Test
    public void test4(){
        List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
        String result = list.parallelStream().collect(StringBuilder::new,
                (response, element) -> response.append("-").append(element),
                (response1, response2) -> response1.append(",").append(response2.toString()))
                .toString();
        System.out.println("Result: " + result);
    }
    @Test
    public void test5(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("xx",10));
        people.add(new Person("cc",12));
        List<Map<String,Object>> personToMap = people.stream()
                .collect(ArrayList::new,(list,p) -> {
                    Map<String,Object> map = new HashMap<>();
                    map.put("name",p.name);
                    map.put("age",p.age);
                    list.add(map);
                },List::addAll);
        System.out.println(personToMap);
    }
}
class Person{
    public String name;
    public int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
