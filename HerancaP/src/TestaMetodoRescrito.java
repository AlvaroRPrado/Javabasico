
public class TestaMetodoRescrito {

	public static void main(String[] args) {
		Camionete camionete = new Camionete();
		camionete.setCor("Amarela");
		camionete.setModelo("Ranger");
		camionete.setVelocidadeMaxima(250);
		camionete.setCapacidadeDeCarga(1000);
		
		camionete.ligar();
		camionete.acelera(120);
		Jipe jipe = new Jipe();
		jipe.setCor("Preto");
		jipe.setModelo("Renegpe");
		jipe.setVelocidadeMaxima(250);
		jipe.setE4X4(false);
		
		jipe.ligar();
		jipe.acelera(120);
		
		System.out.println("CAMIONETE ACELERANDO A: "+ camionete.getVelocidadeAtaul());
		System.out.println("JIPE ACELERANDO A: "+ jipe.getVelocidadeAtaul());

	}

}
