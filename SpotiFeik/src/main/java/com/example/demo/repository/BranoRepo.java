package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Brano;

public interface BranoRepo extends JpaRepository<Brano, Long>{

}
