package com.example.pruebaentrevista.repositories;

import com.example.pruebaentrevista.models.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche,Integer> {
}
