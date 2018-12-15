
package br.com.gustavo.globalgames.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.gustavo.globalgames.domain.Cliente;
import br.com.gustavo.globalgames.model.ClienteDAOImpl;

@Controller
public class HomeController {

	@GetMapping(value = "/")
	public String redirectHome()
	{
		
		Cliente c = new Cliente();
		c.setNome("Pedor");
        c.setCpf("dfjasodfjalsdfas");
        
        new ClienteDAOImpl().salvar(c);
		return "index";
	}
}
