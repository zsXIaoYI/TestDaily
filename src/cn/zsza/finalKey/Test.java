package cn.zsza.finalKey;

/**
 * Created by ZhangSong on 2016/8/31.
 * 20:52
 */
public class Test {
    public static void main(String[] args) {
        String a = "hello2";
        final String b = "hello";     // 当常量处理
        String d = "hello";
        String c = b + 2;
        String e = d + 2;
        System.out.println((a == c));   // true
        System.out.println((a == e));   // false
    }
}
