package com.formation.repository.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
@Entity
public class Cart{
    //private static final Long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    /*@OneToOne
    private Formation formation;*/
	private Long idCart;	
	private String titre;
	private Long id;
	private Long idFormateur;
	private String langue;
	private String description;
	@JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
	private String DateDeFormation;
	private double prix;
	private String emplacement;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(Long idCart, String titre, Long id, Long idFormateur, String langue, String description,
			String dateDeFormation, double prix, String emplacement) {
		super();
		this.idCart = idCart;
		this.titre = titre;
		this.id = id;
		this.idFormateur = idFormateur;
		this.langue = langue;
		this.description = description;
		DateDeFormation = dateDeFormation;
		this.prix = prix;
		this.emplacement = emplacement;
	}
	public Long getIdCart() {
		return idCart;
	}
	public void setIdCart(Long idCart) {
		this.idCart = idCart;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
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
		return DateDeFormation;
	}
	public void setDateDeFormation(String dateDeFormation) {
		DateDeFormation = dateDeFormation;
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
	

	

	
}
