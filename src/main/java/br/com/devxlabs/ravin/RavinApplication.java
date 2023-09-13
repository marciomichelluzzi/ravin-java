package br.com.devxlabs.ravin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API's do ravin", 
					version = "1", 
					description = "Documentação das API's do projeto Ravin"))
public class RavinApplication {

	// http://localhost:8080/swagger-ui/index.html

	public static void main(String[] args) {
		SpringApplication.run(RavinApplication.class, args);
	}

}
