package com.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.formation.repository.entity.Participant;

@Repository
public interface ParticipantDAO extends JpaRepository<Participant, Long> {
	@Query("select DISTINCT id from Participant p where p.email=:email and motDePasse=:motDePasse")
	List<Long> findByEmailAndMotDePasse(@Param("email") String email, @Param("motDePasse") String motDePasse);

}
