package com.fatec.cadastro_usuario.business;

import com.fatec.cadastro_usuario.infrastructure.entities.Usuario;
import com.fatec.cadastro_usuario.infrastructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository _repository;


    public UsuarioService(UsuarioRepository repository) {
        _repository = repository;
    }
    public void salvarUsuario(Usuario usuario){
        _repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email){

        return _repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }
    public void deletarUsuarioPorEmail(String email){
        _repository.deleteByEmail(email);
    }

    public void atualizarUsuarioPorId(Integer id, Usuario usuario){
        Usuario usuarioEntity = _repository.findById(id).orElseThrow(() ->
                new RuntimeException("Usuario não encontrado"));
        Usuario usuarioAtualizado = Usuario.builder()
                .email(usuario.getEmail() != null ? usuario.getEmail() :
                        usuarioEntity.getEmail())
                .nome(usuario.getNome() != null ? usuario.getNome() :
                        usuarioEntity.getNome())
                .id(usuarioEntity.getId())
                .build();

        _repository.saveAndFlush(usuarioAtualizado);
    }
}
