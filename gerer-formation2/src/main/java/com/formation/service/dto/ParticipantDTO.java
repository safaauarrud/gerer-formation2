package com.formation.service.dto;

public class ParticipantDTO {
	private Long id;
	private String email;
	private String motDePasse;
	private String identifiant;
	private String phone;

	@Override
	public String toString() {
		return "ParticipantDTO [id=" + id + ", email=" + email + ", motDePasse=" + motDePasse + ", identifiant="
				+ identifiant + ", phone=" + phone + "]";
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public ParticipantDTO(Long id, String email, String motDePasse, String identifiant, String phone) {
		super();
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;
		this.identifiant = identifiant;
		this.phone = phone;
	}

	public ParticipantDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
