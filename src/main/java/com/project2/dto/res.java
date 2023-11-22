package com.project2.dto;

import com.project2.entities.classe;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data @AllArgsConstructor @NoArgsConstructor @Builder @ToString

public class res {

	private Integer id;
	private String name;
	private Integer code;
	private classe classe;
}
