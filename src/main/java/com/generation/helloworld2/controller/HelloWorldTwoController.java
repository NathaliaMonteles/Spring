package com.generation.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world-two")
public class HelloWorldTwoController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("bsm-generation")
	public String bsmGeneration() {
		return "Competências Comportamentais:\n"
				+ "\n"
				+ "Comunicação\n"
				+ "Proatividade\n"
				+ "Orientação ao detalhe\n"
				+ "Trabalho em equipe\n"
				+ "\n"
				+ "Mentalidades:\n"
				+ "\n"
				+ "Responsabilidade Pessoal\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao Futuro\n"
				+ "Persistencia";
	}

	@GetMapping("objetivos-pessoais")
	public String objetivosPessoais() {
		return "Nessa semana estou me empenhando para finalizar a revisão de Java, MySQL"
				+ "e agora, estarei me dedicando mais para Spring";
	}

}
