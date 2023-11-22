package com.project2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.project2.entities.student;

@RepositoryRestController

public interface studentRepo extends JpaRepository<student, Integer> {

}
