package br.com.gustavo.globalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastroLocacaoController {
	
	@GetMapping(value = "/cadastrolocacao")
	public String redirectCadastro() {
		return "cadastro-locacao";
	}

}
