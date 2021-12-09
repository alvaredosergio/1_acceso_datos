package com.saa.hito_loginRegistro_springBoot.data;

import com.saa.hito_loginRegistro_springBoot.model.Usuario;

public interface UsuarioRepository {
	Usuario save(Usuario usuario);

	Usuario findOne(String mail, String pass);

	Iterable<Usuario> findAll();
}
