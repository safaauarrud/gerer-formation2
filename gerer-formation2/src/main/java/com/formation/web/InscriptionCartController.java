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
import com.formation.repository.InscriptionCartDAO;
import com.formation.repository.entity.Cart;
import com.formation.repository.entity.Formation;
import com.formation.repository.entity.InscriptionCart;
import com.formation.service.FormationService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class InscriptionCartController {
	    
		@Autowired
		private FormationDAO serviceDao;
	    @Autowired
		private InscriptionCartDAO serviceDaoIns;
	    @Autowired
		private CartDAO serviceDaocart;
	    
		@PostMapping("/addInscriptioncart")
		public InscriptionCart creerIns(@Valid @RequestBody InscriptionCart inscriptionCart) {
			return serviceDaoIns.save(inscriptionCart);
		}
		@GetMapping("/getIns/{id}")
		public ResponseEntity<Optional<InscriptionCart>> getInsById(@PathVariable(value = "id") Long id) {
			Optional<InscriptionCart> ins = serviceDaoIns.findById(id);
			return ResponseEntity.ok().body(ins);
		}
		@GetMapping("/InscriptionCarts")
		public List<InscriptionCart> getAllIns() {
			return  serviceDaoIns.findAll();
		}
		
		
		@PutMapping("/inscrireCart/{idCart}")
		private @Valid InscriptionCart inscrireCart(@PathVariable("idCart") Long idCart,
				@Valid @RequestBody InscriptionCart ins) {
			Cart cart = serviceDaocart.getOne(idCart);
			cart.setIdCart(ins.getIdCart());
			cart.setTitre(ins.getTitre());
			ins.getEmail();
			ins.getLocalisation();
			ins.getNumerotel();
			return serviceDaoIns.save(ins);
            //return null
		}
		
		
	}

