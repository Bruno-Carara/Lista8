package Associação;

public class ContaSimples extends ContaBancaria{

	private double saldoPoupanca;

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	public static boolean depositoPoupanca(double valor) {
		return true;
	}
	public static boolean saquePoupanca (double valor) {
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		return builder.toString();
	}
	
}
