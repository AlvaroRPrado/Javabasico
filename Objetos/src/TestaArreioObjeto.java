
public class TestaArreioObjeto {

	public static void main(String[] args) {
		Carro[] carros = new Carro[5];
		
		Carro carro1 = new Carro();
		carro1.cor = "verde";
		carro1.modelo = "HB20";
		carro1.velocidadeMaxima = 180;
		
		Carro carro2 = new Carro();
		carro2.cor = "vermelho";
		carro2.modelo = "I30";
		carro2.velocidadeMaxima = 220;
		
		carros[0] = carro1;
		carros[1] = carro2;
		carros[1].cor = "rosa";
		
		System.out.println("carro1 "+ carros[0].cor);
		System.out.println("carro2 "+ carros[1].cor);
		
		for(Carro carro : carros){
			System.out.println("Carro: " + carro.modelo);
		}
			
			
		
	}

}
