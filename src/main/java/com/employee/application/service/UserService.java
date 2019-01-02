package com.employee.application.service;


import com.employee.application.model.User;

public interface UserService extends GenericService<User, Integer> {

     User findByUserId(String userId);

}
