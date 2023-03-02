package com.cursojava.curso.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Hugo");
        usuario.setApellido("Pozos");
        usuario.setEmail("pozos_herrera@outlook.es");
        usuario.setTelefono("2295521144");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();   
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {
        usuarioDao.registrar(usuario);   
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

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id) {
        usuarioDao.eliminar(id);
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
