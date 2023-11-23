package br.com.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pdv.entidade.ClienteEntidade;
	
	@Repository
	public interface ClienteRepository extends JpaRepository <ClienteEntidade, Long>{

		
}

	