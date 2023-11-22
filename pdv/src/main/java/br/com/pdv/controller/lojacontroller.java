package br.com.pdv.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.LojaRepository;

	@Controller

public class lojacontroller {
	
	@Autowired
	private LojaRepository lojaRepository;
	
	@GetMapping({"/lojas"})
	public String home(ModelMap  model){
		
		model.addAttribute("lojas", lojaRepository.findAll());
			
		return "lojas";
	}
}
