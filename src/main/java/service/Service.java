package service;

import dao.DAO;
import java.util.List;

public class Service<T> {

    private final DAO dao;

    public Service(DAO dao) {
        this.dao = dao;
    }

    //создать
    public void add(T entity) {
        dao.openSessionwithTransaction();
        dao.add(entity);
        dao.closeSessionwithTransaction();
    }

    ;
    //обновить
    public void update(T entity) {
        dao.openSessionwithTransaction();
        dao.update(entity);
        dao.closeSessionwithTransaction();
    }

    //найти по id
    public T findById(Integer id) {
        dao.openSession();
        T t = (T) dao.findById(id);
        dao.closeSession();
        return t;
    }

    //найти все
    public List<T> findAll(){
        dao.openSession();
        List<T> tList = dao.findAll();
        dao.closeSession();
        return tList;
    }

    //удалить
    public void delete(Integer id) {
        dao.openSessionwithTransaction();
        T t = (T) dao.findById(id);
        dao.delete(t);
        dao.closeSessionwithTransaction();
    }

    //удалить все
    public void deleteAll(){
        dao.openSessionwithTransaction();
        dao.deleteAll();
        dao.closeSessionwithTransaction();
    }
    
    public DAO dao(){
        return dao;
    }
}
