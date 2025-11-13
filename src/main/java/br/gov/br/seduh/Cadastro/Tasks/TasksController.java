package br.gov.br.seduh.Cadastro.Tasks;

import br.gov.br.seduh.Cadastro.Users.UserService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TasksController {

    private TasksService tasksService;

    public TasksController(TasksService tasksService) {
        this.tasksService = tasksService;
    }

    //GET -- Mandar uma requisição para mostrar as tarefas
    @GetMapping("/listar")
    public List listarTarefas() {
        return tasksService.listarTarefas();
    }

    //POST -- Mandar uma requisição para criar as tarefas
    @PostMapping("/criar")
    public TasksModel criarTarefa(@RequestBody TasksModel tarefa) {
        return tasksService.criarTarefa(tarefa);
    }

    //PUT -- Mandar uma requisição para alterar/criar as tarefas
    @PutMapping("/alterar/{id}")
    public TasksModel alterarTarefa(@PathVariable Long id, @RequestBody TasksModel tarefaAtualizada) {
        return tasksService.alterarTarefaPorId(id, tarefaAtualizada);
    }

    //DELETE -- Mandar uma requisição para deletar as tarefas
    @DeleteMapping ("/deletar/{id}")
    public void deletarTarefaPorId(@PathVariable Long id) {
        tasksService.deletarTarefaPorId(id);
    }
}
