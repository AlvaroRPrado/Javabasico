
public class TestaMetodo {

	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		meuCarro.cor = "vermelho";
		meuCarro.modelo = "I30";
		meuCarro.velocidadeAtaul = 0;
		
		System.out.println("MEU CARRO");
		System.out.println("COR: "+meuCarro.cor);
		System.out.println("MODELO: "+meuCarro.modelo);
		System.out.println("VELOCIDADE ATUAL: "+meuCarro.velocidadeAtaul);
		
		meuCarro.ligar();
		meuCarro.acelera(200);
		
		System.out.println("MEU ACELERANDO ");
		System.out.println("COR: "+meuCarro.getCor());
		System.out.println("MODELO: "+meuCarro.getModelo());
		System.out.println("VELOCIDADE ATUAL: "+meuCarro.velocidadeAtaul);
		
		
		
		
	}

}
