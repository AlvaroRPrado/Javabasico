
public class Camionete extends Altomovel implements Gasolina {
	double capacidadeDeCarga;

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	

	@Override
	public void acelera(double velocidade) {
double novaVelocidade = this.velocidadeAtaul + velocidade;
		
		
		if(verificaVelocidadeMaxima( velocidade)){
		this.velocidadeAtaul = novaVelocidade;
		}else{
			this.velocidadeAtaul = this.velocidadeMaxima;
		}
	}

	@Override
	public void abastecer(double quantidade) {
		this.tanque = quantidade;
		
	}

}
