package com.betasoftware.spring_security.data.repositories;

import com.betasoftware.spring_security.data.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User findUserByEmail(String email){
        return User.builder()
                .firstName("FirstName")
                .lastName("LastName")
                .password("123456")
                .build();
    }
}