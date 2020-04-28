package com.formation.web;

/*@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		
		return "Public Content.";
	}

	
	@GetMapping("/user")
	@PreAuthorize("hasRole('USER') or hasRole('PARTICIPANT') or hasRole('FORMATEUR')")
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/participant")
	@PreAuthorize("hasRole('PARTICIPANT')")
	public String moderatorAccess() {
		return "participant Board.";
	}

	@GetMapping("/formateur")
	@PreAuthorize("hasRole('FORMATEUR')")
	public String adminAccess() {
		return "Formateur Board.";
	}
}*/
