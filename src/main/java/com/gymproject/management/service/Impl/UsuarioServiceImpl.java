package com.gymproject.management.service.Impl;

import com.gymproject.management.model.Usuario;
import com.gymproject.management.repository.UsuarioRepository;
import com.gymproject.management.service.UsuarioService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;


    @Override
    public Usuario registrar(Usuario usuario) {
        // si el usuario existe detenemos todo.
        if (usuarioRepository.existsByEmail(usuario.getEmail())) {
            throw new RuntimeException("Error: El email " + usuario.getEmail() + " ya existe");
        }
        //Si pasas la validacion ,le asignamos la fecha de registro automaticamente
        usuario.setFechaRegistro(LocalDate.now());
        return usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> ListarUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    @Transactional
    public Usuario buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Error: Usuario no encontrado"));
    }

    @Override
    @Transactional
    public Usuario actualizarUsuario(Long id, Usuario datosNuevos) {
        return usuarioRepository.findById(id)
                .map(usuarioActual -> {
                    // actualizamos los campos que permitimos cambiar
                    usuarioActual.setNombre(datosNuevos.getNombre());
                    usuarioActual.setPeso(datosNuevos.getPeso());
                    usuarioActual.setAltura(datosNuevos.getAltura());
                    return usuarioRepository.save(usuarioActual);
                })
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }


    @Override
    @Transactional
    public void eliminarUsuarioPorId(Long id) {
        usuarioRepository.deleteById(id);

    }
}
