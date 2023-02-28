package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Hugo");
        usuario.setApellido("Pozos");
        usuario.setEmail("pozos_herrera@outlook.es");
        usuario.setTelefono("2295521144");
        return usuario;
    }

    @RequestMapping(value = "usuario3254")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Hugo");
        usuario.setApellido("Pozos");
        usuario.setEmail("pozos_herrera@outlook.es");
        usuario.setTelefono("2295521144");
        return usuario;
    }

    @RequestMapping(value = "usuario234")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Hugo");
        usuario.setApellido("Pozos");
        usuario.setEmail("pozos_herrera@outlook.es");
        usuario.setTelefono("2295521144");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Hugo");
        usuario.setApellido("Pozos");
        usuario.setEmail("pozos_herrera@outlook.es");
        usuario.setTelefono("2295521144");
        return usuario;
    }

}
