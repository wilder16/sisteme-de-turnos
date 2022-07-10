package com.trabajointegrador.SistemaDeTurno;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaDeTurnoApplication {

	private static final Logger LOGGER = Logger.getLogger(SistemaDeTurnoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeTurnoApplication.class, args);
		LOGGER.info("Validando login");
	}

}
