package test;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * 测试增加一个新用户
 * Created by LK on 2017/5/7.
 */
public class AddNewAdminUser {
    public static void main(String[] args) {
        Configuration conf = new Configuration().configure("config/hibernate.cfg.xml");
        SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        User user = new User();
        user.setUserName("admin");
        user.setPassword("password");

        session.save(user);

        tx.commit();

        session.close();
    }
}
