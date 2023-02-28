package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

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

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(123l);
        usuario.setNombre("Hugo");
        usuario.setApellido("Pozos");
        usuario.setEmail("pozos_herrera@outlook.es");
        usuario.setTelefono("2295521144");

        Usuario usuario2 = new Usuario();
        usuario2.setId(234l);
        usuario2.setNombre("Romina");
        usuario2.setApellido("Ebrea");
        usuario2.setEmail("romiaebr@outlook.es");
        usuario2.setTelefono("222344145");

        Usuario usuario3 = new Usuario();
        usuario3.setId(432l);
        usuario3.setNombre("Jesus");
        usuario3.setApellido("Jeresualem");
        usuario3.setEmail("jhjuniorquebendicion@outlook.es");
        usuario3.setTelefono("2226669213");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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
