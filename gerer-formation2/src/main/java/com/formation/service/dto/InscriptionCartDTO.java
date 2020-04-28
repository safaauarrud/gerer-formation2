package com.formation.service.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class InscriptionCartDTO {
	 //private static final Long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	   private Long id;
		private Long idCart;	
		private String titre;
		private Long idParticipant;
		private String localisation;
		private String email;
		private Long numerotel;
		

		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getIdParticipant() {
			return idParticipant;
		}

		public void setIdParticipant(Long idParticipant) {
			this.idParticipant = idParticipant;
		}

		public String getLocalisation() {
			return localisation;
		}

		public void setLocalisation(String localisation) {
			this.localisation = localisation;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			email = email;
		}

		
		

		public Long getNumerotel() {
			return numerotel;
		}

		public void setNumerotel(Long numerotel) {
			this.numerotel = numerotel;
		}

		public Long getIdCart() {
			return idCart;
		}

		public void setIdCart(Long idCart) {
			this.idCart = idCart;
		}

		
		public InscriptionCartDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public InscriptionCartDTO(Long id,Long idCart,String titre,Long idParticipant, String localisation,String email 
			, Long numerotel) {
			super();
			this.id=id;
			this.idCart=idCart;
			this.titre = titre;
			this.idParticipant = idParticipant;
			this.localisation = localisation;
			this.email=email;
			this.numerotel = numerotel;
			
		}

		public String getTitre() {
			return titre;
		}

		public void setTitre(String titre) {
			this.titre = titre;
		}

		
		/*public Formation getFormation() {
			return formation;
		}

		public void setFormation(Formation formation) {
			this.formation = formation;
		}*/

		
		
		@Override
		public String toString() {
			return "InscriptionCart[id="+id+",idCart="+idCart+",titre=" + titre + ", idParticipant=" + idParticipant + ", localisation=" + localisation + ", email=" + email+ ", numerotel=" + numerotel+  "]";
		}

		/*@Override
		public String toString() {
			return "Formation [idCart="+idCart+",id=" + id + "]";
		}*/
		
}
