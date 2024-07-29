package com.example.TestFramework.dto.request.userReuqest;

import java.time.LocalDate;

public class createUserRequest {
    private String userName;
    private String password;
    private String email;
    private String phone;
    private int age;
    private LocalDate dob;

    public createUserRequest() {}
    public createUserRequest(String userName, String password, String email, String phone, int age, LocalDate dob) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.dob = dob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
