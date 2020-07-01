
public class TestaPolimorfismo {

	public static void main(String[] args) {
		Altomovel[] frota = new Altomovel[3];
		
		Jipe jipe = new Jipe();
		jipe.setCor("preto");
		jipe.setModelo("renegpe");
		jipe.setVelocidadeMaxima(220);
		jipe.setE4X4(true);
		
		Camionete camionete = new Camionete();
		camionete.setCor("branca");
		camionete.setModelo("S10");
		camionete.setVelocidadeMaxima(200);
		
		Carro carro = new Carro();
		carro.setCor("vermelho");
		carro.setModelo("Camario");
		carro.setVelocidadeMaxima(300);
		
		frota[0] = jipe;
		frota[1] = camionete;
		frota[2] = carro;
		System.out.println("FROTA DE VEICULOS");
		for(Altomovel altomovel: frota){
		altomovel.acelera(100);
		System.out.println("COR " +altomovel.getCor());
		System.out.println("MODELO "+altomovel.getModelo());
		System.out.println("VEICULO ACELERANDO A "+ altomovel.getVelocidadeAtaul());
		System.out.println();
		}

		
		/*Jipe jipe = new Jipe();
		jipe.setCor("Preto");
		jipe.setModelo("Renegpe");
		jipe.setVelocidadeMaxima(220);
		jipe.setE4X4(true);
		
		Altomovel altomovel = jipe;
		
		jipe.acelera(100);
		System.out.println("JIPE: "+ jipe.getVelocidadeAtaul() );
		
		altomovel.acelera(100);
		System.out.println("Altomovel");
		System.out.println("ALTOMOVEL: "+ altomovel.getVelocidadeAtaul());
*/
	}

}
