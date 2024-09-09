package com.daniel.brigadeiro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.brigadeiro.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Long> {
	
	Admin findByEmail(String email);

}