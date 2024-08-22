package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Banco;

public interface bancoRepository extends JpaRepository<Banco, Integer> {

}
