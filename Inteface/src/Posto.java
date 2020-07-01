
public class Posto {
	private double precoGasolina = 4.0;
	private double precoAcool = 3.0;
	
	
	public double colocarConbustivel(Gasolina gasolina, double quantidade){
		gasolina.abastecer(quantidade);
		
		return quantidade*precoGasolina;
	}
	public double colocarConbustivel(Acool acool, double quantidade){
		acool.abastecer(quantidade);
		
		return quantidade*precoAcool;
	}
	

}
