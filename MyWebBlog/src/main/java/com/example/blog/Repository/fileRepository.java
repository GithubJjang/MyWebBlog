package com.example.blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.blog.Model.fileinfo;

public interface fileRepository extends JpaRepository<fileinfo, Integer> {

}
