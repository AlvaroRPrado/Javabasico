import java.util.ArrayList;
import java.util.List;

public class TestaList {

	public static void main(String[] args) {
		List<String> listaStrings = new ArrayList<>();
		listaStrings.add("Alvaro");
		listaStrings.add("Maria");
		listaStrings.add("Pietro");
		
		
		for(String item: listaStrings){
			System.out.println("ITEM: " + item);
			
		}
		listaStrings.remove(2);
		
		
		System.out.println("");
		
		
		for(int i = 0; i<listaStrings.size(); i++){
			String item = listaStrings.get(i);
			System.out.println("ITEM: " + item);
		}
	}

}
