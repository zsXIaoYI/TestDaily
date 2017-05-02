package cn.zsza.ObjectTest;

/**
 * Created by zs on 2017/5/2.
 * 11:44
 */

/**
 * 对象要实现Cloneable接口
 */
class Person implements Cloneable{
    Integer id;

    public Person(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person(11);

        Person tmp = p1;
        /**
         * 对象的拷贝是返回一个新对象，与用new关键字操作符返回的新对象的区别是，这个对象已经包含了一些
         * 原来对象的信息
         */
        Person p2  = (Person) p1.clone();

        System.out.println(p1 == tmp);
        System.out.println(p1 == p2);

        System.out.println(p2.id);

    }
}
