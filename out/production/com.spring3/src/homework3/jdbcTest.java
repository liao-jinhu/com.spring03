package homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

//创建表测试类
public class jdbcTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("src/homework3/applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
        jdbcTemplate.execute("create table t_temployee (id int primary key auto_increment,\n" +
                "empname varchar(50),\n" +  "empage  varchar(5))");
        System.out.println("创建表成功");
    }
}
