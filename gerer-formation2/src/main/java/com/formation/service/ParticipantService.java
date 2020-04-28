package com.formation.service;

import java.util.List;

import com.formation.service.dto.ParticipantDTO;

public interface ParticipantService extends GenericService<Long, ParticipantDTO> {
	public List<Long> getParticipant(String email, String motDePasse);
}
