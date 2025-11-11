package br.gov.br.seduh.Cadastro.Users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Listar todos os usuários

    public List<UserModel> listarUsuarios() {
        return userRepository.findAll();
    }

    public UserModel  listarUsuariosPorId(Long id) {
        Optional<UserModel> userPorId = userRepository.findById(id);
        return userPorId.orElse(null);
    }
    //Criar usuário (CREATE)
    public UserModel criarUsuario(UserModel usuario) {
        return userRepository.save(usuario);
    }
    //Deletar usuário (DELETE)
    public void deletarUsuarioPorId (Long id) {
        userRepository.deleteById(id);
    }
    //Alterar usuário (UPDATE)
    public UserModel alterarUsuarioPorId (Long id, UserModel usuarioAtualizado) {
        if (userRepository.existsById(id)) {
            usuarioAtualizado.setId(id);
            return userRepository.save(usuarioAtualizado);
        }
        return null;
    }
}
