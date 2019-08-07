package cn.kzhou.hibernate.test;

import cn.kzhou.hibernate.model.DepartmentEntity;
import cn.kzhou.hibernate.model.EmployeeEntity;
import cn.kzhou.hibernate.model.PersonEntity;
import cn.kzhou.hibernate.util.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.Date;


public class Test2 {

    @Test
    public void insertManyToOne(){
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        DepartmentEntity departmentEntity = new DepartmentEntity();
        departmentEntity.setDepartmentName("技术部");

        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName("乔峰");
        employeeEntity.setBirthday(new Date(90,1,1));
        employeeEntity.setDepartmentEntity(departmentEntity);

        session.save(departmentEntity);
        session.save(employeeEntity);

        transaction.commit();
        session.close();
    }

}
