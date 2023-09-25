package com.example.pruebaentrevista.services;

import com.example.pruebaentrevista.models.Usuario;
import com.example.pruebaentrevista.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Usuario> getAllUsers()  {
     return this.usuarioRepository.findAll();
    }

}
