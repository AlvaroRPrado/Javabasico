
public class TestaStatic {

	public static void main(String[] args) {
		
		System.out.println("QUANTIDADE DE CARRO: "+ Carro.getQuantidadeDeCarro());
		
		Carro carro1 = new Carro("AZUL", "C4", 200);
		Carro carro2 = new Carro("VERMELHO", "GOL", 200);
		Carro carro3 = new Carro("CHUNBO", "S10", 260);
		
		System.out.println("QUANTIDADE DE CARRO: "+ Carro.getQuantidadeDeCarro());
		System.out.println("QUANTIDADE DE CARRO: "+ carro1.getQuantidadeDeCarro());
		
		
		



	}

}
