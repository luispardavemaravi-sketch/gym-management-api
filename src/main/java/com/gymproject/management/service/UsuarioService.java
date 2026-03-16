package com.gymproject.management.service;

import com.gymproject.management.model.Usuario;

import java.util.List;

public interface UsuarioService {

    //registra al usuario
    Usuario registrar(Usuario usuario);


    //lista a los usuarios
    List<Usuario> ListarUsuarios( );


    // busca a los usuarios por su id
    Usuario buscarUsuarioPorId(Long id);

    Usuario actualizarUsuario( Long id , Usuario usuario);

    // elimina
    void eliminarUsuarioPorId(Long id);


}
