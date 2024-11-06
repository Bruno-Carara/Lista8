package Associação;

public class Pessoa2 {

	private String nome;
	private String endereço;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa2 [nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append("]");
		return builder.toString();
	}
	
}
