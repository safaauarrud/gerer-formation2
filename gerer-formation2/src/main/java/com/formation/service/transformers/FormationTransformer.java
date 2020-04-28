package com.formation.service.transformers;

import com.formation.repository.entity.Formation;
import com.formation.service.dto.FormationDTO;

public class FormationTransformer extends AbstractTransformer<FormationDTO, Formation> {

	@Override
	public FormationDTO toDTO(Formation formation) {
		FormationDTO formationDTO = new FormationDTO();
		formationDTO.setId(formation.getId());
		//formationDTO.setIdFormateur(formation.getIdFormateur());
		formationDTO.setLangue(formation.getLangue());
		//formationDTO.setPrésentation(formation.getPrésentation());
		//formationDTO.setStatut(formation.getStatut());
		//formationDTO.setTexteDuBouton(formation.getTexteDuBouton());
		formationDTO.setTitre(formation.getTitre());
		return formationDTO;
	}

	@Override
	public Formation toEntity(FormationDTO formationDTO) {
		Formation formation = new Formation();
		formation.setId(formationDTO.getId());
		//formation.setIdFormateur(formationDTO.getIdFormateur());
		formation.setLangue(formationDTO.getLangue());
		//formation.setPrésentation(formationDTO.getPresentation());
		//formation.setStatut(formationDTO.getStatut());
		//formation.setTexteDuBouton(formationDTO.getTexteDuBouton());
		formation.setTitre(formationDTO.getTitre());
		return formation;
	}

}
