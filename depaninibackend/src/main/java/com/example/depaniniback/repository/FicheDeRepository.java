package com.example.depaniniback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.depaniniback.entities.FicheDE;

@Repository
@CrossOrigin("http://localhost:4200/") 
public interface FicheDeRepository extends JpaRepository<FicheDE, Long> {

}
