package homework3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//更新数据测试类
public class updateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("src/homework3/applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("EmployeeDao");
        Employee employee = new Employee();
        employee.setId(2);
        employee.setEmpname("廖进湖");
        employee.setEmpage(21);
        int num = employeeDao.updateEmloyee(employee);
        if(num>0){

            System.out.println("更新"+num+"数据");
        }
        else {
            System.out.println("更新失败");
        }
    }
}
