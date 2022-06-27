package sevice;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import model.Funcionario;
import validacao.ValidacaoException;

public class ValidacaoParametroData {
	
	public void reajustarSalario(Funcionario funcionario, BigDecimal reajuste) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();		
		LocalDate hoje = LocalDate.now();
		long mesesQueSePassou = ChronoUnit.MONTHS.between(dataUltimoReajuste, hoje);
		if (mesesQueSePassou < 6) {
			throw new ValidacaoException("Reajuste negado, verifica se o intervalo de reajuste é maior que 6 meses");
		}
	}

}
