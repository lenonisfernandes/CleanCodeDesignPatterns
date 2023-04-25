package entregas.terceiraEntrega;

public class FuncionarioTerceirizado extends Funcionario {
	
	
	
	private String empresaContratada;
	private Integer tempoPermanencia;
	
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
	
	@Override
	public StringBuilder construirInformacoes() {
		StringBuilder sb = super.construirInformacoes();
		sb.append(" - ");
		sb.append(getEmpresaContratada());
		return sb;
	}
	
	

}
