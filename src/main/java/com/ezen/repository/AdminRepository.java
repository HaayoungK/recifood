package com.ezen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezen.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, String> {

}
