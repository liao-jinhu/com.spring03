package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class deleteAccountTest {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        //获取AccountDao实例
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        //执行deleteAccount方法 ，并返回结果
        int num = accountDao.deleteAccoutn(2);
        if(num>0){
            System.out.println(num);
            System.out.println("删除成功");
        }
        else {
            System.out.println("删除失败");
        }

    }
}
