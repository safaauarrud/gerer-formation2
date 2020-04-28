package com.formation.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.formation.service.FormateurService;
import com.formation.service.FormationService;
import com.formation.service.ParticipantService;
import com.formation.service.dto.ParticipantDTO;

@Controller
public class ParticipantController {
	@Autowired
	private ParticipantService participantService;
	@Autowired
	FormateurService formateurService;
	@Autowired
	FormationService formationService;

	@Autowired
	// private ParticiperFormationService participerFormationService;

	@GetMapping("/Connexion")
	public ModelAndView Connexion() {
		return new ModelAndView("connexion");
	}

	@GetMapping("/inscriptionParticipant")
	public ModelAndView inscription(Map<String, Object> model) {
		return new ModelAndView("inscriptionParticipant");
	}

	@GetMapping("/Participants")
	public List<ParticipantDTO> home() {

		List<ParticipantDTO> listParticipantDTO = participantService.getAll();
		return listParticipantDTO;
	}

	@RequestMapping(value = "/addParticipant")
	private ModelAndView createParticipant(@ModelAttribute ParticipantDTO participantDTO) {

		participantService.create(participantDTO);
		return new ModelAndView("Participant");
	}

	@PutMapping("/updateParticipant/{id}")
	private List<ParticipantDTO> updateParticipants(@PathVariable("id") Long id,
			@ModelAttribute ParticipantDTO participantDTO) {
		participantDTO.setId(id);
		participantService.update(participantDTO);
		List<ParticipantDTO> listParticipantDTO = participantService.getAll();

		return listParticipantDTO;

	}

	@DeleteMapping("/deleteParticipant/{id}")
	private List<ParticipantDTO> deleteParticipant(@PathVariable("id") Long id) {

		ParticipantDTO participantDto = participantService.getById(id);
		participantService.delete(participantDto);

		List<ParticipantDTO> listParticipantDTO = participantService.getAll();

		return listParticipantDTO;
	}

	/*
	 * @RequestMapping("/conexionParticipant") public ModelAndView
	 * connexion(@ModelAttribute("email") String email,
	 * 
	 * @ModelAttribute("motDePasse") String motDePasse, Map<String, Object> model) {
	 * List<Long> idParticipant = participantService.getParticipant(email,
	 * motDePasse); if (idParticipant.size() == 0) { List<Long> idFormateur =
	 * formateurService.getFormateur(email, motDePasse); if (idFormateur.size() ==
	 * 0) { return new ModelAndView("connexion"); } else {
	 * 
	 * model.put("listFormationDTO",
	 * formationService.getFormation(idFormateur.get(0))); return new
	 * ModelAndView("Formateur"); } } else { model.put("listFormationDTO",
	 * participerFormationService.getFormation(idParticipant.get(0)));
	 * model.put("idParticipant",
	 * participerFormationService.getFormation(idParticipant.get(0))); return new
	 * ModelAndView("Participant"); }
	 * 
	 * }
	 */

}
