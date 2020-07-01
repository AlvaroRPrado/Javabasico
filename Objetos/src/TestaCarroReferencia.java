
public class TestaCarroReferencia {
	public static void main(String []args){
		Carro meuCarro = new Carro();
		meuCarro.cor = "amarelo";
		meuCarro.modelo = "wa";
		meuCarro.velocidadeMaxima = 200;
		
		Carro amigoCarro = new Carro();
		amigoCarro= meuCarro;
		
		//amigoCarro.cor = "amarelo";
		//amigoCarro.modelo = "wa";
	//	amigoCarro.velocidadeMaxima = 200;
		
		System.out.println("MEU CARRO E "+meuCarro.cor+"VELOCIDADE MAXIMA E DE"+meuCarro.velocidadeMaxima);
		
		System.out.println("CARRO DO MEU AMIGO "+amigoCarro.cor+"VELOCIDADE MAXIMA E DE"+amigoCarro.velocidadeMaxima);
		
		if(meuCarro==amigoCarro){
			System.out.println("OS CARRO SÃO IGUAIS");
		}else{
			System.out.println("OS CARRO SÃO DIFERENTE");
		}
		
		
	}
}
