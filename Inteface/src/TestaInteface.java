
public class TestaInteface {

	public static void main(String[] args) {
		
		Camionete camionete = new Camionete();
		camionete.setCor("preta");
		camionete.setModelo("ranger");
		camionete.setVelocidadeMaxima(220);
		camionete.setCapacidadeDeCarga(100);
		
		Jipe jipe = new Jipe();
		jipe.setCor("branco");
		jipe.setModelo("renegpe");
		jipe.setVelocidadeMaxima(200);
		jipe.setE4X4(true);
		
		Posto postoShell = new Posto();
		
		double valorJipe = postoShell.colocarConbustivel(jipe, 100);
		System.out.println("Valor gasto no JIPE foi de R$: "+ valorJipe +" de combustivel");
		
		double valorCamionete = postoShell.colocarConbustivel(camionete, 100);
		System.out.println("Valor gasto na CAMIONETE foi de R$: "+ valorCamionete +" de combustivel");
		
		
		
		
		
	}

}
