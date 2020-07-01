
public class Altomovel {
	private static int quantidadeDeCarros;
	private String cor;
	private String modelo;
	protected double velocidadeAtaul;
	protected double velocidadeMaxima;
	
	public  Altomovel(String cor, String modelo, double velocidadeMaxima ){
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		System.out.println("CRIANDO UM ALTOMOVEL");
		
		Altomovel.quantidadeDeCarros = Altomovel.quantidadeDeCarros+1;
	}
	public Altomovel() {
		System.out.println("CRIANDO UM ALTOMOVEL");
		Altomovel.quantidadeDeCarros = Altomovel.quantidadeDeCarros+1;
	}
	
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setVelocidadeAtaul(double velocidadeAtaul) {
		this.velocidadeAtaul = velocidadeAtaul;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
    public double getVelocidadeAtaul() {
		return this.velocidadeAtaul;
	}
    public String getCor(){
    	return this.cor;
    }
    public String getModelo(){
    	return this.modelo;
    }
    public double getVelocidadeMaxima(){
    	return this.velocidadeMaxima;
    }
    
    public void acelera(double velocidade){
		double novaVelocidade = this.velocidadeAtaul + velocidade;
		
		
		if(verificaVelocidadeMaxima( velocidade)){
		this.velocidadeAtaul = novaVelocidade;
		}else{
			this.velocidadeAtaul = this.velocidadeMaxima;
		}
		
		
	}
	void ligar(){
		System.out.println("CARRO LIGADO");
	}



protected boolean verificaVelocidadeMaxima(double velocidade){
	return velocidade < velocidadeMaxima;
}


}
