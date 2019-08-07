package cn.kzhou.dao;

import cn.kzhou.model.OrderModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersDao {
    //注入Jdbctemplate属性操作JDBC
    private JdbcTemplate jdbcTemplate;

    public void reduceMoney(){
        String stringSql = "update account set salary = salary-? where username=?";
        jdbcTemplate.update(stringSql,new Object[]{4,"小王"});
        String stringSql2 = "select * from account where username=?";
        jdbcTemplate.query(stringSql2,new Object[]{"小王"}, new ResultSetExtractor<OrderModel>() {
            @Override
            public OrderModel extractData(ResultSet rs) throws SQLException, DataAccessException {
                if(rs.next()){
                    OrderModel orderModel = new OrderModel();
                    orderModel.setUserName(rs.getString("username"));
                    orderModel.setSalary(rs.getInt("salary"));
                    System.out.println(orderModel.toString());
                    return orderModel;
                }
                return null;
            }
        });
    }

    public void addMoney(){
        String sql = "update account set salary = salary +? where username=?";
        jdbcTemplate.update(sql,new Object[]{4,"小张"});
    }

    //set方法注入
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
}
