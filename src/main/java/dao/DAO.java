
package dao;

import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAO<T> implements Daointerface<T, Integer>{
    
    private T entity;
    
    private Session session;
    private Transaction transaction;
    
    public Session openSession(){
        session = getSessionFactory().openSession();
        return session;
    }
    
    public Session openSessionwithTransaction(){
        session = getSessionFactory().openSession();
        transaction = session.beginTransaction();
        return session;
    }
    
    public void closeSession(){
        session.close();
    }
    
    public void closeSessionwithTransaction(){
        transaction.commit();
        session.close();
    }
    
    private static SessionFactory getSessionFactory(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void add(T entity) {
        getSession().save(entity);
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);
    }

    @Override
    public T findById(Integer id) {
        T t = (T) getSession().get(entity.getClass(), id);
        return t;
    }

    @Override
    public List<T> findAll() {
        String sql = "From " + entity.getClass().getSimpleName();
        List<T> entitys = (List<T>) getSession().createQuery(sql).list();
        return entitys;
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public void deleteAll() {
        List<T> entitys = findAll();
        for(T t : entitys){
            delete(t);
        }
    }
}
