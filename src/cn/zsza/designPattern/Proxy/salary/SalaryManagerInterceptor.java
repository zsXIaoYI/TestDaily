package cn.zsza.designPattern.Proxy.salary;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by ZhangSong on 2016/8/12.
 */
public class SalaryManagerInterceptor implements InvocationHandler {
    private Object target;
    private Logger logger;
    private Security security;
    private Privilege privilege;

    public SalaryManagerInterceptor(Object target, Logger logger,
                                    Security security, Privilege privilege) {
        this.target = target;
        this.logger = logger;
        this.security = security;
        this.privilege = privilege;
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
        /**
         * 1、开启日志
         * 2、开启安全性的框架
         * 3、检查权限
         *      如果是"admin"，则查看
         *      如果不是"admin"，则提示"权限不足"
         */
        this.logger.logging();
        this.security.security();
        if(this.privilege.getAccess().equals("admin")){
            method.invoke(target, args);//调用目标方法
        }else{
            System.out.println("权限不足");
        }
        return null;
    }
}
