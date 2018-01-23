package hashSetEx;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		super();
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return name + " : " + grade;
	}
	
	@Override
	public boolean equals(Object object){
		String compareValue = object.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
	
}
