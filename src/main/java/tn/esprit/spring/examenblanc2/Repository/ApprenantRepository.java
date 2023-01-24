package tn.esprit.spring.examenblanc2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.examenblanc2.Entities.Apprenant;
@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant,Integer> {
}
