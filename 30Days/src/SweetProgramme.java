import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SweetProgramme {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sn = new Scanner(new File("students.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while(sn.hasNextLine() ) {
			students.add(sn.nextLine());
		}
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println("Name : " + students.get(i));
		}
		
		sn.close();
	}
}
