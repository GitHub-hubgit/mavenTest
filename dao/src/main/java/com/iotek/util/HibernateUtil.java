package com.iotek.util;

import org.hibernate.SessionFactoryObserver;
import org.hibernate.cfg.Configuration;

/**
 * @Auther: 邪灵
 * @Date: 2019/11/22 14:00
 * @Description: hibernate工具
 * @Since: 1.0
 */
public class HibernateUtil {
    static {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactoryObserver sessionFactoryObserver = cfg.getSessionFactoryObserver();
    }
}
