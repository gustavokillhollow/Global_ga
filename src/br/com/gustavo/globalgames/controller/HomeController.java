
package br.com.gustavo.globalgames.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/home", produces = MediaType.APPLICATION_JSON_VALUE)
	public String redirectHome() {
		return "{\"home\":\"Funcionando\"}";
	}
}
