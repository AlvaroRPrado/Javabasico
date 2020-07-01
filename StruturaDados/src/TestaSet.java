import java.util.HashSet;
import java.util.Set;

public class TestaSet {

	public static void main(String[] args) {
		Set<String> setStrings = new HashSet<>();
		setStrings.add("MARIA");
		setStrings.add("ALVARO");
		setStrings.add("VANI");
		setStrings.add("MARIA");//NAO ACEITA REPETIR MESMA COISA
		
		for(String item: setStrings){
			System.out.println("ITEM: "+item);
		}
		
		setStrings.remove("VANI");
		System.out.println("");
		
		for(String item: setStrings){
			System.out.println("ITEM: "+item);
		}
	}
	

}
