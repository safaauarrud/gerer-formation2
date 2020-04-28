package com.formation.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.repository.FormateurDAO;
import com.formation.repository.UserDAO;
import com.formation.repository.entity.Formateur;
import com.formation.service.FormateurService;
import com.formation.service.dto.FormateurDTO;
import com.formation.service.transformers.FormateurTransformer;

@Service
public class FormateurServiceImpl implements FormateurService {
	@Autowired
	private FormateurDAO formateurDAO;
	@Autowired
	private UserDAO userDAO;
	FormateurTransformer formateurTransformer = new FormateurTransformer();

	@Override
	public FormateurDTO create(FormateurDTO formateurDTO) {
		Formateur formateurToCreate = formateurTransformer.toEntity(formateurDTO);
		// Optional<User> user =
		// userDAO.findByUsername(formateurToCreate.getIdentifiant());
		// if (user.isPresent()) {
		// return null;
		// }
		// formateurToCreate.getUser().setRole("Formateur");
		//userDAO.save(formateurToCreate.getUser());
		Formateur formateurCreated = formateurDAO.save(formateurToCreate);
		FormateurDTO createdFormateurDTO = formateurTransformer.toDTO(formateurCreated);
		return createdFormateurDTO;

	}

	@Override
	public FormateurDTO update(FormateurDTO formateurDTO) {
		Formateur formateurToUpdate = formateurTransformer.toEntity(formateurDTO);
		Formateur formateurUpdated = formateurDAO.save(formateurToUpdate);
		FormateurDTO updatedFormateurDTO = formateurTransformer.toDTO(formateurUpdated);
		return updatedFormateurDTO;
	}

	@Override
	public void delete(FormateurDTO formateurDTO) {
		Formateur formateurToDelete = formateurTransformer.toEntity(formateurDTO);
		formateurDAO.delete(formateurToDelete);

	}

	@Override
	public FormateurDTO getById(Long id) {
		Optional<Formateur> formateur = formateurDAO.findById(id);
		if (formateur.isPresent()) {
			return formateurTransformer.toDTO(formateur.get());
		}
		return null;
	}

	@Override
	public List<FormateurDTO> getAll() {
		List<Formateur> listFormateur = formateurDAO.findAll();
		List<FormateurDTO> listFormateurDTO = formateurTransformer.toDTOList(listFormateur);

		return listFormateurDTO;
	}

	@Override
	public List<Long> getFormateur(String email, String motDePasse) {
		List<Long> listIdFormateur = formateurDAO.findByEmailAndMotDePasse(email, motDePasse);

		return listIdFormateur;

	}

}
