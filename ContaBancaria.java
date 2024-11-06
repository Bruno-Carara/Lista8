package Associação;

public class ContaBancaria {

	protected Banco banco;
	protected Pessoa2 corretista;
	private int agencia;
	private int numeroDaConta;
	private double saldo;
	
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public Pessoa2 getCorretista() {
		return corretista;
	}
	public void setCorretista(Pessoa2 corretista) {
		this.corretista = corretista;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public static boolean deposito(double valor) {
		return true;
	}
	public static boolean saque(double valor) {
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", corretista=");
		builder.append(corretista);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroDaConta=");
		builder.append(numeroDaConta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
}
