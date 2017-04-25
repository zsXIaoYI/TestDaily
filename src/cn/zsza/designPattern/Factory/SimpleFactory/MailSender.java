package cn.zsza.designPattern.Factory.SimpleFactory;

/**
 * Created by ZhangSong on 2016/8/31.
 * 20:16
 */
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailSender");
    }
}
