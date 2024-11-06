package Associação;

public class SistemaDeVideo extends EquipamentoEletronico{

	private String Marca = "Z";
	private String Modelo = "Y";
	private String Tipo = "?";
	private String Resolução = "2fps";
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		if(marca.length()>0)
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		if(modelo.length()>0)
		Modelo = modelo;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		if(tipo.length()>0)
		Tipo = tipo;
	}
	public String getResolução() {
		return Resolução;
	}
	public void setResolução(String resolução) {
		if(resolução.length()>0)
		Resolução = resolução;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SistemaDeVideo [Marca=");
		builder.append(Marca);
		builder.append(", Modelo=");
		builder.append(Modelo);
		builder.append(", Tipo=");
		builder.append(Tipo);
		builder.append(", Resolução=");
		builder.append(Resolução);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	

}
