
public class TestaHeranca {

	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setCor("vermelho");
		carro.setModelo("UNO");
		carro.setVelocidadeMaxima(160);
		carro.setEhConversivel(false);
		 
		carro.ligar();
		
		Camionete camionete = new Camionete();
		camionete.setCor("Amarela");
		camionete.setModelo("Ranger");
		camionete.setVelocidadeMaxima(250);
		camionete.setCapacidadeDeCarga(1000);
		
		camionete.ligar();
		
		Jipe jipe = new Jipe();
		jipe.setCor("Preto");
		jipe.setModelo("Renegpe");
		jipe.setVelocidadeMaxima(220);
		jipe.setE4X4(true);
		
		jipe.ligar();
		
		System.out.println("quatidade: "+ carro.getQuantidadeDeCarros());
	}
	
	

}
