package com.cursojava.curso.dao;
import java.util.List;
import com.cursojava.curso.models.Usuario;

public interface UsuarioDao {

    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

}
