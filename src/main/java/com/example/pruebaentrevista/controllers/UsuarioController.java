package com.example.pruebaentrevista.controllers;

import com.example.pruebaentrevista.models.Usuario;
import com.example.pruebaentrevista.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuarios")
    public ResponseEntity<List<Usuario>> getAllUsers()  {
        List<Usuario> usuarioRest = usuarioService.getAllUsers();

        if (usuarioRest.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(usuarioRest, HttpStatus.OK);    }


}
