package cn.zsza.thread.lock;

/**
 * Created by user on 2016/2/2.
 */
public class TicketLock {
    public static void main(String[] args) {
        TicketSourceOfLock tk = new TicketSourceOfLock();

        Thread t1 = new Thread(tk,"窗口一");
        Thread t2 = new Thread(tk,"窗口二");
        Thread t3 = new Thread(tk,"窗口三");

        t1.start();
        t2.start();
        t3.start();
    }
}
