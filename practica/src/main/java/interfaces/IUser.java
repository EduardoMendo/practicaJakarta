package interfaces;

import models.User;
import java.util.List;

public interface IUser {

    public void save(User user);
    public User getUser(int id);
    public void UpdateStudent(User user);
    public void delete(User user);
    public List<User> getAllUsers();

}
