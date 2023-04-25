package entregas.terceiraEntrega;

import java.util.List;

public class FuncionarioTerceirizadoBuilder {
	
	public static FuncionarioTerceirizadoBuilder builder() {
		return new FuncionarioTerceirizadoBuilder();
	}
	
	private String nome;
	private List<Telefone> telefones;
	private Endereco endereco;
	private Double salario;
	private Setor setor;
	private Cargo cargo;
	private String empresaContratada;
	private Integer tempoPermanencia;
	
	public FuncionarioTerceirizadoBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}
	
    public FuncionarioTerceirizadoBuilder telefones(List<Telefone> telefones) {
        this.telefones.addAll(telefones);
        return this;
    }

    public FuncionarioTerceirizadoBuilder endereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public FuncionarioTerceirizadoBuilder salario(double salario) {
        this.salario = salario;
        return this;
    }

    public FuncionarioTerceirizadoBuilder setor(Setor setor) {
        this.setor = setor;
        return this;
    }

    public FuncionarioTerceirizadoBuilder cargo(Cargo cargo) {
        this.cargo = cargo;
        return this;
    }

    public FuncionarioTerceirizadoBuilder empresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
        return this;
    }

    public FuncionarioTerceirizadoBuilder tempoPermanencia(int tempoPermanencia) {
        this.tempoPermanencia = tempoPermanencia;
        return this;
    }

    public FuncionarioTerceirizado build() {
    	FuncionarioTerceirizado func = new FuncionarioTerceirizado();
    	func.setNome(nome);
    	func.setCargo(cargo);
    	func.setEmpresaContratada(empresaContratada);
    	func.setEndereco(endereco);
    	func.setSalario(salario);
    	func.setSetor(setor);
    	func.setTelefones(telefones);
    	func.setTempoPermanencia(tempoPermanencia);
    	return func;
    }
	
	

}
