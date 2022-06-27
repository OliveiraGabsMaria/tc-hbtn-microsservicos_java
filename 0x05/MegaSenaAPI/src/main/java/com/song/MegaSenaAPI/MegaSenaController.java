package com.song.MegaSenaAPI;

import java.util.List;
import java.util.Random;
import java.util.TreeSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/megasena")
public class MegaSenaController {
	
	@GetMapping("/simpleMessageWelcome")
	   public String mensagemBoasVindas() {
	        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
	   }


	   @GetMapping("/getNumbers")
	   public List<Integer> numerosMegaSena() {
	        Random random = new Random();
	        TreeSet<Integer> numeros = new TreeSet<Integer>();
	        
	        while(numeros.size() < 6) {
	        	numeros.add(random.nextInt(60 ) + 1);
	        }
	        return numeros.stream().toList();
	   }
}
