package cn.zsza.genericType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zs on 2017/3/6.
 * 11:32
 */
public class GenericTypeTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        unsafeAdd(strings,new Integer(42));

        String s = strings.get(0);

    }

    /**
     * 下面unsafeAdd方法中的List没指定泛型，编译能通过，但运行会报异常
     * 如果指定泛型List<String>,则放入非String的元素,则编译都不通过
     * @param list
     * @param o
     */
    private static void unsafeAdd(List list, Object o) {
        list.add(o);
    }

    public static List<?> getList(){

        return new ArrayList<>();
    }
}
