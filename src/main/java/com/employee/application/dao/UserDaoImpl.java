package com.employee.application.dao;

import com.employee.application.repo.UserRepo;
import com.employee.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User findByUserId(String userId) {
        return userRepo.findByUserId(userId);
    }
}
