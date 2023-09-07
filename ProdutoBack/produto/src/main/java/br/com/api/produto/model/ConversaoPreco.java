package br.com.api.produto.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConversaoPreco {

	@SuppressWarnings("unused")
	private BigDecimal price(ProdutoModel pm) {
		try {
			return new BigDecimal(pm.getPreco()).setScale(4, RoundingMode.HALF_EVEN);
		} catch (Exception e) {
				return BigDecimal.ZERO;		
			}
	}
}
