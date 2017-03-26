package test;

import com.dao.UserDao;
import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by LK on 2016/8/4.
 */
public class TestGetUser {
    private SessionFactory sf = null;
    private Session session = null;

    @Before
    public void setUp() {
        sf = new Configuration().configure().buildSessionFactory();
        session = sf.openSession();
        System.out.println("在setUp()方法中对象初始化成功！");
    }

    @After
    public  void tearDown(){
        session.close();
        sf.close();
        System.out.println("在tearDown()方法中对象成功释放！");
    }

   @Resource
   private UserDao userDao;

    @Test
    public void testGetUser() {
        List<User> list;
        list = this.userDao.getAllUser();
        for (User u :list) {
            System.out.println(u.getUserName());
        }
    }

}
