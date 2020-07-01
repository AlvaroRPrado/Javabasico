
public class Carro {
	String cor;
	String modelo;
	double velocidadeAtaul;
	double velocidadeMaxima;
	
	void acelera(double velocidade){
		double novaVelocidade = this.velocidadeAtaul + velocidade;
		this.velocidadeAtaul = novaVelocidade;
		
	}
	void ligar(){
		System.out.println("CARRO LIGADO");
	}
String getCor(){
	return this.cor;
}
String getModelo(){
	return this.modelo;
}
}
