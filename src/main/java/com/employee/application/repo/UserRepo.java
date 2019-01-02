package com.employee.application.repo;

import com.employee.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    public User findByUserId(String userId);

}
