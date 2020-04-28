package com.formation.service.transformers;

import com.formation.repository.entity.InscriptionCart;
import com.formation.service.dto.InscriptionCartDTO;

public class InscriptionCartTransformer extends AbstractTransformer<InscriptionCartDTO,InscriptionCart> {

	@Override
	public InscriptionCartDTO toDTO(InscriptionCart ins) {
		InscriptionCartDTO InscriptionCartDTO = new InscriptionCartDTO();
		InscriptionCartDTO.setId(ins.getId());
		InscriptionCartDTO.setIdCart(ins.getIdCart());
		InscriptionCartDTO.setIdParticipant(ins.getIdParticipant());
		InscriptionCartDTO.setTitre(ins.getTitre());
		InscriptionCartDTO.setLocalisation(ins.getLocalisation());
		InscriptionCartDTO.setNumerotel(ins.getNumerotel());

		return InscriptionCartDTO;
	}

	@Override
	public InscriptionCart toEntity(InscriptionCartDTO INSDTO) {
		InscriptionCart ins = new InscriptionCart();
		ins.setId(INSDTO.getIdCart());
		ins.setIdCart(INSDTO.getIdCart());
		ins.setIdParticipant(INSDTO.getIdParticipant());
		ins.setTitre(INSDTO.getTitre());
		ins.setLocalisation(INSDTO.getLocalisation());
		ins.setNumerotel(INSDTO.getNumerotel());
		return ins;
	}

	

	
}