package sevice;

import java.math.BigDecimal;
import java.math.RoundingMode;

import model.Funcionario;
import validacao.ValidacaoException;

public class ValidacaoReajustarPercentual implements ValidacaoReajusteInterface{

	public void reajustarSalario(Funcionario funcionario, BigDecimal reajuste) {
	BigDecimal percentualReajuste = reajuste.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
	if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
		throw new ValidacaoException("Reajuste inválido, o reajuste é limitado à 40%");
	}	
	}
}
