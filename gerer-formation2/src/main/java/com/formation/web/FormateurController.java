package com.formation.web;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.formation.service.FormateurService;
import com.formation.service.dto.FormateurDTO;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FormateurController {
	@Autowired
	private FormateurService formateurService;

	@GetMapping("/incriptionFormateur")
	public ModelAndView inscriptino(Map<String, Object> model) {
		return new ModelAndView("inscriptionFormateur");
	}

	@GetMapping("/Formateurs")
	public ModelAndView home(Map<String, Object> model) {

		List<FormateurDTO> listFormateurDTO = formateurService.getAll();
		model.put("listFormateurDTO", listFormateurDTO);
		return new ModelAndView("inscriptionFormateur");
	}

	@RequestMapping("/addFormateur")
	private ModelAndView createFormateur(@Valid @RequestBody FormateurDTO formateurDTO) {

		formateurService.create(formateurDTO);
		return new ModelAndView("Formateur");
	}

	@PutMapping("/updateFormateur/{id}")
	private List<FormateurDTO> updateFormateurs(@PathVariable("id") Long id,
			@ModelAttribute FormateurDTO formateurDTO) {
		formateurDTO.setId(id);
		formateurService.update(formateurDTO);
		List<FormateurDTO> listFormateurDTO = formateurService.getAll();

		return listFormateurDTO;

	}

	@DeleteMapping("/deleteFormateur/{id}")
	private List<FormateurDTO> deleteFormateur(@PathVariable("id") Long id) {

		FormateurDTO formateurDto = formateurService.getById(id);
		formateurService.delete(formateurDto);

		List<FormateurDTO> listFormateurDTO = formateurService.getAll();

		return listFormateurDTO;
	}

}
