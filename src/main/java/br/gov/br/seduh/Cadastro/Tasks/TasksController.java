package br.gov.br.seduh.Cadastro.Tasks;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tarefas")
public class TasksController {

    //GET -- Mandar uma requisição para mostrar as tarefas
    @GetMapping("/listar")
    public String listarTarefas() {
        return "Tarefas listadas com sucesso";
    }

    //POST -- Mandar uma requisição para criar as tarefas
    @PostMapping("/criar")
    public String criarTarefa() {
        return "Tarefa criada com sucesso";
    }

    //PUT -- Mandar uma requisição para alterar/criar as tarefas
    @PutMapping("/alterar")
    public String alterarTarefa() {
        return "Tarefa alterada com sucesso";
    }

    //DELETE -- Mandar uma requisição para deletar as tarefas
    @DeleteMapping ("/deletar")
    public String deletarTarefa() {
        return "Tarefa deletada com sucesso";
    }
}
