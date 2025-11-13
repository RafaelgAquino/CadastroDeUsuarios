package br.gov.br.seduh.Cadastro.Tasks;

import br.gov.br.seduh.Cadastro.Tasks.TasksModel;
import br.gov.br.seduh.Cadastro.Tasks.
        TasksRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TasksService {
    private TasksRepository tasksRepository;

    public TasksService(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    //Listar todos os usuários

    public List<TasksModel> listarTarefas() {
        return tasksRepository.findAll();
    }

    public TasksModel  listarTarefasPorId(Long id) {
        Optional<TasksModel> taskPorId = tasksRepository.findById(id);
        return taskPorId.orElse(null);
    }
    //Criar usuário (CREATE)
    public TasksModel criarTarefa(TasksModel tarefa) {
        return tasksRepository.save(tarefa);
    }
    //Deletar usuário (DELETE)
    public void deletarTarefaPorId (Long id) {
        tasksRepository.deleteById(id);
    }
    //Alterar usuário (UPDATE)
    public TasksModel alterarTarefaPorId (Long id, TasksModel tarefaAtualizada) {
        if (tasksRepository.existsById(id)) {
            tarefaAtualizada.setId(id);
            return tasksRepository.save(tarefaAtualizada);
        }
        return null;
    }
}
