package br.com.gustavo.globalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroJogoController {
	
	@GetMapping(value = "/cadastrojogo")
	public String redirectCadastro() {
		return "cadastro-jogo";
	}
}
