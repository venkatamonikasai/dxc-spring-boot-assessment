package com.springboot.demo.repository;

import com.springboot.demo.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person> , Integer {
    
}