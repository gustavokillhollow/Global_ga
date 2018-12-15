package br.com.gustavo.globalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroClienteController {
	
	@GetMapping(value = "/cadastrocliente")
	public String redirectCadastro() {
		return "cadastro-cliente";
	}

}
