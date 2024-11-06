package Associação;

public class ContaEspecial {

	protected CartaoDeCredito cartao;
	private int diasSemJuros;
	private double limite;
	public CartaoDeCredito getCartao() {
		return cartao;
	}
	public void setCartao(CartaoDeCredito cartao) {
		this.cartao = cartao;
	}
	public int getDiasSemJuros() {
		return diasSemJuros;
	}
	public void setDiasSemJuros(int diasSemJuros) {
		this.diasSemJuros = diasSemJuros;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaEspecial [cartao=");
		builder.append(cartao);
		builder.append(", diasSemJuros=");
		builder.append(diasSemJuros);
		builder.append(", limite=");
		builder.append(limite);
		builder.append("]");
		return builder.toString();
	}
	
}
