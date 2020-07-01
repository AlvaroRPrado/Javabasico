
public class Carro extends Altomovel implements Gasolina{
	
	private static int quantidadeDeCarros;
	private boolean ehConversivel;
	
	@Override
	public void acelera(double velocidade){
double novaVelocidade = this.velocidadeAtaul + velocidade;
		
		if(ehConversivel){
			novaVelocidade = novaVelocidade / 2;
		}
		
		if(verificaVelocidadeMaxima( velocidade)){
		this.velocidadeAtaul = novaVelocidade;
		}else{
			this.velocidadeAtaul = this.velocidadeMaxima;
		}
	}
	
	
	
	public boolean isEhConversivel() {
		return ehConversivel;
	}

	public void setEhConversivel(boolean ehConversivel) {
		this.ehConversivel = ehConversivel;
	}

	public static int getQuantidadeDeCarros() {
		return quantidadeDeCarros;
	}



	@Override//implementa metodo
	public void abastecer(double quantidade) {

		this.tanque = quantidade;
		
	}
	

	
	}
