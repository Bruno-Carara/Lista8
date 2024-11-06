package Associação;

public class EquipamentoEletronico {

	private float tensão = 1;
	private float consumo = 2;
	public float getTensão() {
		return tensão;
	}
	public void setTensão(float tensão) {
		if (tensão>0)
		this.tensão = tensão;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		if (consumo>0)
		this.consumo = consumo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentoEletronico [tensão=");
		builder.append(tensão);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	
}
