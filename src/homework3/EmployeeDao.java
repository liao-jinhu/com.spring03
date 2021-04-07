package homework3;

import java.util.List;

public interface EmployeeDao {
    public int addEmloyee(Employee employee);  //添加
    public int updateEmloyee(Employee employee); // 更新
    public int deleteEmloyee(int id);   //删除
    public Employee findEmloyeeById(int id);  //根据id查找
    public List<Employee> findAllEmloyee();  //查找全部信息
}
