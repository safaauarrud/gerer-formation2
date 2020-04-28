package com.formation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.formation.repository.entity.Cart;

@Repository
public interface CartDAO extends JpaRepository<Cart, Long> {
	@Query("select DISTINCT idCart from Cart where idFormateur=:idFormateur") 
	List<Long> findByIdFormateur(@Param("idFormateur") Long idFormateur);
 
}