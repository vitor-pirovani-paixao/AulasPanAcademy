package com.exexcio.um.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exexcio.um.models.*;

@RestController
@RequestMapping(path="/resposta")
public class Controller {
	@GetMapping
	public String habilidade() {
		return "Precisei de boa memória pra lembrar o que foi feito e replicar!";
	}
	@GetMapping(path="/objeto")
	public Cliente retornaCliente() {
		return new Cliente("Vitor",29);
	}
	

}
