package cn.zsza.designPattern.Factory.SimpleFactory;

/**
 * Created by ZhangSong on 2016/8/31.
 * 20:17
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is smsSender");
    }
}
