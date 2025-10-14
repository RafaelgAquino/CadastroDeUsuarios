package br.gov.br.seduh.Cadastro.Tasks;

import br.gov.br.seduh.Cadastro.Users.UserModel;
import jakarta.persistence.*;

@Table (name ="tb_tasks")
@Entity
public class TasksModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "tasks")
    private List<UserModel>  users;

}
