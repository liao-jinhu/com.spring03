package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class addAcountTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        Account account = new Account();
        account.setUsername("hu");
        account.setBalance(1000.00);
        int num = accountDao.addAccount(account);
        if(num>0){
            System.out.println("成功注册帐户");
        }
        else {
            System.out.println("注册失败");
        }

    }
}
