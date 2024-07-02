package service;

import model.Usuario;
import repository.UsuarioRepository;
import util.CustomException;

public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrarUsuario(Usuario usuario) throws CustomException {
        if (usuarioRepository.buscarPorEmail(usuario.getEmail()) != null) {
            throw new CustomException("Usuario já cadastrado");
        }
        usuarioRepository.salvar(usuario);
    }

    public Usuario buscarPorEmail(String email) {
        return usuarioRepository.buscarPorEmail(email);
    }
}
