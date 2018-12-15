package br.com.gustavo.globalgames.controller;

import br.com.gustavo.globalgames.domain.Cliente;
import br.com.gustavo.globalgames.model.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ClienteController {

	@Autowired
	ClienteDAO dao;

	@GetMapping(value = "/cadastrocliente")
	public String redirectCadastro() {
		return "cadastro-cliente";
	}

	@GetMapping(value = "/cadastrocliente/novo")
	public String cadastraCliente(HttpServletRequest request){

		Cliente cliente = new Cliente();
		cliente.setNome(request.getParameter("nome").toString());
		cliente.setCpf(request.getParameter("cpf").toString());

		dao.salvar(cliente);
		return "cadastro-cliente-sucesso";
	}

}
