package com.saa.hito_login.data;

import com.saa.hito_login.model.Usuario;

public interface UsuarioRepository {
	Usuario save(Usuario usuario);
	Usuario findOne(String mail, String pass);
	Iterable<Usuario> findAll();
}
