package tn.esprit.spring.examenblanc2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.examenblanc2.Entities.Apprenant;
import tn.esprit.spring.examenblanc2.Entities.Formateur;
import tn.esprit.spring.examenblanc2.Entities.Formation;
import tn.esprit.spring.examenblanc2.Services.IExamenService;

import java.util.Date;

@RestController
public class ExamenController {
    @Autowired
    IExamenService examenService;

    @PostMapping("/ajouterFormateur")
    public void ajouterFormateur(@RequestBody Formateur formateur) {
        examenService.ajouterFormateur(formateur);
    }

    @PostMapping("/ajouterApprenant")
    public void ajouterApprenat(@RequestBody Apprenant formateur) {
        examenService.ajouterApprenant(formateur);
    }

    @PostMapping("/ajouterformation")
    public void ajouterEtAffecterFormationAFormateur(@RequestBody Formation formation, @RequestParam("idFormateur") Integer idFormateur) {
        examenService.ajouterEtAffecterFormationAFormateur(formation, idFormateur);
    }

    @PutMapping("/ajouterformation")
    public void affecterApprenantFormation(@RequestParam("idApprenant") Integer idApprenant,@RequestParam("idFormation") Integer idFormation) {
        examenService.affecterApprenantFormation(idApprenant,idFormation);
    }
   /* @PostMapping("/getNbrApprenantByFormation")
    public void getNbrApprenantByFormation() {

        examenService.getNbrApprenantByFormation();
    }*/
    @GetMapping("/getFormateurRemunerationByDate/{idFormateur}/{dateDebut}/{dateFin}")
    public double getFormateurRemunerationByDate(@PathVariable("idFormateur") Integer idFormateur, @PathVariable("dateDebut") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateDebut, @PathVariable("dateFin") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateFin) {
   return examenService.getFormateurRemunerationByDate(idFormateur,dateDebut,dateFin);
    }
    }
