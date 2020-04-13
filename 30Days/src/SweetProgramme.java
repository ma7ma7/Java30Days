import java.io.FileNotFoundException;
import java.util.LinkedList;


public class SweetProgramme {
	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("mahmoud");
		names.push("amane");
		names.push("last");
		
		// Iterate LinkedList as a queue 		
		System.out.println(names.pop());
		System.out.println(names.remove());
		System.out.println(names.removeFirst());
	}
}
