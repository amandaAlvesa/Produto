package br.com.api.produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produto.model.ProdutoModel;
import br.com.api.produto.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService ps;
	
	@GetMapping("/listar")
	public Iterable<ProdutoModel> listar() {
		return ps.listar();
		}
	
	@GetMapping("/")
	public String rota() {
		return "API retorno";
	}
}