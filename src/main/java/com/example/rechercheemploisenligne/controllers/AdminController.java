package com.projetintegration.rechercheemplois.controllers;

import com.projetintegration.rechercheemplois.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admins")
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

}
