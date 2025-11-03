package br.gov.br.seduh.Cadastro.Users;

import org.springframework.stereotype.Service;

import java.util.List;

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
}
