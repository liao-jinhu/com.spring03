package com.spring.jdbc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
    /**
     * 使用execute()方法建表
     */
    public static void main(String[] args) {
        // 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("src/applicationContext.xml");
        // 获取JdbcTemplate实例
        JdbcTemplate jdTemplate =
                (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        // 使用execute()方法执行SQL语句，创建用户账户管理表account
        /*
        jdTemplate.execute("create table account(" +
                "id int primary key auto_increment," +
                "username varchar(50)," +
                "balance double)");

         */


        jdTemplate.execute("create  table tuser3("+
                "id int primary key auto_increment,"+
                 "username varchar(20)," +
                "password varchar(20))");



        System.out.println("账户表account创建成功！");
    }
}
