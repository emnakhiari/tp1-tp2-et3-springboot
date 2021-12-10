package com.emna.foods.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Types {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypes;
	private String nomTypes;
	private String descriptionTypes;

	
	@JsonIgnore
	@OneToMany(mappedBy = "Types")
	private List<Foods> Foods;
	public Types() {
		
	}
	public Types(String nomTypes, String descriptionTypes, List<Foods> foods) {
		super();
		this.nomTypes = nomTypes;
		this.descriptionTypes = descriptionTypes;
		this.Foods = foods;
	}
	public Long getIdTypes() {
		return idTypes;
	}
	public void setIdTypes(Long idTypes) {
		this.idTypes = idTypes;
	}
	public String getNomTypes() {
		return nomTypes;
	}
	public void setNomTypes(String nomTypes) {
		this.nomTypes = nomTypes;
	}
	public String getDescriptionTypes() {
		return descriptionTypes;
	}
	public void setDescriptionTypes(String descriptionTypes) {
		this.descriptionTypes = descriptionTypes;
	}

	
	
	
}
