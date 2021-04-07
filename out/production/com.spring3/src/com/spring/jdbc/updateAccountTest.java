package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class updateAccountTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        AccountDao accountDao = (AccountDao) applicationContext.getBean("accountDao");
        Account account = new Account();
        account.setId(5);
        account.setUsername("liaojinhu");
        account.setBalance(10000.00);
        int num = accountDao.updateAccoun(account);
        if(num>0){
            System.out.println(num);
            System.out.println("更新成功");
        }
        else {
            System.out.println("更新失败");
        }

    }
}
