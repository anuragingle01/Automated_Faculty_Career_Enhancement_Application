package com.facultyapplication.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.facultyapplication.demo.model.FacultyLogin;

public interface FacultyLoginRepository extends JpaRepository<FacultyLogin, Long> {
    FacultyLogin findByEmailAndPassword(String email, String password);
}
