import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestaMap {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setCor("vermelho");
		carro.setModelo("UNO");
		carro.setVelocidadeMaxima(160);
		
		Camionete camionete = new Camionete();
		camionete.setCor("Amarela");
		camionete.setModelo("Ranger");
		camionete.setVelocidadeMaxima(250);
		
		Jipe jipe = new Jipe();
		jipe.setCor("Preto");
		jipe.setModelo("Renegpe");
		jipe.setVelocidadeMaxima(220);
		jipe.setE4X4(true);
		
		Map<String, Altomovel> mapaAutomoveis = new HashMap<>() ;
		mapaAutomoveis.put("Mara", carro);
		mapaAutomoveis.put("Alvaro", camionete);
		mapaAutomoveis.put("Julho", jipe);
		
		Set<String> nomes = mapaAutomoveis.keySet();
		
		for(String nome: nomes){
			Altomovel altomovel = mapaAutomoveis.get(nome);
			
			System.out.println(nome+" dirige "+altomovel.getModelo());
			
		}
			 
		



	}

}
