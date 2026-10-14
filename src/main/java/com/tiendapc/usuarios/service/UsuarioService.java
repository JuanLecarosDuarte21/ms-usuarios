
package com.tiendapc.usuarios.service;

import com.tiendapc.usuarios.model.Usuario;
import com.tiendapc.usuarios.repository.UsuarioRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // CREATE: Crear un usuario
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    // READ: Listar todos los usuarios
    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    // READ: Buscar usuario por ID
    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }

    // UPDATE: Actualizar un usuario
    public Optional<Usuario> actualizarUsuario(Long id, Usuario datos) {

        return usuarioRepository.findById(id).map(usuario -> {

            usuario.setNombre(datos.getNombre());
            usuario.setApellido(datos.getApellido());
            usuario.setCorreo(datos.getCorreo());
            usuario.setTelefono(datos.getTelefono());
            usuario.setDireccion(datos.getDireccion());

            return usuarioRepository.save(usuario);
        });
    }

    // DELETE: Eliminar un usuario
    public boolean eliminarUsuario(Long id) {

        if (!usuarioRepository.existsById(id)) {
            return false;
        }

        usuarioRepository.deleteById(id);
        return true;
    }
}
