import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;


public class SweetProgramme {
	public static void main(String[] args) throws FileNotFoundException {
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.push("mahmoud");
		names.push("amane");
		names.push("last");
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(2, "added");
		
		for(String s: names) {
			System.out.println(s);
		}
		
		// Iterate LinkedList as a queue 		
//		System.out.println(names.pop());
//		System.out.println(names.remove());
//		System.out.println(names.removeFirst());
	}
}
