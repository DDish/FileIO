
public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	Student(String nm, int sc) {
		name = nm;
		score = sc;
	}
	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return Integer.compare(this.score, arg0.score);
	}
	@Override
	public String toString() {
		return name + " " + score;
	}
	
}
