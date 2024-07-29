package com.example.TestFramework.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.TestFramework.entity.Users;

import java.util.List;

@Repository
public interface userRespository extends JpaRepository<Users,String> {
    List<Users> findByName(String name);
}
