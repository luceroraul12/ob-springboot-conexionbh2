package com.example.obspringejercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringEjercicio3Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringEjercicio3Application.class, args);

		MensualidadRepository repository = context.getBean(MensualidadRepository.class);

		//desde aca hacia abajo lo hice para probar los metodos que usaré en un proyecto que quiero hacer
		System.out.println("Mensualidades Registradas: "+ repository.count());

		//insertar un objeto Mensualidad
		repository.save(new Mensualidad("Megastar"));
		System.out.println("Mensualidades Registradas: "+ repository.count());
		//mostrar contenido
		System.out.println("Información almacenada: ");
		for (Mensualidad mensualidad : repository.findAll()){
			System.out.println(mensualidad);
		}
	}

}
