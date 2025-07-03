package array;

public class Student {
	//properties
	private int rollNo;//encapsulation
	private String name;
	
	//default constructor
	public Student() {
		
	}

	//two arguments constructor
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
