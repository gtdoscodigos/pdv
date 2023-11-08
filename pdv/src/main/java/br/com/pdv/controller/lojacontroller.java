package br.com.pdv.controller;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.LojaRepository;

	@Controller

public class lojacontroller {
	//criar uma instancia do nosso repositorio	
	@Autowired
	private LojaRepository lojaRepository;
	
	@GetMapping({"/lojas"})//e o nome que eu  quiser colocar 
	public String home(ModelMap  model){
		
		model.addAttribute("lojas", lojaRepository.findAll());
			
		return "lojas";
	}
}
