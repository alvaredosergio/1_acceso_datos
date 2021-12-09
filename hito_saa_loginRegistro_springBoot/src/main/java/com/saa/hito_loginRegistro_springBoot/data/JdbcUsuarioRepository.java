package com.saa.hito_loginRegistro_springBoot.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Arrays;
import java.util.Date;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.saa.hito_loginRegistro_springBoot.model.Usuario;

@Repository
public class JdbcUsuarioRepository implements UsuarioRepository {

	private JdbcTemplate jdbc;

	public JdbcUsuarioRepository(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public Usuario save(Usuario usuario) {
		int usuarioId = saveUsuarioInfo(usuario);
		usuario.setId(usuarioId);
		return usuario;
	}

	private int saveUsuarioInfo(Usuario usuario) {
		PreparedStatementCreatorFactory pscf = new PreparedStatementCreatorFactory(
				"INSERT INTO users(mail, pass) VALUES (?, ?)", Types.VARCHAR, Types.VARCHAR);
		pscf.setReturnGeneratedKeys(true);
		PreparedStatementCreator psc = pscf
				.newPreparedStatementCreator(Arrays.asList(usuario.getMail(), usuario.getPass()));

		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbc.update(psc, keyHolder);
		Number id = keyHolder.getKey();
		return id.intValue();
	}

	@Override
	public Usuario findOne(String mail, String pass) {
		Usuario usuario = null;
		try {
			usuario = jdbc.queryForObject("SELECT * FROM users WHERE mail = ? AND pass = ?", this::mapRowToUser, mail,
					pass);
		} catch (Exception e) {

		}
		return usuario;
	}

	@Override
	public Iterable<Usuario> findAll() {
		return jdbc.query("SELECT * FROM users", this::mapRowToUser);
	}

	private Usuario mapRowToUser(ResultSet rs, int rowNum) {
		Usuario usuario = null;
		try {
			usuario = new Usuario(rs.getInt("id"), rs.getString("mail"), rs.getString("pass"));
		} catch (Exception e) {
		}
		return usuario;
	}

}
