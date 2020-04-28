package com.formation.service.transformers;

import com.formation.repository.entity.Cart;
import com.formation.service.dto.CartDTO;

public class CartTransformer extends AbstractTransformer<CartDTO, Cart> {

	@Override
	public CartDTO toDTO(Cart cart) {
		CartDTO CartDTO = new CartDTO();
		CartDTO.setIdCart(cart.getIdCart());
		CartDTO.setId(cart.getId());
		CartDTO.setIdFormateur(cart.getIdFormateur());
		CartDTO.setLangue(cart.getLangue());
		CartDTO.setDateDeFormation(cart.getDateDeFormation());
		CartDTO.setTitre(cart.getTitre());
		CartDTO.setDescription(cart.getDescription());
		CartDTO.setPrix(cart.getPrix());
		CartDTO.setEmplacement(cart.getEmplacement());
		return CartDTO;
	}

	@Override
	public Cart toEntity(CartDTO cartDTO) {
		Cart cart = new Cart();
		cart.setIdCart(cartDTO.getIdCart());
		cart.setId(cartDTO.getId());
		cart.setIdFormateur(cartDTO.getIdFormateur());
		cart.setLangue(cartDTO.getLangue());
		cart.setDateDeFormation(cartDTO.getDateDeFormation());
		cart.setTitre(cartDTO.getTitre());
		cart.setDescription(cartDTO.getDescription());
		cart.setPrix(cartDTO.getPrix());
		cart.setEmplacement(cartDTO.getEmplacement());
		return cart;
	}
}
