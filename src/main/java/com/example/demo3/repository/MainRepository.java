package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.model.MainModel;

public interface MainRepository extends JpaRepository<MainModel, Long> {
    
}
