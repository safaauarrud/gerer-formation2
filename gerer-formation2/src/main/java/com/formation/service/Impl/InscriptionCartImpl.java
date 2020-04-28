package com.formation.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.formation.repository.CartDAO;
import com.formation.repository.InscriptionCartDAO;
import com.formation.repository.entity.Cart;
import com.formation.repository.entity.InscriptionCart;
import com.formation.service.CartService;
import com.formation.service.InscriptionCartService;
import com.formation.service.dto.CartDTO;
import com.formation.service.dto.InscriptionCartDTO;
import com.formation.service.transformers.CartTransformer;
import com.formation.service.transformers.InscriptionCartTransformer;

public class InscriptionCartImpl implements InscriptionCartService {
	@Autowired
	private InscriptionCartDAO insDAO;
	InscriptionCartTransformer insTransformer = new InscriptionCartTransformer();

	@Override
	public InscriptionCartDTO create(InscriptionCartDTO insDTO) {
		InscriptionCart insToCreate = insTransformer.toEntity(insDTO);
		InscriptionCart insCreated = insDAO.save(insToCreate);
		InscriptionCartDTO createdinsDTO = insTransformer.toDTO(insCreated);
		return createdinsDTO;
	}

	

	@Override
	public List<InscriptionCartDTO> getAll() {
		List<InscriptionCart> listins = insDAO.findAll();
		List<InscriptionCartDTO> listinsDTO = insTransformer.toDTOList(listins);

		return listinsDTO;
	}
	

	

	@Override
	public InscriptionCartDTO getById(Long id) {
		Optional<InscriptionCart> ins =insDAO.findById(id);
		if (ins.isPresent()) {
			return insTransformer.toDTO(ins.get());
		}
		return null;
	}

	@Override
	public List<InscriptionCartDTO> getInscriptionCart(Long idParticipant) {
		List<Long> listId = insDAO.findByIdParticipant(idParticipant);
		List<InscriptionCart> listins = insDAO.findAllById(listId);
		List<InscriptionCartDTO> listinsDTO = insTransformer.toDTOList(listins);
		return listinsDTO;
	}





	@Override
	public InscriptionCartDTO update(InscriptionCartDTO t) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public void delete(InscriptionCartDTO t) {
		// TODO Auto-generated method stub
		
	}




	

	

}
