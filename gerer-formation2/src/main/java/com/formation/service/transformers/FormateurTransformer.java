package com.formation.service.transformers;

import com.formation.repository.entity.Formateur;
import com.formation.service.dto.FormateurDTO;

public class FormateurTransformer extends AbstractTransformer<FormateurDTO, Formateur> {

	@Override
	public FormateurDTO toDTO(Formateur formateur) {
		FormateurDTO formateurDTO = new FormateurDTO();
		formateurDTO.setEmail(formateur.getEmail());
		formateurDTO.setId(formateur.getId());
		formateurDTO.setMotDePasse(formateur.getMotDePasse());
		formateurDTO.setIdentifiant(formateur.getIdentifiant());
		formateurDTO.setPhoto(formateur.getPhoto());

		return formateurDTO;
	}

	@Override
	public Formateur toEntity(FormateurDTO formateurDTO) {
		Formateur formateur = new Formateur();
		formateur.setEmail(formateurDTO.getEmail());
		formateur.setId(formateurDTO.getId());
		formateur.setMotDePasse(formateurDTO.getMotDePasse());
		formateur.setIdentifiant(formateurDTO.getIdentifiant());
		formateur.setPhoto(formateurDTO.getPhoto());

		return formateur;
	}

}
