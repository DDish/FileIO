import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ScoreTrakker {
	private ArrayList<Student> students; 
	
	public void loadDataFromFile (String filename) throws FileNotFoundException {
		students = new ArrayList<Student>();
		FileReader read = new FileReader(filename);
		Scanner inFile = new Scanner(read);
		String name;
		int score;
		String holder;
		while(inFile.hasNextLine()) {
			name = inFile.nextLine();
			holder = inFile.nextLine();
			score = Integer.parseInt(holder);
			students.add(new Student(name, score));
		}
	}
	
	public void printInOrder() {
		Collections.sort(students);
		for (Student kid : students){
			System.out.println(kid.toString());
		}
	}
	
	public void processFiles() throws FileNotFoundException {
		loadDataFromFile("scores.txt");
		printInOrder();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ScoreTrakker tracker = new ScoreTrakker();
		tracker.processFiles();
	}

}
