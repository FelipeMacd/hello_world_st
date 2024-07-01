package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class helloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "\t\tMENTALIDADES\n"
				+ "Persistência\n"
				+ "Responsabilidade Pessoal\n"
				+ "Mentalidade de Crescimento\n"
				+ "Orientação ao Futuro\n"
				+ "\n\t\tHABILIDADES\n"
				+ "Trabalho em Equipe\n"
				+ "Orientação ao Detalhe\n"
				+ "Comunicação\n"
				+ "Proatividade";
				
	}
	
	@GetMapping("/myweekgoals")
	public String myGoals(){
		return "Meus objetivos de aprendizagem essa semana são:\n"
				+ "1. Aprender a utilizar API com Spring Boot\n"
				+ "2. Colocar em prática esse novo conteúdo\n"
				+ "3. Terminar a semana capaz de usar O Sprig Boot com eficiência";
	}

}
