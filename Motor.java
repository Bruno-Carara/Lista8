package Associação;

public class Motor {

	private String marca;
	private float potência;
	private int cilindros;
	private String combustível;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPotência() {
		return potência;
	}
	public void setPotência(float potência) {
		this.potência = potência;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getCombustível() {
		return combustível;
	}
	public void setCombustível(String combustível) {
		this.combustível = combustível;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Motor [marca=");
		builder.append(marca);
		builder.append(", potência=");
		builder.append(potência);
		builder.append(", cilindros=");
		builder.append(cilindros);
		builder.append(", combustível=");
		builder.append(combustível);
		builder.append("]");
		return builder.toString();
	}
	
}
