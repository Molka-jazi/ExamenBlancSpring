package tn.esprit.spring.examenblanc2.Configuration;

import antlr.ASTNULLType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import tn.esprit.spring.examenblanc2.Entities.Formation;
import tn.esprit.spring.examenblanc2.Repository.FormationRepository;
@Slf4j
@Configuration
public class configuration {
    @Autowired
    FormationRepository formationRepository;

    //@Scheduled(fixedRate=3000)
    public void getNbrApprenantByFormation() {

        for (Formation dName : formationRepository.findAll()){
           log.info("la formation"+dName.getTitre()+"contient"+dName.getApprenants().size());
        }

    }
}
