package com.employee.application.dao;

import com.employee.application.model.User;

public interface UserDao extends GenericDao<User, Integer> {

     User findByUserId(String userId);

}
