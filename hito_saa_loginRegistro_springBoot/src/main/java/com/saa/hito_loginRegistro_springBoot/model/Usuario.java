package com.saa.hito_loginRegistro_springBoot.model;

import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Usuario {
	private int id;
	@NonNull
	private String mail;
	@NonNull
	private String pass;
}
