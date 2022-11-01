package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDaoHiberbate = new UserDaoHibernateImpl();
    public void createUsersTable() {
        userDaoHiberbate.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHiberbate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHiberbate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoHiberbate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoHiberbate.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoHiberbate.cleanUsersTable();
    }
}
