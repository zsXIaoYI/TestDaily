package cn.zsza.jvm;

/**
 * Created by zs on 2017/4/27.
 * 11:28
 */

/**
 * Java语言允许通过程序化的方式间接对Class进行操作。Class文件由类装载器装载后，在JVM中形成一份描述Class结构的元信息
 * 对象，通过该元信息对象可以获知Class的结构信息，如构造函数、属性和方法等。
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader.toString());   // sun.misc.Launcher$AppClassLoader@677327b6

    }
}
