package cn.zsza.designPattern.Proxy.proxy2;

import cn.zsza.designPattern.Proxy.Proxy1.Transaction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ZhangSong on 2016/8/12.
 * 动态代理
 */
public class PersonDaoInterceptor implements InvocationHandler {
    private Object target;
    private Transaction transaction;

    public PersonDaoInterceptor(Object target, Transaction transaction) {
        this.target = target;
        this.transaction = transaction;
    }

    /**
     * 创建代理对象
     * @return
     */
    public Object createProxyInstance(){
        Object proxyInstance = Proxy.newProxyInstance(this.target.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(), this);
        return proxyInstance;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.transaction.beginTransaction();

        method.invoke(target,args);  // 目标对象调用方法

        this.transaction.commit();
        return null;
    }
}
