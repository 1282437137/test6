package cn.bdqn.uitl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BaseDao {
    private static SessionFactory session=null;
    static  {
        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        session = configuration.buildSessionFactory();
    }

    public static Session open(){
        return  session.openSession();
    }
}
