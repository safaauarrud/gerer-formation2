package com.formation.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Participant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String email;
	private String motDePasse;
	private String identifiant;
	private String phone;
	@OneToOne
	@JoinColumn(name = "ID_USER")
	private User user = new User();

	/*public User getUser() {
		user.setUserName(this.getIdentifiant());
		user.setPassword(this.getMotDePasse());
		return user;
	}*/

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Participant [email=" + email + ", motDePasse=" + motDePasse + ", identifiant=" + identifiant
				+ ", phone=" + phone + "]";
	}

	public Participant(String email, String motDePasse, String identifiant, String phone) {
		super();
		this.email = email;
		this.motDePasse = motDePasse;
		this.identifiant = identifiant;
		this.phone = phone;
	}

	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

}
