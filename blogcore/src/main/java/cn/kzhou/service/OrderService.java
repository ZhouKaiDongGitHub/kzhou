package cn.kzhou.service;
import cn.kzhou.dao.OrdersDao;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = false,timeout = -1)
public class OrderService {
    private OrdersDao ordersDao;
    public void accountMoney(){

        ordersDao.addMoney();
        //int i = 10/0;
        ordersDao.reduceMoney();

    }
    public void setOrdersDao(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

}
