package servlets;

import dao.AccessDao;
import dao.UserDao;
import entitys.Access;
import entitys.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.AccessService;
import service.UserService;

public class CRUDUser extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        crudAccess();
        crudUser();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    protected void crudAccess(){
        AccessService accessService = new AccessService(new AccessDao());
        
        Access admin = new Access("administrator");
        Access pred = new Access("predsedatel");
        Access work = new Access("work");
        
        accessService.add(admin);
        accessService.add(pred);
        accessService.add(work);

    }

    protected void crudUser() {
        
        AccessService accessService = new AccessService(new AccessDao());
        UserService userService = new UserService(new UserDao());
        
        User user1 = new User("Root", "root", "Петр", "Сидоров", accessService.findById(1));
        User user2 = new User("Pred", "pred", "Василий", "Калач", accessService.findById(2));
        User user3 = new User("Work", "work", "Иван", "Ключев", accessService.findById(3));
        User user4 = new User("fsigizmundov", "qazxsw", "Феликс", "Сигизмундов", accessService.findById(3));
        User user5 = new User("ibrovkin", "wsxzaq", "Иван", "Бровкин", accessService.findById(3));
        
        userService.add(user1);
        userService.add(user2);
        userService.add(user3);
        userService.add(user4);
        userService.add(user5);
        
        System.out.println("***crudUser END***");
    }

}
