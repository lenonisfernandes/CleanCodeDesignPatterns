package entregas.terceiraEntrega;

import java.util.ArrayList;
import java.util.List;

public class Time implements Componente{
	
	private String nome;
	private List<Componente> funcionarios = new ArrayList();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addFuncionario(Componente funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Componente funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public void exibirInformacoes() {
		System.out.println("Componentes do Time "+ nome);
		for(Componente f : funcionarios) {
			f.exibirInformacoes();
		}
	}
	

	
	

}
