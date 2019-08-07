package cn.kzhou.hibernate.test;

import cn.kzhou.hibernate.model.PersonEntity;
import cn.kzhou.hibernate.util.SessionFactoryUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class Test1 {

    @org.junit.Test
    public void insert(){
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        PersonEntity ps = new PersonEntity();
        ps.setId(1000);
        ps.setAge(20);
        ps.setAddress("丐帮");
        ps.setName("乔峰");
        session.save(ps);
        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void  findByid(){
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        PersonEntity ps = (PersonEntity) session.get(PersonEntity.class,1);
        System.out.println(ps.getName()+"in"+ps.getAddress());
        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void findAll(){
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery(" from PersonEntity");
        List<PersonEntity> list = query.list();
        for (PersonEntity personEntity:list
             ) {
            System.out.println(personEntity.getName());
        }
        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void update(){
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        PersonEntity personEntity = (PersonEntity) session.get(PersonEntity.class,1);
        personEntity.setName("虚竹");
        session.update(personEntity);
        transaction.commit();
        session.close();
    }

    @org.junit.Test
    public void delete(){
        SessionFactory sf = SessionFactoryUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        PersonEntity personEntity = new PersonEntity();
        personEntity.setId(1);
        session.delete(personEntity);
        transaction.commit();
        session.close();
    }
}
