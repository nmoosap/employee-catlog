package com.employee.application.service;

import com.employee.application.dao.GenericDao;
import com.employee.application.dao.UserDao;
import com.employee.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(@Qualifier("userDaoImpl") GenericDao<User, Integer> genericDao) {
        super(genericDao);
        this.userDao = (UserDao) genericDao;
    }

    @Override
    @Transactional(readOnly = true)
    public User findByUserId(String userId) {
        return userDao.findByUserId(userId);
    }
}
