package com.formation.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.repository.ParticipantDAO;
import com.formation.repository.UserDAO;
import com.formation.repository.entity.Participant;
import com.formation.service.ParticipantService;
import com.formation.service.dto.ParticipantDTO;
import com.formation.service.transformers.ParticipantTransformer;

@Service
public class ParticipantServiceImpl implements ParticipantService {
	@Autowired
	private ParticipantDAO participantDAO;
	@Autowired
	private UserDAO userDAO;
	ParticipantTransformer participantTransformer = new ParticipantTransformer();

	@Override
	public ParticipantDTO create(ParticipantDTO participantDTO) {
		Participant participantToCreate = participantTransformer.toEntity(participantDTO);
		// Optional<User> user
		// =userDAO.findByUserName(participantToCreate.getIdentifiant());
		// if (user.isPresent()) {
		// return null;
		// }
		// participantToCreate.getUser().setRole("Participant");
		//userDAO.save(participantToCreate.getUser());
		Participant participantCreated = participantDAO.save(participantToCreate);
		ParticipantDTO participantDTOCreated = participantTransformer.toDTO(participantCreated);

		return participantDTOCreated;
	}

	@Override
	public ParticipantDTO update(ParticipantDTO participantDTO) {
		Participant participantToUpdate = participantTransformer.toEntity(participantDTO);
		Participant participantUpdated = participantDAO.save(participantToUpdate);
		ParticipantDTO participantDTOUpdated = participantTransformer.toDTO(participantUpdated);

		return participantDTOUpdated;
	}

	@Override
	public void delete(ParticipantDTO participantDTO) {
		Participant participantToDelete = participantTransformer.toEntity(participantDTO);
		participantDAO.delete(participantToDelete);

	}

	@Override
	public ParticipantDTO getById(Long id) {
		Optional<Participant> participant = participantDAO.findById(id);
		if (participant.isPresent()) {
			return participantTransformer.toDTO(participant.get());
		}
		return null;
	}

	@Override
	public List<ParticipantDTO> getAll() {
		List<Participant> listParticipant = participantDAO.findAll();
		List<ParticipantDTO> listParticipantDTO = participantTransformer.toDTOList(listParticipant);

		return listParticipantDTO;

	}

	@Override
	public List<Long> getParticipant(String email, String motDePasse) {
		List<Long> listIdParticipant = participantDAO.findByEmailAndMotDePasse(email, motDePasse);
		return listIdParticipant;

	}
}
