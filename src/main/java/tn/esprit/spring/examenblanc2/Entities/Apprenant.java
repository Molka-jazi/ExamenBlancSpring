package tn.esprit.spring.examenblanc2.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Apprenant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAppreant;

    private String nom;

    private String prenom;

    private int telephone;

    private String email;

    @ManyToMany(mappedBy ="apprenants" ,cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Formation> formations;
}
