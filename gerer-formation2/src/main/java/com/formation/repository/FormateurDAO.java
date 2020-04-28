package com.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.formation.repository.entity.Formateur;

@Repository
public interface FormateurDAO extends JpaRepository<Formateur, Long> {
	@Query("select DISTINCT id from Formateur where email=:email and motDePasse=:motDePasse ")
	List<Long> findByEmailAndMotDePasse(@Param("email") String email, @Param("motDePasse") String motDePasse);


}
