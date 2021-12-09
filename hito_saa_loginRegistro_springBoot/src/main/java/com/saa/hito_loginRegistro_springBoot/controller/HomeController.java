package com.saa.hito_loginRegistro_springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controlador del home
@Controller
public class HomeController {
	@GetMapping({ "/", "/home" })
	public String showHome(Model model) {
		model.addAttribute("titulo", "APLICACIÓN LOGIN/REGISTRO");
		model.addAttribute("autor", "Sergio Alvaredo Álvarez");
		model.addAttribute("descripcion", "¿Que desea realizar?");
		return "home";
	}
}
