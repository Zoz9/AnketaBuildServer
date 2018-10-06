
package dao;

import entitys.User;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UserDao extends DAO<User>{

    @Override
    public void deleteAll() {
        super.deleteAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(User entity) {
        super.delete(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        return super.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(Integer id) {
        return super.findById(id); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void update(User entity) {
        super.update(entity); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(User entity) {
        super.add(entity); //To change body of generated methods, choose Tools | Templates.
    }
    
    public User findByLogin(String login){
        Criteria criteria = super.getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login));
        User user = (User) criteria.uniqueResult();
        return user;
    }
}
