package homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//删除测试类
public class deleteTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("src/homework3/applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("EmployeeDao");
        int num = employeeDao.deleteEmloyee(1);
        if(num>0){
            System.out.println("删除了"+num+"条数据");
        }
        else {
            System.out.println("删除失败");
        }
    }
}
