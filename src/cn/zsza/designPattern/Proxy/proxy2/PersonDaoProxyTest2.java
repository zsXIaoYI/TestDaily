package cn.zsza.designPattern.Proxy.proxy2;

import cn.zsza.designPattern.Proxy.Proxy1.PersonDao;
import cn.zsza.designPattern.Proxy.Proxy1.PersonDaoImpl;
import cn.zsza.designPattern.Proxy.Proxy1.Transaction;

/**
 * Created by ZhangSong on 2016/8/12.
 */
public class PersonDaoProxyTest2 {
    public static void main(String[] args) {
        Object target = new PersonDaoImpl();
        Transaction transaction = new Transaction();
        PersonDaoInterceptor personDaoInterceptor = new PersonDaoInterceptor(target,transaction);

        PersonDao personDao = (PersonDao) personDaoInterceptor.createProxyInstance();
//        System.out.println(personDao);
        personDao.savePerson();
    }
}
