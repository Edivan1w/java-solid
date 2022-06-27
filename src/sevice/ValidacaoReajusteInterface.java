package sevice;

import java.math.BigDecimal;

import model.Funcionario;

public interface ValidacaoReajusteInterface {

	void reajustarSalario(Funcionario funcionario, BigDecimal reajuste);
}
