package br.com.styleAtual.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration //Anotacao informando ao Spring que essa classe e de configucao
@ComponentScan("br.com.styleAtual") //Local de mapiamento para o Spring
@EnableWebMvc //Anotacao informando que vai ser utilizado o Spring MVC
public class RootConfig {

}
