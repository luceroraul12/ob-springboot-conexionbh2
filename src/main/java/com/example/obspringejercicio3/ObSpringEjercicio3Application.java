package com.example.obspringejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringEjercicio3Application.class, args);

		MensualidadRepository repository = context.getBean(MensualidadRepository.class);

		System.out.println("Mensualidades Registradas: "+ repository.count());

		//insertar un objeto Mensualidad
		repository.save(new Mensualidad("Rovistar"));
		System.out.println("Mensualidades Registradas: "+ repository.count());

	}

}
