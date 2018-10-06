
package dao;

import java.util.List;


public interface Daointerface<T, Id> {
    
    //создать
    public void add(T entity);
    //обновить
    public void update(T entity);
    //найти по id
    public T findById(Id id);
    //найти все
    public List<T> findAll();
    //удалить
    public void delete(T entity);
    //удалить все
    public void deleteAll();
    
}
