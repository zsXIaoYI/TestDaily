package cn.zsza.designPattern.Proxy.Proxy1;

/**
 * Created by ZhangSong on 2016/8/12.
 */
public class PersonDaoProxyTest {
    public static void main(String[] args) {
        PersonDao personDao = new PersonDaoImpl();
        Transaction transaction = new Transaction();

        PersonDaoProxy personDaoProxy = new PersonDaoProxy(personDao,transaction);

        personDaoProxy.savePerson();
    }
}
