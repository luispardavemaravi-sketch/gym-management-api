package com.gymproject.management.service;

import com.gymproject.management.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario guardarUsuario(Usuario usuario);

    List<Usuario> ListarUsuarios();

    Usuario buscarUsuarioPorId(Long id);


}
