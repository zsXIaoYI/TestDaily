package cn.zsza.designPattern.Proxy.Proxy1;

/**
 * Created by ZhangSong on 2016/8/12.
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public void savePerson() {
        System.out.println("save 一个 person");
    }
}
