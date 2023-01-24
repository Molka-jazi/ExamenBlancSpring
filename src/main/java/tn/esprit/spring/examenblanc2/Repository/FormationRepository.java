package tn.esprit.spring.examenblanc2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenblanc2.Entities.Apprenant;
import tn.esprit.spring.examenblanc2.Entities.Formation;

import java.util.Date;
import java.util.List;

@Repository
public interface FormationRepository extends JpaRepository<Formation,Integer> {
  List<Formation> findByFormateurIdFormateurAndDateDebutBeforeAndDateFinAfter(int idformateur, Date dateDebut, Date dateFin);
}
