package com.saa.hito_loginRegistro_springBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saa.hito_loginRegistro_springBoot.data.UsuarioRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/mensaje")

public class mensajeController {
	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/aceptado")
	public String showAceptado(Model model) {
		model.addAttribute("usuarioexiste", false);
		model.addAttribute("aceptado", true);
		model.addAttribute("usuarios", usuarioRepository.findAll());
		return "mensaje";
	}

	@GetMapping("/denegado")
	public String showDenegado(Model model) {
		model.addAttribute("usuarioexiste", false);
		model.addAttribute("aceptado", false);
		return "mensaje";
	}

	@GetMapping("/usuarioexiste")
	public String showUsuarioExiste(Model model) {
		model.addAttribute("usuarioexiste", true);
		return "mensaje";
	}

	@GetMapping("/home")
	public String showHome(Model model) {
		return "redirect:/home";
	}

}
