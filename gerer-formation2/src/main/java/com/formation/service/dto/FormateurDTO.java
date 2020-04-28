package com.formation.service.dto;

public class FormateurDTO {
	private Long id;
	private String email;
	private String motDePasse;
	private String identifiant;
	private String photo;

	@Override
	public String toString() {
		return "FormateurDTO [id=" + id + ", email=" + email + ", motDePasse=" + motDePasse + ", identifiant="
				+ identifiant + ", photo=" + photo + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public FormateurDTO(Long id, String email, String motDePasse, String identifiant, String photo) {
		super();
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;
		this.identifiant = identifiant;
		this.photo = photo;
	}

	public FormateurDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
