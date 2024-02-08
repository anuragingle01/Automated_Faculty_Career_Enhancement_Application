package com.facultyapplication.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facultyapplication.demo.model.FacultyLogin;
import com.facultyapplication.demo.repository.FacultyLoginRepository;

@Service
public class FacultyLoginService {

    @Autowired
    private FacultyLoginRepository facultyLoginRepository; // Inject FacultyLoginRepository

    public boolean isValidCredentials(String email, String password) {
        // Check if the provided email and password match any faculty login record in the database
        FacultyLogin facultyLogin = facultyLoginRepository.findByEmailAndPassword(email, password);
        return facultyLogin != null;
    }
}

