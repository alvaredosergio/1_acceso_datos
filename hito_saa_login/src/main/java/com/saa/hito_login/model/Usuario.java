package com.saa.hito_login.model;

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
	@Size(max=10,message="Contraseña muy larga.")
	@Size(min=4,message="Contraseña  muy corta.")
	private String pass;
}
