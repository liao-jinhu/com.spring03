package com.spring.jdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemlate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }


    //添加帐户
    @Override
    public int addAccount(Account account) {
        String sql="insert into account(username,balance) values(?,?)";
        Object[] obj = new Object[]{
                account.getUsername(),
                account.getBalance()
        };
        int num = this.jdbcTemplate.update(sql,obj);
        return num;
    }

    //更新帐户
    @Override
    public int updateAccoun(Account account) {
        String sql ="update account set username = ? ,balance = ? where id =? ";
        Object[]  parames = new Object[]{
                account.getUsername(),
                account.getBalance(),
                account.getId()
        };
        int num = this.jdbcTemplate.update(sql,parames);
        return num;
    }

    //删除帐户
    @Override
    public int deleteAccoutn(int id) {
        String sql = "delete from account where id =?";
        int num = this.jdbcTemplate.update(sql,id);
        return num;
    }

    //通过id查询
    public Account findAccountById(int id){
        String sql = "select * from account where id = ?";
        RowMapper<Account> rowMapper = new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.queryForObject(sql,rowMapper,id);
    }

    //查询所有帐户
    public List<Account> findAllAccount(){
        String sql = "select * from account";
        RowMapper<Account> rowMapper =new BeanPropertyRowMapper<Account>(Account.class);
        return this.jdbcTemplate.query(sql,rowMapper);
    }


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false)
    //outUser 收款人   inUser汇款人  money收款金额
    public void transfer(String outUser,String inUser,Double money){
        this.jdbcTemplate.update("update account set balance = balance+?"+
                "where username=?",money,inUser);
       // int i = 1/0;
        this.jdbcTemplate.update("update  account set balance= balance-?"
        +"where username=?" ,money,outUser);
    }
}
