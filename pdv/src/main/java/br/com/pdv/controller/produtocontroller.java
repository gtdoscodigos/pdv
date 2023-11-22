package br.com.pdv.controller;

import javax.swing.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.pdv.repository.ProdutoRepository;

	@Controller


public class produtocontroller {
		@Autowired
		private ProdutoRepository ProdutoRepository;
		
		@GetMapping({"/produto"})
		public String home(ModelMap  model){
			
			model.addAttribute("produto", ProdutoRepository.findAll());
				
			return "produto";
		}


}
