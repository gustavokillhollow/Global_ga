package br.com.gustavo.globalgames.controller;

import br.com.gustavo.globalgames.domain.Jogo;
import br.com.gustavo.globalgames.model.JogoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JogoController {

	@Autowired
	JogoDAO dao;

	@GetMapping(value = "/cadastrojogo")
	public String redirectCadastro() {
		return "cadastro-jogo";
	}

	@GetMapping(value = "/cadastrojogo/novo")
	public String cadastra(HttpServletRequest request) {

		Jogo jogo = new Jogo();
		jogo.setTitulo(request.getParameter("titulo").toString());
		jogo.setGenero(request.getParameter("genero").toString());
		jogo.setPrecoDia(Float.parseFloat(request.getParameter("preco").toString()));
		jogo.setClassIndicativa(Integer.parseInt(request.getParameter("classIndicativa")));

		dao.salvar(jogo);

		return "cadastro-jogo-sucesso";
	}

}
