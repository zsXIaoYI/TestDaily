package cn.zsza.collection_;

import org.junit.Test;

import java.util.LinkedList;

/**
 * Created by ZhangSong on 2016/8/2.
 */
public class LinkedListTest {
    /**
     * add方法
     */
    @Test
    public void test1(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("c");
        list.add("b");

        System.out.println(list);
    }

    /**
     * 测试addFirst方法
     */
    @Test
    public void test2(){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("c");
        list.addFirst("b");
        System.out.println(list);
    }
    @Test
    public void test3(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("c");
        list.add("b");

        while (!list.isEmpty()){
            System.out.println(list.removeLast());
        }
    }

}
