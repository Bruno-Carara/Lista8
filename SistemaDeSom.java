package Associação;

public class SistemaDeSom extends EquipamentoEletronico{

	private String marca = "Sony";
	private String modelo = "X";
	private float potência = 12;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		if (marca.length()>0)
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length()>0)
		this.modelo = modelo;
	}
	public float getPotência() {
		return potência;
	}
	public void setPotência(float potência) {
		if(potência>0)
		this.potência = potência;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeSom [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", potência=");
		builder.append(potência);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
