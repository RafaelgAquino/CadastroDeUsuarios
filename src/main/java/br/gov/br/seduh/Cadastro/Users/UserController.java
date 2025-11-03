package br.gov.br.seduh.Cadastro.Users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping ("/boasvindas")
    public String boasVindas() {
        return "Primeira mensagem na rota";
    }

    //Adicionar usuário (CREATE)
    @PostMapping ("/criar")
    public String criarUsuario() {
        return "Usuário criado";
    }

    //Mostrar todos os usuários (READ)
    @GetMapping ("/listar")
    public List listar() {
        return userService.listarUsuarios();
    }

    //Mostrar usuários por id (READ)
    @GetMapping ("/listar/{id}")
    public UserModel listarUsuariosPorId(@PathVariable Long id) {
        return userService.listarUsuariosPorId(id);
    }

    //Alterar dados dos usuários (UPDATE)
    @PutMapping ("/alterarID")
    public String alterarUsuarioPorId() {
        return "Alterar usuário por id";
    }

    //Deletar usuário (DELETE)
    @DeleteMapping ("/deletarID")
    public String deletarUsuarioPorId() {
        return "Deletar usuário por id";
    }
}
