package sevice;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Funcionario;
import validacao.ValidacaoException;

public class ReajusteService implements ValidacaoReajusteInterface {

	
	private List<ValidacaoReajusteInterface> validadacoes = new ArrayList<ValidacaoReajusteInterface>();
	
	public void reajustarSalario(Funcionario funcionario, BigDecimal reajuste) {
		validadacoes.forEach(c -> c.reajustarSalario(funcionario, reajuste));
		BigDecimal salarioReajustado = funcionario.getSalario().add(reajuste);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
