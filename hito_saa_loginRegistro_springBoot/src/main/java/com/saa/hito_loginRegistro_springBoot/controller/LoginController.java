package com.saa.hito_loginRegistro_springBoot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saa.hito_loginRegistro_springBoot.data.UsuarioRepository;
import com.saa.hito_loginRegistro_springBoot.model.Usuario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping
	public String showLogin(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}

	@PostMapping
	public String processLogin(@Valid @ModelAttribute(name = "usuario") Usuario usuario, Model model, Errors errors) {
		Usuario u = usuarioRepository.findOne(usuario.getMail(), usuario.getPass());
		if (u == null) {
			return "redirect:/mensaje/denegado";
		}

		return "redirect:/mensaje/aceptado";
	}

}
