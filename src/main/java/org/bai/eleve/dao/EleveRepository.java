package org.bai.eleve.dao;

import org.bai.eleve.entities.Eleve;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EleveRepository extends JpaRepository<Eleve, Long> {
	
	@Query("SELECT e FROM Eleve e WHERE e.nom LIKE :n AND e.prenom LIKE :p AND e.anneeScolaire LIKE :a")
	public Page<Eleve> chercher(@Param("n") String nom, 
								@Param("p") String prenom,
								@Param("a") String annee,
								Pageable pageable);

}
