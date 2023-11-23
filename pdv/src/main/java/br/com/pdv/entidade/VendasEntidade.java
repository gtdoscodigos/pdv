package br.com.pdv.entidade;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "vendas",schema = "pdv")
public class VendasEntidade implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="id_produto")
	private Long id_produto;
	
	@Column(name="id_cliente")
	private Long id_cliente;
	
	@Column(name="id_vendedor")
	private Long id_vendedor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Long getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Long id_vendedor) {
		this.id_vendedor = id_vendedor;
	}
	
	
}