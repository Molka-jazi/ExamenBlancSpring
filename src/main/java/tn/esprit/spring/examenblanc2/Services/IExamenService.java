package tn.esprit.spring.examenblanc2.Services;

import tn.esprit.spring.examenblanc2.Entities.Apprenant;
import tn.esprit.spring.examenblanc2.Entities.Formateur;
import tn.esprit.spring.examenblanc2.Entities.Formation;

import java.util.Date;

public interface IExamenService {
    public void ajouterFormateur(Formateur formateur);
    public void ajouterApprenant (Apprenant apprenant);
    public void ajouterEtAffecterFormationAFormateur (Formation formation, Integer idFormateur);
    public void affecterApprenantFormation (Integer idApprenant, Integer idFormation);
    //public void getNbrApprenantByFormation ();
    public double getFormateurRemunerationByDate(Integer idFormateur, Date dateDebut, Date dateFin);


    }
