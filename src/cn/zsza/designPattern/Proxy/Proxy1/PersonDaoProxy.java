package cn.zsza.designPattern.Proxy.Proxy1;

/**
 * Created by ZhangSong on 2016/8/12.
 * 静态代理
 *    代理类实现目标类的接口
 */
public class PersonDaoProxy implements PersonDao {
    private PersonDao personDao;           // 接口引用
    private Transaction transaction;

    public PersonDaoProxy(PersonDao personDao, Transaction transaction) {
        this.personDao = personDao;
        this.transaction = transaction;
    }

    @Override
    public void savePerson() {
        /**
         * 1.开启事务
         * 2.进行保存操作
         * 3.提交事务
         */
        transaction.beginTransaction();
        personDao.savePerson();
        transaction.commit();
    }
}
