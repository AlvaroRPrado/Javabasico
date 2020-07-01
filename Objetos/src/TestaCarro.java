
public class TestaCarro {

	public static void main(String[] args) {
		 Carro meuCarro = new Carro();
		 meuCarro.cor = "verde";
		 meuCarro.modelo = "HB20";
		 meuCarro.velocidadeAtaul = 0;
		 meuCarro.velocidadeMaxima = 260;
		  
		 System.out.println("MEU CARRO");
		 System.out.println("COR"+ meuCarro.cor);
		 System.out.println("MODELO: "+meuCarro.modelo);
		 System.out.println("VELOCIDADE ATUAL:"+meuCarro.velocidadeAtaul);
		 System.out.println("VELOCIDADE MAXIMA: "+meuCarro.velocidadeMaxima);
	}

}
