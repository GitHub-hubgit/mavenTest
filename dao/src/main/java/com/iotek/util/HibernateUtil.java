package com.iotek.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @Auther: 邪灵
 * @Date: 2019/11/22 14:00
 * @Description: hibernate工具
 * @Since: 1.0
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
        //获取核心 配置对象
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        //创建会话工厂
        sessionFactory = configuration.buildSessionFactory();
        //设置程序关闭监听
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                sessionFactory.close();
                System.out.println("程序关闭");
            }
        });
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
