package com.example.demo.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entitis.Users;

public interface UsersrRepositry extends JpaRepository<Users, Integer>{

public 	Users findByEmail(String email);

 

}
