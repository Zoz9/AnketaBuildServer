
package dao;

import hibernate.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class DAO<T> implements DaoInterface<T, Integer>{

    private T entity;
    
    private Session session;
    private Transaction transaction;
    
    public Session openSession(){
        session = HibernateUtil.getSessionFactory().openSession();
        return session;
    }
    
    public Session openSessionwithTransaction(){
        session = HibernateUtil.getSessionFactory().openSession();
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
        T t = (T) getSession().get(Object.class, id);
        return t;
    }

    @Override
    public List<T> findAll() {
        String sql = "From " + entity.getClass().getSimpleName();
        List<T> entitys = getSession().createQuery(sql).list();
        return entitys;
    }

    @Override
    public void delete(T entity) {
        getSession().delete(entity);
    }

    @Override
    public void deleteAll() {
        List<T> entitys = findAll();
        for(T t : entitys)
            delete(t);
    }
    
}
