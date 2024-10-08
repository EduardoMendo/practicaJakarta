import dao.UserDao;
import models.User;

public class Main {
    public static void main(String[] args) {
        UserDao daoUser = new UserDao();
        User user = new User();

        user.setName("Daniel Lacayo");
        user.setEmail("daniellacayo@gmail.com");
        user.setId(001);
        user.setCelphone("81909901");
        daoUser.save(user);
    }
}
