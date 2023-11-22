package br.com.pdv.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ClienteRepository;

	@Controller

public class clientecontroller {
	
	@Autowired
	private ClienteRepository  clienteRepository;
	
	@GetMapping({"/clientes"})
	public String home(ModelMap  model){
		
		model.addAttribute("clientes", clienteRepository.findAll());
			
		return "clientes";
	}
}