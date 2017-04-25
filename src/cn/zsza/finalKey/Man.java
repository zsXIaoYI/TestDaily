package cn.zsza.finalKey;

/**
 * Created by ZhangSong on 2016/8/31.
 * 对于final修饰的成员变量：
 *    初始化赋值
 *    要么进行构造方法中赋值
 */
public class Man {
    private final int i;

    public Man(int i) {
        this.i = i;
    }


}
