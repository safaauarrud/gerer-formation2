package com.formation.web;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.formation.repository.FormationDAO;
import com.formation.repository.entity.Formation;
import com.formation.service.FormationService;
import com.formation.service.dto.FormationDTO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FormationController {
	@Autowired
	private FormationService formationService;
	@Autowired
	private FormationDAO serviceDao;

	@PostMapping("/addFormation")
	public Formation creerFormation(@Valid @RequestBody Formation formation) {
		return serviceDao.save(formation);
	}

	@GetMapping("/Formations")
	public List<Formation> getAllFormation() {
		return serviceDao.findAll();
	}


	@GetMapping("/getFormation/{id}")
	public ResponseEntity<Optional<Formation>> getFormationById(@PathVariable(value = "id") Long id) {
		Optional<Formation> formation = serviceDao.findById(id);
		return ResponseEntity.ok().body(formation);
	}


	@PutMapping("/updateFormation/{id}")
	private ResponseEntity<Formation> updateFormations(@PathVariable("id") Long id,
			@Valid @RequestBody Formation formationDetails) {
		Formation formation = serviceDao.getOne(id);
		formation.setTitre(formationDetails.getTitre());
		formation.setLangue(formationDetails.getLangue());
		formation.setPrix(formationDetails.getPrix());
		formation.setDateDeFormation(formationDetails.getDateDeFormation());
		formation.setDescription(formationDetails.getDescription());
		formation.setEmplacement(formationDetails.getEmplacement());
		final Formation updatedFormation = serviceDao.save(formation);
		return ResponseEntity.ok(updatedFormation);

	}

	@DeleteMapping("/deleteFormation/{id}")
	private List<FormationDTO> deleteFormation(@PathVariable("id") Long id) {

		FormationDTO formationDto = formationService.getById(id);
		formationService.delete(formationDto);

		List<FormationDTO> listFormationDTO = formationService.getAll();

		return listFormationDTO;
	}

	@GetMapping("/Recherche/{motCle}")

	public List<Formation> consulter(@PathVariable("motCle") String motCle) {

		// TODO
		return null;
	}

}
