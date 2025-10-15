package br.gov.br.seduh.Cadastro.Tasks;

import br.gov.br.seduh.Cadastro.Users.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table (name ="tb_tasks")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TasksModel {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "tasks")
    private List<UserModel>  users;

}
