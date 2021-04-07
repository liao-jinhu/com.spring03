package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//通过id查询帐户信息
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        AccountDao account = (AccountDao) applicationContext.getBean("accountDao");
        Account account1 = account.findAccountById(3);
        System.out.println(account1);
    }
}
