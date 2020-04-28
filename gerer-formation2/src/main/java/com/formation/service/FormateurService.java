package com.formation.service;

import java.util.List;

import com.formation.service.dto.FormateurDTO;

public interface FormateurService extends GenericService<Long, FormateurDTO> {
	public List<Long> getFormateur(String email, String motDePasse);


}
