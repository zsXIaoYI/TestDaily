package cn.zsza.StringTest;

/**
 * Created by ZhangSong on 2016/8/31.
 * 20:58
 */
public class Test {
    public static void main(String[] args) {
        String str = "ab";
        
        change(str);     // 调用change()方法只是把str的值"ab"传进去

        str = _change(str);
        System.out.println("After change:" +str);
    }

    private static String _change(String str) {
        str = "cc";
        return str;
    }

    private static void change(String str) {
        str = "aa";
    }
}
