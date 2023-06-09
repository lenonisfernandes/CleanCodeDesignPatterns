package entregas.primeiraEntrega;

import java.util.List;

public class FuncionarioTerceirizado {
	
	private String nome;
	private List<String> telefones;
	private String endereco;
	private Double salario;
	private Setor setor;
	private Cargo cargo;
	private String empresaContratada;
	private Integer tempoPermanencia;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
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
	public String getEmpresaContratada() {
		return empresaContratada;
	}
	public void setEmpresaContratada(String empresaContratada) {
		this.empresaContratada = empresaContratada;
	}
	public Integer getTempoPermanencia() {
		return tempoPermanencia;
	}
	public void setTempoPermanencia(Integer tempoPermanencia) {
		this.tempoPermanencia = tempoPermanencia;
	}
	
	

}
