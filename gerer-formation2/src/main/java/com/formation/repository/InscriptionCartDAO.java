package com.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.formation.repository.entity.Cart;
import com.formation.repository.entity.InscriptionCart;

public interface InscriptionCartDAO extends JpaRepository<InscriptionCart, Long> {
	@Query("select DISTINCT id from InscriptionCart where idParticipant=:idParticipant") 
	List<Long> findByIdParticipant(@Param("idParticipant") Long idParticipant);
 
}
