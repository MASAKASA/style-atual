package br.com.styleAtual.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


//@EnableWebMvc
@Configuration
//@ComponentScan("br.com.styleAtual.controller")
public class StringMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
 
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
 
    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");
        return bean;
    }
    
//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
//		source.setBasename("messages");
//		return source;
//	}
// 
//    @Bean(name = "multipartResolver")
//    public CommonsMultipartResolver getMultipartResolver() {
//        return new CommonsMultipartResolver();
//    }
// 
//    @Bean(name = "messageSource")
//    public ReloadableResourceBundleMessageSource getMessageSource() {
//        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
//        resource.setBasename("classpath:messages");
//        resource.setDefaultEncoding("UTF-8");
//        return resource;
//    }
}