import java.io.FileNotFoundException;
import java.util.LinkedList;


public class SweetProgramme {
	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("mahmoud");
		names.add("amane");
		names.add("last");
		
		// Iterate LinkedList as a queue 		
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}
}
