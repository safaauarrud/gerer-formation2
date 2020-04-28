package com.formation.service.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CartDTO{
	private Long idCart;
	private Long id;
	private Long idFormateur;
	private String titre;
	private String langue;
	private String description;
	private String dateDeFormation;
	private double prix;
	private String emplacement;
	
	public CartDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDTO(Long idCart, Long id, Long idFormateur, String titre, String langue, String description,
			String dateDeFormation, double prix, String emplacement) {
		super();
		this.idCart = idCart;
		this.id = id;
		this.idFormateur = idFormateur;
		this.titre = titre;
		this.langue = langue;
		this.description = description;
		this.dateDeFormation = dateDeFormation;
		this.prix = prix;
		this.emplacement = emplacement;
	}

	public Long getIdCart() {
		return idCart;
	}

	public void setIdCart(Long idCart) {
		this.idCart = idCart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdFormateur() {
		return idFormateur;
	}

	public void setIdFormateur(Long idFormateur) {
		this.idFormateur = idFormateur;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDateDeFormation() {
		return dateDeFormation;
	}

	public void setDateDeFormation(String dateDeFormation) {
		this.dateDeFormation = dateDeFormation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	@Override
	public String toString() {
		return "CartDTO [idCart=" + idCart + ", id=" + id + ", idFormateur=" + idFormateur + ", titre=" + titre
				+ ", langue=" + langue + ", description=" + description + ", dateDeFormation=" + dateDeFormation
				+ ", prix=" + prix + ", emplacement=" + emplacement + "]";
	}
	


	
}
