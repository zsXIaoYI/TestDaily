package cn.zsza.thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by user on 2016/2/2.
 */
public class TicketSourceOfLock implements Runnable {
    private int ticket = 10;

    // 定义锁对象
    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticket > 0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+
                            "正在出售" + (ticket--) + "张票");
                }
            }finally {
                lock.unlock();
            }
        }
    }
}
