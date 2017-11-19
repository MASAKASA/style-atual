package br.com.styleAtual.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import br.com.styleAtual.model.domain.Caixa;
import br.com.styleAtual.model.domain.Vendedor;

@Configuration //Anotacao informando ao Spring que essa classe e de configucao
public class SpringInitConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) throws ServletException {

        //Criacao o contexto da aplicação Spring 'root' Spring
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class, SpringJpaConfig.class);//Demais classes de configuracao
 
        //Gerencia o ciclo de vida do contexto da aplicação raiz
        container.addListener(new ContextLoaderListener(rootContext));
 
        //Cria o contexto do aplicativo Spring do servlet do dispatcher
        AnnotationConfigWebApplicationContext dispatcherServlet = new AnnotationConfigWebApplicationContext();
        dispatcherServlet.register(SpringMvcConfig.class);
             
        //Registra e mapeia o dispatcher servlet
        ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(dispatcherServlet));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
	}
}
