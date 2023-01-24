package tn.esprit.spring.examenblanc2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenblanc2.Entities.Formateur;
@Repository
public interface FormateurRepository extends JpaRepository<Formateur,Integer> {
}
