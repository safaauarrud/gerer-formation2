package com.formation.web;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.repository.CartDAO;
import com.formation.repository.FormationDAO;
import com.formation.repository.entity.Cart;
import com.formation.repository.entity.Formation;
import com.formation.service.CartService;
import com.formation.service.dto.CartDTO;

/**
 */
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class CartController {   
	@Autowired
	private CartService cartService;
	@Autowired
	private FormationDAO serviceDao;
    @Autowired
	private CartDAO serviceDaocart;
	@PostMapping("/addcart")
	public Cart creerCart(@Valid @RequestBody Cart cart) {
		return serviceDaocart.save(cart);
	}
	@GetMapping("/getCart/{idCart}")
	public ResponseEntity<Optional<Cart>> getCartById(@PathVariable(value = "idCart") Long idCart) {
		Optional<Cart> cart = serviceDaocart.findById(idCart);
		return ResponseEntity.ok().body(cart);
	}
	@GetMapping("/Carts")
	public List<Cart> getAllCart() {
		return serviceDaocart.findAll();
	}
	
	
	@PutMapping("/addCart/{id}")
	private @Valid Cart addCart(@PathVariable("id") Long id,
			@Valid @RequestBody Cart cart) {
		Formation formation = serviceDao.getOne(id);
		formation.setId(cart.getId());
		formation.setTitre(cart.getTitre());
		formation.setLangue(cart.getLangue());
		formation.setPrix(cart.getPrix());
		formation.setDateDeFormation(cart.getDateDeFormation());
		formation.setDescription(cart.getDescription());
		formation.setEmplacement(cart.getEmplacement());
		return serviceDaocart.save(cart);
	}
	
	@DeleteMapping("/deleteCart/{idCart}")
	private List<CartDTO> deleteCart(@PathVariable("idCart") Long idCart) {
        CartDTO CartDto = cartService.getById(idCart);
		cartService.delete(CartDto);

		List<CartDTO> listCartDTO = cartService.getAll();

		return listCartDTO;
		//return null
	}
}


    


   
