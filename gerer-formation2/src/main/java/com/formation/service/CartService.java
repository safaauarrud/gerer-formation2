package com.formation.service;

import java.util.List;

import com.formation.repository.entity.Cart;
import com.formation.repository.entity.Formation;
import com.formation.service.dto.CartDTO;
import com.formation.service.dto.FormationDTO;
public interface CartService extends GenericService<Long, CartDTO> {
	public List<CartDTO> getCart(Long idFormateur);
}

