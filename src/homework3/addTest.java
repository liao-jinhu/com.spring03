package homework3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//添加数据测试类
public class addTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("src/homework3/applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) applicationContext.getBean("EmployeeDao");
        Employee employee = new Employee();
        //employee.setEmpname("liaojinhu");
       // employee.setEmpage(21);
        //employeeDao.addEmloyee(employee);

        employee.setEmpname("张三");
        employee.setEmpage(25);
        //employee.setEmpname("李四");
        //employee.setEmpage(25);
        int num =  employeeDao.addEmloyee(employee);

        if(num>0){
            System.out.println("添加了"+num+"数据成功");
        }
        else {
            System.out.println("添加失败");
        }
    }
}
