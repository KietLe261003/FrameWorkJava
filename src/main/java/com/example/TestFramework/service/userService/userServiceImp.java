package com.example.TestFramework.service.userService;


import com.example.TestFramework.dto.request.userReuqest.createUserRequest;
import com.example.TestFramework.entity.Users;

import java.util.List;

public interface userServiceImp {
    public List<Users> getAllUser();
    public Users addUser(createUserRequest newUser);
    public Users deleteUser(String id);
}
