
public class Carro {
	private static int quantidadeDeCarros;
	private String cor;
	private String modelo;
	private double velocidadeAtaul;
	private double velocidadeMaxima;
	
	public  Carro(String cor, String modelo, double velocidadeMaxima ){
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		System.out.println("CRIANDO CARRO");
		
		Carro.quantidadeDeCarros = Carro.quantidadeDeCarros+1;
	}
	public Carro() {
		System.out.println("CRIANDO CONSTRUTOR");
		Carro.quantidadeDeCarros = Carro.quantidadeDeCarros+1;
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
	
	public static int getQuantidadeDeCarro(){
		return Carro.quantidadeDeCarros;
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
			System.out.println("VELOCIDADE MAXIMA ANTIGIDA");
		}
		
		
	}
	void ligar(){
		System.out.println("CARRO LIGADO");
	}



private boolean verificaVelocidadeMaxima(double velocidade){
	return velocidade < velocidadeMaxima;
}
}
