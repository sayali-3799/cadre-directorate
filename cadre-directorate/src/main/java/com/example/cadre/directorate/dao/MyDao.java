package com.example.cadre.directorate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cadre.directorate.model.EmployeeRegistration;

public interface MyDao extends JpaRepository<EmployeeRegistration, Integer> {

}
