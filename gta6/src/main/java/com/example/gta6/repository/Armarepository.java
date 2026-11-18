package com.example.gta6.repository;

import com.example.gta6.entity.Arma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Armarepository extends JpaRepository<Arma, Long> {
}
