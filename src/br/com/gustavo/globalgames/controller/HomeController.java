
package br.com.gustavo.globalgames.controller;

import br.com.gustavo.globalgames.model.ClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@Autowired
	ClienteDAO dao;

	@GetMapping(value = "/")
	public String redirectHome()
	{
		return "index";
	}
}
