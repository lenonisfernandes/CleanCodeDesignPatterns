package entregas.segundaEntrega;

public class RH {
	
	public boolean funcionarioIsTerceirizado(Funcionario funcionario) {
		return funcionario instanceof FuncionarioTerceirizado;
	}

	public void reajustePercentual(Funcionario funcionario, Double percentual) {
		if (!funcionarioIsTerceirizado(funcionario)) {
			funcionario.setSalario(funcionario.getSalario() * (1 + percentual / 100));
		}
	}

	public void reajusteValorNovo(Funcionario funcionario, Double valorNovo) {
		if (!funcionarioIsTerceirizado(funcionario)) {
			funcionario.setSalario(valorNovo);
		}
	}

}
