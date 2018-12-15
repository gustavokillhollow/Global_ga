package br.com.gustavo.globalgames.controller;

import br.com.gustavo.globalgames.domain.Cliente;
import br.com.gustavo.globalgames.domain.Jogo;
import br.com.gustavo.globalgames.model.ClienteDAO;
import br.com.gustavo.globalgames.model.JogoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class LocacaoController {

	@Autowired
	ClienteDAO clienteDAO;

	@Autowired
	JogoDAO jogoDAO;

	@GetMapping(value = "/cadastrolocacao")
	public ModelAndView redirectCadastro(ModelMap map) {

		List<Cliente> clientes = clienteDAO.findAll();
		List<Jogo> jogos = jogoDAO.findAll();
		map.addAttribute("clientes", clientes);
		map.addAttribute("jogos", jogos);
		return new ModelAndView("cadastro-locacao",map);
	}

}
