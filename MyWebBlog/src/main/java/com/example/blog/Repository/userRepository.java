package com.example.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.Model.user;

public interface userRepository extends JpaRepository<user, Integer> {

}
