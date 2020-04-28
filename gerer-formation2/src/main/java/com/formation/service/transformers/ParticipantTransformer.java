package com.formation.service.transformers;

import com.formation.repository.entity.Participant;
import com.formation.service.dto.ParticipantDTO;

public class ParticipantTransformer extends AbstractTransformer<ParticipantDTO, Participant> {

	@Override
	public ParticipantDTO toDTO(Participant participant) {
		ParticipantDTO participantDTO = new ParticipantDTO();
		participantDTO.setId(participant.getId());
		participantDTO.setEmail(participant.getEmail());
		participantDTO.setIdentifiant(participant.getIdentifiant());
		participantDTO.setMotDePasse(participant.getMotDePasse());
		participantDTO.setPhone(participant.getPhone());

		return participantDTO;
	}

	@Override
	public Participant toEntity(ParticipantDTO participantDTO) {

		Participant participant = new Participant();
		participant.setId(participantDTO.getId());
		participant.setEmail(participantDTO.getEmail());
		participant.setIdentifiant(participantDTO.getIdentifiant());
		participant.setMotDePasse(participantDTO.getMotDePasse());
		participant.setPhone(participantDTO.getPhone());

		return participant;
	}

}
