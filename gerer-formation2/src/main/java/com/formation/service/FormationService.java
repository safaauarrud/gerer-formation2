package com.formation.service;

import java.util.List;

import com.formation.service.dto.FormationDTO;

public interface FormationService extends GenericService<Long, FormationDTO> {
	public List<FormationDTO> getFormation(Long idFormateur);
}
