package entregas.primeiraEntrega;

public class RH {

	public void reajustePercentual(Funcionario funcionario, Double percentual) {
		funcionario.setSalario(funcionario.getSalario()*(1+percentual/100));
	}
	
	public void reajusteValorNovo(Funcionario funcionario, Double valorNovo) {
		funcionario.setSalario(valorNovo);
	}
	
}
