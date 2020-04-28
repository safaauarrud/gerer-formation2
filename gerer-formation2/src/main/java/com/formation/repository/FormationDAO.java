package com.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.formation.repository.entity.Formation;

@Repository
public interface FormationDAO extends JpaRepository<Formation, Long> {
	@Query("select DISTINCT id from Formation where idFormateur=:idFormateur ")
	List<Long> findByIdFormateur(@Param("idFormateur") Long idFormateur);
}
