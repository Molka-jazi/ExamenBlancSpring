package tn.esprit.spring.examenblanc2.Entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false ,name ="idFormation" ,length=50, unique=true)
    private int idFormation ;

    private String titre;

    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @Temporal(TemporalType.DATE)
    private Date dateFin;

    @Temporal(TemporalType.DATE)
    private Date dateDebut;

    private int nbreHeures;

    private int nbrMaxParticipant;

    private int frais;

    @ManyToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    @ToString.Exclude
    private List<Apprenant> apprenants;

    @ManyToOne
    @ToString.Exclude
    private Formateur formateur;


}
