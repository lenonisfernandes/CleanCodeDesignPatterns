package entregas.terceiraEntrega;

public class RH implements FuncionarioObserver {
	
	private static RH instancia = null;
	
	private RH() {
		
	}
	
	public static RH getInstancia() {
		if (instancia == null) {
			instancia = new RH();
		}
		return instancia;
	}
	
	 public void notificarReajuste(Funcionario funcionario) {
		 System.out.println("Alteração de Salário: " + funcionario.getNome() + " -> R$" 
				 + funcionario.getSalario());
	 }
	
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
