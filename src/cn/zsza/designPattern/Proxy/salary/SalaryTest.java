package cn.zsza.designPattern.Proxy.salary;

/**
 * Created by ZhangSong on 2016/8/12.
 */
public class SalaryTest {
    public static void main(String[] args) {
        Object target = new SalaryManagerImpl();
        Logger logger = new Logger();
        Security security = new Security();
        Privilege privilege = new Privilege();
        privilege.setAccess("admin");

        SalaryManagerInterceptor interceptor = new SalaryManagerInterceptor(
                target, logger, security, privilege);
        SalaryManager proxyInstance = (SalaryManager) interceptor.createProxyInstance();
        proxyInstance.showSalary();
    }
}
