package homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

//查询测试类
public class selectTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("src/homework3/applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("EmployeeDao");

        //查询id为2
        Employee employee =employeeDao.findEmloyeeById(2);
        System.out.println("id查询:\n"+employee);
        
        //查询所有
        System.out.println("查询所有:");
        List<Employee> employee2 = employeeDao.findAllEmloyee();
        for(Employee act:employee2){
            System.out.println(act);

        }
    }

}
