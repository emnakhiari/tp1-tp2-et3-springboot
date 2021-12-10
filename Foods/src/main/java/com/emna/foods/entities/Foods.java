package com.emna.foods.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Foods {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFoods;
	private String nomFoods;
	private Double prixFoods;
	private Date dateCreation;
	
	
	@JsonIgnore
	@ManyToOne
	private Types Types;
	public Foods(String nomFoods, Double prixFoods, Date dateCreation ) {
		super();
		this.nomFoods = nomFoods;
		this.prixFoods = prixFoods;
		this.dateCreation = dateCreation;
		
	}
	public Foods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdFoods() {
		return idFoods;
	}
	public void setIdFoods(Long idFoods) {
		this.idFoods = idFoods;
	}
	public String getNomFoods() {
		return nomFoods;
	}
	public void setNomFoods(String nomFoods) {
		this.nomFoods = nomFoods;
	}
	public Double getPrixFoods() {
		return prixFoods;
	}
	public void setPrixFoods(Double prixFoods) {
		this.prixFoods = prixFoods;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	public Types getTypes() {
		return Types;
	}
	public void setTypes(Types types) {
		Types = types;
	}
	@Override
	public String toString() {
		return "Foods [idFoods=" + idFoods + ", nomFoods=" + nomFoods + ", prixFoods=" + prixFoods + ", dateCreation="
				+ dateCreation + ", Types=" + Types + "]";
	}
	
	
	
	
	
	
	


}
