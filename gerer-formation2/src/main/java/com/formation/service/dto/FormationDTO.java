package com.formation.service.dto;

public class FormationDTO {
	private Long id;
	private Long idFormateur;
	private String titre;
	private String langue;
	private String presentation;
	private String texteDuBouton;
	private Boolean statut;
    private String liencv;

	public FormationDTO(Long id, Long idFormateur, String titre, String langue, String presentation,
			String texteDuBouton, Boolean statut,String liencv) {
		super();
		this.id = id;
		this.idFormateur = idFormateur;
		this.titre = titre;
		this.langue = langue;
		this.presentation = presentation;
		this.texteDuBouton = texteDuBouton;
		this.statut = statut;
		this.liencv=liencv;
	}

	public FormationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLiencv() {
		return liencv;
	}

	public void setLiencv(String liencv) {
		this.liencv = liencv;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
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

	public String getPresentation() {
		return presentation;
	}

	public void setPrésentation(String présentation) {
		this.presentation = présentation;
	}

	public String getTexteDuBouton() {
		return texteDuBouton;
	}

	public void setTexteDuBouton(String texteDuBouton) {
		this.texteDuBouton = texteDuBouton;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	@Override
	public String toString() {
		return "FormationDTO [id=" + id + ", idFormateur=" + idFormateur + ", titre=" + titre + ", langue=" + langue
				+ ", présentation=" + presentation + ", texteDuBouton=" + texteDuBouton + ", statut=" + statut + ",liencv="+liencv+"]";
	}

}
