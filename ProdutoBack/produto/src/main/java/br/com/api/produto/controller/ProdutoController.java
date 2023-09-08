package br.com.api.produto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.produto.model.ProdutoModel;
import br.com.api.produto.model.ResponseModel;
import br.com.api.produto.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService ps;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/listar")
	public Iterable<ProdutoModel> listar() {
		return ps.listar();
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/")
	public String rota() {
		return "API retorno";
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody ProdutoModel pm) {
		return ps.cadastrarAlterar(pm, "cadastrar");
	}

	@PutMapping("alterar")
	public ResponseEntity<?> alterar(@RequestBody ProdutoModel pm) {
		return ps.cadastrarAlterar(pm, "alterar");
	}

	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<ResponseModel> remover(@PathVariable Long id) {
		return ps.remover(id);
	}
}
