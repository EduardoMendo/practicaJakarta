package dao;

import interfaces.IUser;
import jakarta.persistence.EntityManager;
import models.User;

import java.util.List;

public class UserDao implements IUser {


    @Override
    public void save(User user) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    @Override
    public User getUser(int id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(User.class, id);
    }

    @Override
    public void UpdateStudent(User user) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    @Override
    public void delete(User user) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }
}
