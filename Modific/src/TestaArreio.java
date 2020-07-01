
public class TestaArreio {

	public static void main(String[] args) {
		String[] pessoas = new String[5];
		pessoas[0]= "Joao";
		pessoas[1] = "Maria";
		pessoas[2] = "Alvaro";
		pessoas[3] = "Jaqueline";
		pessoas[4] = "Carol";
		
		int[] idade = new int[5];
		idade[0] = 18;
		idade[1] = 29;
		idade[2] = 23;
		idade[3] = 25;
		idade[4] = 15;
		
		System.out.println(pessoas[2]+" tem "+idade[3]+" anos");
		//percorrer um arreio
		for(int i=0; i<pessoas.length; i++){
			System.out.println("pessoa: " + pessoas[i]);
			
		}
		for(int idades : idade){
			System.out.println("Idade: "+ idades);
			
		}
		
		
		

	}

}
