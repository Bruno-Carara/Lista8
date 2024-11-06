package Associação;

public class Main {

	public static void main(String[] args) {
		EquipamentoEletronico EE = new EquipamentoEletronico();
		SistemaDeSom SS = new SistemaDeSom();
		SistemaDeVideo SV = new SistemaDeVideo();
		HomeTheater HT = new HomeTheater();
		
		EE.setConsumo(19);
		EE.setTensão(21);
		
		SS.setConsumo(1);
		SS.setMarca("A");
		SS.setModelo("B");
		SS.setPotência(2);
		SS.setTensão(3);
		
		SV.setConsumo(2);
		SV.setMarca("A");
		SV.setModelo("A");
		SV.setResolução("A");
		SV.setTensão(2);
		SV.setTipo("A");
		
		HT.som.setConsumo(1);
		HT.som.setMarca("A");
		HT.som.setModelo("A");
		HT.som.setPotência(1);
		HT.som.setTensão(1);
		HT.video.setConsumo(2);
		HT.video.setMarca("B");
		HT.video.setModelo("B");
		HT.video.setResolução("B");
		HT.video.setTensão(2);
		HT.video.setTipo("B");
		
		System.out.println(EE);
		System.out.println(SS);
		System.out.println(SV);
		System.out.println(HT);
	}

}
