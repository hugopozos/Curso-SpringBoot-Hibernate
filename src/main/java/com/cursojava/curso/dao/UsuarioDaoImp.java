package com.cursojava.curso.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.cursojava.curso.models.Usuario;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioDaoImp.class);

    @PersistenceContext
    EntityManager entityManager; // Nos sirve para hacer la conxion a la base de datos

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        // Referencia a la clase Usuario.java y alli buscara la tabla de la base de
        // datos
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class,id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public Usuario obtenerUsuarioPorCredenciales(Usuario usuario) {
        String query = "FROM Usuario WHERE email = :email";
        List<Usuario> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .getResultList();

                LOGGER.debug("Query para obtenerUsuarioPorCredenciales: {}", query);
                LOGGER.debug("Parametros para obtenerUsuarioPorCredenciales: email={}, password={}", usuario.getEmail(), usuario.getPassword());
                LOGGER.debug("Resultados para obtenerUsuarioPorCredenciales: {}", lista);

                if(lista.isEmpty()){
                    return null;
                }

                String passwordHashed = lista.get(0).getPassword();

                Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
                if(argon2.verify(passwordHashed, usuario.getPassword())){
                    return lista.get(0);
                } 
                return null;
        
    }    

}
