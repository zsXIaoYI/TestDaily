package cn.zsza.abstractTest;

/**
 * Created by ZhangSong on 2016/8/4.
 */
class A{
    String str = "aa";
    int i = 10;
    public void print(){
        System.out.println("aa");
    }
}
class B extends A{
    String str = "bb";
    int i = 20;
    @Override
    public void print() {
//        super.print();
        System.out.println("bb");
    }
}
public class ExtendsTest {
    public static void main(String[] args) {
        /**
         * 父类引用指向子类对象
         */
        A a = new B();
        a.print();
        System.out.println(".." + a.str);
        System.out.println("...." + a.i);
    }
}
