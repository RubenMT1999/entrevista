package com.example.pruebaentrevista.repositories;

import com.example.pruebaentrevista.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Puedes agregar métodos personalizados si es necesario
}
