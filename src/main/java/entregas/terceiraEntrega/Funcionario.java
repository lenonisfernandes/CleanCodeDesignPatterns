package entregas.terceiraEntrega;

import java.util.List;

public class Funcionario implements Componente{
	
	private String nome;
	private List<Telefone> telefones;
	private Endereco endereco;
	private Double salario;
	private Setor setor;
	private Cargo cargo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public StringBuilder construirInformacoes() {
		StringBuilder sb = new StringBuilder();
		sb.append("- ");
		sb.append(getNome());
		sb.append(" - ");
		sb.append(getCargo());
		sb.append(" - ");
		sb.append(getSetor());
		return sb;
	}
	
	public void exibirInformacoes() {
		
		System.out.println(construirInformacoes().toString());
		
	}

}
