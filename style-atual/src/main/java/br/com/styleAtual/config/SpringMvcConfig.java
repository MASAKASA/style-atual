package br.com.styleAtual.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class SpringMvcConfig {

	//ANOTAÇÃO PARA O SPRING CONTROLAR O MÉTODO
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		//PREXIXO ONDE O SPRING VAI PROCURAR AS PÁGINAS
		resolver.setPrefix("WEB-INF/views/");
		//TIPO DE ARQUIVO DA PÁGINA
		resolver.setSuffix(".jsp");
		//INFORMANDO QUAL TIPO DE RECURSO SERÃO USADOS NA PÁGINA JSP
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
}
