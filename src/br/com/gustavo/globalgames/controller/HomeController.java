
package br.com.gustavo.globalgames.controller;

import br.com.gustavo.globalgames.model.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.gustavo.globalgames.domain.Cliente;
import br.com.gustavo.globalgames.model.ClienteDAOImpl;

@Controller
public class HomeController {

	@Autowired
	ClienteDAO dao;

	@GetMapping(value = "/")
	public String redirectHome()
	{
		
		Cliente c = new Cliente();
		c.setNome("Pedor");
        c.setCpf("dfjasodfjalsdfas");
        
        dao.salvar(c);
		return "index";
	}
}
