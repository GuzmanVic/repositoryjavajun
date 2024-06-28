package com.item;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	//RestTemplate: CLIENTE HTTP, PARA ACCEDER A RECURSOS QUE ESTÁN EN OTROS SERVICIOS, MICROSERVICIOS O APIS
	@Bean("clienteRest")
	RestTemplate registarRestTemplate() {
		return new RestTemplate();
	}
}
