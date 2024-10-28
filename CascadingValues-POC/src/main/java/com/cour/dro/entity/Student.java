package com.cour.dro.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentid;

	@NotNull
	private String studentName;

	@NotNull
	private String course;

	@NotNull
	private String javaSkillLevel;

	private String pythonSkillLevel;
	@JsonProperty("Spring")
	private String Spring;
	@JsonProperty("Django")
	private String Django;

	@JsonProperty("Aws")
	private String Aws;

}
