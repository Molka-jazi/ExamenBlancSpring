package tn.esprit.spring.examenblanc2.Services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.examenblanc2.Entities.Apprenant;
import tn.esprit.spring.examenblanc2.Entities.Formateur;
import tn.esprit.spring.examenblanc2.Entities.Formation;
import tn.esprit.spring.examenblanc2.Repository.ApprenantRepository;
import tn.esprit.spring.examenblanc2.Repository.FormateurRepository;
import tn.esprit.spring.examenblanc2.Repository.FormationRepository;

import java.util.Date;

@Service
@Slf4j
public class ExamenService implements IExamenService{
    @Autowired
    ApprenantRepository apprenantRepository;
    @Autowired
    FormateurRepository formateurRepository;
    @Autowired
    FormationRepository formationRepository;


    @Override
    public void ajouterFormateur(Formateur formateur) {
        formateurRepository.save(formateur);
    }

    @Override
    public void ajouterApprenant(Apprenant apprenant) {
        apprenantRepository.save(apprenant);
    }

    @Override
    public void ajouterEtAffecterFormationAFormateur(Formation formation, Integer idFormateur) {
        formation.setFormateur(formateurRepository.findById(idFormateur).get());
        formationRepository.save(formation);
    }

    @Override
    public void affecterApprenantFormation(Integer idApprenant, Integer idFormation) {
        Formation f = formationRepository.findById(idFormation).get();
        if (f.getNbrMaxParticipant() > f.getApprenants().size()) {
            f.getApprenants().add(apprenantRepository.findById(idApprenant).get());
            formationRepository.save(f);
        }
    }

   /* @Override
    @Scheduled(fixedRate=3000)
    public void getNbrApprenantByFormation() {

        for (Formation dName : formationRepository.findAll()){
            log.info("la formation"+dName.getTitre()+"contient"+dName.getApprenants().size());
        }
    }*/

    @Override
    public double getFormateurRemunerationByDate(Integer idFormateur, Date dateDebut, Date dateFin) {
        double salaire=0;
        //formationRepository.findByFormateurIdFormateurAndDateDebutGretterThanAndDateFinLessThan(idFormateur,dateDebut,dateFin);
        for (Formation f : formationRepository.findByFormateurIdFormateurAndDateDebutBeforeAndDateFinAfter(idFormateur, dateDebut, dateFin)) {
            System.out.println(f.getIdFormation());
       salaire=salaire+(f.getNbreHeures()*f.getFormateur().getTarifHoraire());
        }
        return salaire;

    }
}
