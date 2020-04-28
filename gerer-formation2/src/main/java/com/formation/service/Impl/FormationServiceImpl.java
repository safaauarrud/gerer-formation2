package com.formation.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.repository.FormationDAO;
import com.formation.repository.entity.Formation;
import com.formation.service.FormationService;
import com.formation.service.dto.FormationDTO;
import com.formation.service.transformers.FormationTransformer;

@Service
public class FormationServiceImpl implements FormationService {
	@Autowired
	private FormationDAO formationDAO;
	FormationTransformer formationTransformer = new FormationTransformer();

	@Override
	public FormationDTO create(FormationDTO formationDTO) {
		Formation formationToCreate = formationTransformer.toEntity(formationDTO);
		Formation formationCreated = formationDAO.save(formationToCreate);
		FormationDTO createdFormationDTO = formationTransformer.toDTO(formationCreated);
		return createdFormationDTO;
	}

	@Override
	public FormationDTO update(FormationDTO formationDTO) {
		Formation formationToUpdate = formationTransformer.toEntity(formationDTO);
		Formation formationUpdated = formationDAO.save(formationToUpdate);
		FormationDTO updatedFormationDTO = formationTransformer.toDTO(formationUpdated);
		return updatedFormationDTO;
	}

	@Override
	public void delete(FormationDTO formationDTO) {
		Formation formationToDelete = formationTransformer.toEntity(formationDTO);
		formationDAO.delete(formationToDelete);

	}

	@Override
	public FormationDTO getById(Long id) {
		Optional<Formation> formation = formationDAO.findById(id);
		if (formation.isPresent()) {
			return formationTransformer.toDTO(formation.get());
		}
		return null;
	}

	@Override
	public List<FormationDTO> getAll() {
		List<Formation> listFormation = formationDAO.findAll();
		List<FormationDTO> listFormationDTO = formationTransformer.toDTOList(listFormation);

		return listFormationDTO;
	}

	@Override
	public List<FormationDTO> getFormation(Long idFormateur) {
		List<Long> listIdFormation = formationDAO.findByIdFormateur(idFormateur);
		List<Formation> listFormation = formationDAO.findAllById(listIdFormation);
		List<FormationDTO> listFormationDTO = formationTransformer.toDTOList(listFormation);
		return listFormationDTO;
	}

}
