package cn.zsza.designPattern.Factory.SimpleFactory;

/**
 * Created by ZhangSong on 2016/8/31.
 * 20:18
 */
public class SendFactory {
    /**
     * SendFactory定义为工厂
     * 方法返回值声明为Sender接口引用
     * @param type
     * @return
     */
    public Sender produce(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }else if ("sms".equals(type)){
            return new SmsSender();
        }else {
            System.out.println("bad Type");
            return null;
        }
    }
}
