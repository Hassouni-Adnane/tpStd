package com.project2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @NoArgsConstructor @AllArgsConstructor @ToString @Builder
@Setter
public class student {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	private String name;
	private Integer code;
	@Enumerated (EnumType.STRING)
	private classe classe;
}
