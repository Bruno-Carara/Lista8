package Associação;

public class Banco {

	private int codigo;
	private int numeroAgencias;
	private String nome;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getNumeroAgencias() {
		return numeroAgencias;
	}
	public void setNumeroAgencias(int numeroAgencias) {
		this.numeroAgencias = numeroAgencias;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [codigo=");
		builder.append(codigo);
		builder.append(", numeroAgencias=");
		builder.append(numeroAgencias);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
