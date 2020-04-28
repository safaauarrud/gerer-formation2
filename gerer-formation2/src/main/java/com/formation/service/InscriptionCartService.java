package com.formation.service;

import java.util.List;

import com.formation.service.dto.CartDTO;
import com.formation.service.dto.InscriptionCartDTO;

public interface InscriptionCartService extends GenericService<Long, InscriptionCartDTO> {
	public List<InscriptionCartDTO> getInscriptionCart(Long idParticipant);
}
