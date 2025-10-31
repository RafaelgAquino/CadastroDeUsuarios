package br.gov.br.seduh.Cadastro.Users;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserController {

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
    @GetMapping ("/todos")
    public String mostrarTodosOsUsuarios() {
        return "Mostrar usuário";
    }

    //Mostrar usuários por id (READ)
    @GetMapping ("/todosID")
    public String mostrarTodosOsUsuariosPorId() {
        return "Mostrar usuário por id";
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
