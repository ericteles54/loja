package br.com.casadocodigo.loja.conf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
@ComponentScan(basePackages="br.com.casadocodigo")
public class LojaApplication {
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
			InternalResourceViewResolver resolver =	new	InternalResourceViewResolver();
			resolver.setPrefix("/WEB-INF/views/");
			resolver.setSuffix(".jsp");	
			return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}
}
