package com.saa.hito_login.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saa.hito_login.data.UsuarioRepository;
import com.saa.hito_login.model.Usuario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/registro")
public class RegistroController {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public String showLogin(Model model) {
		model.addAttribute("usuario",new Usuario());
		return "registro";
	}
	@PostMapping
	public String processLogin(@Valid @ModelAttribute(name="usuario") Usuario usuario, Model model, Errors errors) {
		Usuario u = usuarioRepository.findOne(usuario.getMail(),usuario.getPass());
		if(u == null) {
			usuarioRepository.save(usuario);
			return "redirect:/mensaje/aceptado";
		}
		return "redirect:/mensaje/usuarioexiste";
	}
	
}