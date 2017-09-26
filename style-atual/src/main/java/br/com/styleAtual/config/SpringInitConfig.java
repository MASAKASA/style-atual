package br.com.styleAtual.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//CLASSE RAÍZ - QUANDO O SERVIDOR INICIAR E SUBIR A APLICAÇÃO 
		//ESSA CLASSE SERÁ A PRIMEIRA CONFIGURAÇÃO A SER CARREGADA
		return new Class[] {RootConfig.class};           
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//QUAL CLASSE CONTÉM OS SERVLETS
		return new Class[] {SpringMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		//mapeamendo do servlet - 
		//SEMPRE QUE A APLICAÇÃO ENCONTRAR UMA BARRA NA URL SABE QUE É UM SERVLET
		return new String[] {"/"};
	}

}
