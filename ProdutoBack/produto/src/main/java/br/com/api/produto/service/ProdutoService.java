package br.com.api.produto.service;

import java.math.BigDecimal;
import java.sql.PseudoColumnUsage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.produto.model.ProdutoModel;
import br.com.api.produto.model.ResponseModel;
import br.com.api.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository pr;

	@Autowired
	private ResponseModel rm;

	// add produtos
	public ResponseEntity<?> cadastrar(ProdutoModel produto) {

		if (produto.getName().equals("")) {
			rm.setMensagem("Adicione o Nome!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		}else if (produto.getPreco().equals("")) {
			rm.setMensagem("Adicione o Preco!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		}  else if (produto.getMarca().equals("")) {
			rm.setMensagem("Adicione a Marca!");
			return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<ProdutoModel>(pr.save(produto) , HttpStatus.CREATED);
		}
	}

	// método para listar todos os produtos
	public Iterable<ProdutoModel> listar() {
		return pr.findAll();
	}
}
