package com.formation.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.formation.repository.CartDAO;
import com.formation.repository.entity.Cart;
import com.formation.service.CartService;
import com.formation.service.dto.CartDTO;
import com.formation.service.transformers.CartTransformer;
@Component
public class CartServiceImpl implements CartService {
	@Autowired
	private CartDAO CartDAO;
	CartTransformer CartTransformer = new CartTransformer();

	@Override
	public CartDTO create(CartDTO CartDTO) {
		Cart CartToCreate = CartTransformer.toEntity(CartDTO);
		Cart CartCreated = CartDAO.save(CartToCreate);
		CartDTO createdCartDTO = CartTransformer.toDTO(CartCreated);
		return createdCartDTO;
	}

	@Override
	public CartDTO update(CartDTO CartDTO) {
		Cart CartToUpdate = CartTransformer.toEntity(CartDTO);
		Cart CartUpdated = CartDAO.save(CartToUpdate);
		CartDTO updatedCartDTO = CartTransformer.toDTO(CartUpdated);
		return updatedCartDTO;
	}

	@Override
	public void delete(CartDTO CartDTO) {
		Cart CartToDelete = CartTransformer.toEntity(CartDTO);
		CartDAO.delete(CartToDelete);

	}

	@Override
	public CartDTO getById(Long id) {
		Optional<Cart> Cart = CartDAO.findById(id);
		if (Cart.isPresent()) {
			return CartTransformer.toDTO(Cart.get());
		}
		return null;
	}

	@Override
	public List<CartDTO> getAll() {
		List<Cart> listCart = CartDAO.findAll();
		List<CartDTO> listCartDTO = CartTransformer.toDTOList(listCart);

		return listCartDTO;
	}

	@Override
	public List<CartDTO> getCart(Long idFormateur) {
		List<Long> listIdCart = CartDAO.findByIdFormateur(idFormateur);
		List<Cart> listCart = CartDAO.findAllById(listIdCart);
		List<CartDTO> listCartDTO = CartTransformer.toDTOList(listCart);
		return listCartDTO;
	}

	

	

}
