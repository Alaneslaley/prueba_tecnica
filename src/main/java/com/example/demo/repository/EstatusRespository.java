package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Estatus;

public interface EstatusRespository extends JpaRepository<Estatus, Integer> {

}
