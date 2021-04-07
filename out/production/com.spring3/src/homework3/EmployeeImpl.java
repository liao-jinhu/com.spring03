package homework3;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import java.util.List;
public class EmployeeImpl implements  EmployeeDao{
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemlate(JdbcTemplate jdbcTemlate) {
        this.jdbcTemplate =jdbcTemlate;
    }
    //添加
    @Override
    public int addEmloyee(Employee employee) {
        String sql="insert into t_temployee(empname,empage) values(?,?)";
        Object[] obj = new Object[]{
                employee.getEmpname(),
                employee.getEmpage()
        };
        int num = this.jdbcTemplate.update(sql,obj);
        return num;
    }
    //更新
    @Override
    public int updateEmloyee(Employee employee) {
        String sql ="update t_temployee set empname = ? ,empage= ? where id =? ";
        Object[]  parames = new Object[]{
                employee.getEmpname(),
                employee.getEmpage(),
                employee.getId()
        };
        int num = this.jdbcTemplate.update(sql,parames);
        return num;
    }
    //删除
    @Override
    public int deleteEmloyee(int id) {
        String sql = "delete from t_temployee where id =?";
        int num = this.jdbcTemplate.update(sql,id);
        return num;
    }

    //根据id查找
    @Override
    public Employee findEmloyeeById(int id) {
        String sql = "select * from t_temployee where id = ?";
        RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    //查找全部信息
    @Override
    public List<Employee> findAllEmloyee() {
        String sql = "select * from t_temployee";
        RowMapper<Employee> rowMapper =new BeanPropertyRowMapper<Employee>(Employee.class);
        return this.jdbcTemplate.query(sql,rowMapper);
    }


}
