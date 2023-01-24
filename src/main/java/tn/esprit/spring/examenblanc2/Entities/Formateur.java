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
public class Formateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormateur;

    private String nom;

    private String prenom;

    private int tarifHoraire;

    private String email;

    @OneToMany(mappedBy = "formateur",cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Formation> formations;
}
