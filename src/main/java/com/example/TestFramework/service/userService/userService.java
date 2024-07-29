package com.example.TestFramework.service.userService;

import com.example.TestFramework.dto.request.userReuqest.createUserRequest;
import com.example.TestFramework.entity.Users;
import com.example.TestFramework.respository.userRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService implements userServiceImp{
    @Autowired
    private userRespository userRepository;
    @Override
    public List<Users> getAllUser() {
        return userRepository.findAll();
    }
    @Override
    public Users addUser(createUserRequest newUser){
        List<Users> users = userRepository.findByName(newUser.getUserName());
        if(users.size()>0){
            throw new RuntimeException("User Name already exist");
        }
        Users user = new Users();
        user.setName(newUser.getUserName());
        user.setPassword(newUser.getPassword());
        user.setEmail(newUser.getEmail());
        user.setPhone(newUser.getPhone());
        user.setAge(newUser.getAge());
        user.setDob(newUser.getDob());
        userRepository.save(user);
        return user;
    }
    @Override
    public Users deleteUser(String id) {
        Optional<Users> users = userRepository.findById(id);
        if(users.isPresent()){
            userRepository.delete(users.get());
            return users.get();
        }
        throw new RuntimeException("User not found");
    }
}
