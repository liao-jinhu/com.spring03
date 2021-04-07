package com.spring.jdbc;

import java.util.List;

public interface AccountDao {
    public int addAccount(Account account);  //添加
    public int updateAccoun(Account account); // 更新
    public int deleteAccoutn(int id);   //删除
    public Account findAccountById(int id);  //根据id查找
    public List<Account> findAllAccount();  //查找全部信息
    public void transfer(String outUser,String inUser,Double money);

}
