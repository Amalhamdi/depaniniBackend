package com.example.depaniniback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.depaniniback.entities.FicheDS;

@Repository
@CrossOrigin("http://localhost:4200/") 
public interface FicheDsRepository extends JpaRepository<FicheDS, Long> {

}
