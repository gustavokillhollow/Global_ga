package br.com.gustavo.globalgames.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("br.com.gustavo.globalgames")
@EnableWebMvc
public class Root {

}
