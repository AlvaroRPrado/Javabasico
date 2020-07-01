
public class Jipe extends Altomovel implements Acool {
	boolean e4X4;

	public void setE4X4(boolean e4x4) {
		e4X4 = e4x4;
	}

	public boolean isE4X4() {//tambem pode usa o IS
		return e4X4;
	}

	

	
	
	@Override   //subscrever um metodo
	public void acelera(double velocidade) {
double novaVelocidade = this.velocidadeAtaul + velocidade;
		
		if(e4X4){
		novaVelocidade = novaVelocidade - (novaVelocidade * 0.1);
		}
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
