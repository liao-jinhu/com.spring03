package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
//查询所帐户信息
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        AccountDao account = (AccountDao) applicationContext.getBean("accountDao");
        List<Account> accounts = account.findAllAccount();
        for(Account act :accounts){
            System.out.println(act);
        }


    }
}
