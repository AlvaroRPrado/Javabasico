
public class TestaAcesso {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.setCor("Preto");
		meuCarro.setModelo("BMW");
		meuCarro.setVelocidadeAtaul(0.0);
		meuCarro.setVelocidadeMaxima(200);;
		 
		meuCarro.acelera(100);
		
		//System.out.println("MEU CARRO ACELERANDO A: "+ meuCarro.getVelocidadeAtaul());
		
		meuCarro.acelera(220);
		///System.out.println("MEU CARRO ACELERANDO A: "+ meuCarro.getVelocidadeAtaul());
		
	}

}
