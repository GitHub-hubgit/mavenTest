package com.iotek.util;

import com.mysql.cj.Session;
import jdk.management.resource.ResourceAccuracy;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 邪灵
 * @Date: 2019/12/5 16:00
 * @Description: mybatis工具类
 * @Since: 1.0
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsStream);
            Runtime.getRuntime().addShutdownHook(new Thread(){
                @Override
                public void run() {
                    try {
                        resourceAsStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("程序关闭");
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
