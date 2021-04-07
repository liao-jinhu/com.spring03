package homework3;
public class Employee {
    private Integer id;  //用户id
    private String empname;  //用户名
    private Integer empage;  //年龄

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmpname() {
        return empname;
    }
    public void setEmpname(String empname) {
        this.empname = empname;
    }
    public Integer getEmpage() {
        return empage;
    }
    public void setEmpage(Integer empage) {
        this.empage = empage;
    }
    @Override
    public String toString() {
        return "Employee{" + "id：" + id + ", 用户名：'" + empname + '\'' + ", 年龄：" + empage + '}';
    }
}
