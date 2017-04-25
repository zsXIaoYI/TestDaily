package cn.zsza.designPattern.Proxy.Proxy1;

/**
 * Created by ZhangSong on 2016/8/12.
 */
public class Transaction {
    public void beginTransaction(){
        System.out.println("begin transaction");
    }
    public void commit(){
        System.out.println("commit");
    }
}
