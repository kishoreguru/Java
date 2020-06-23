class Student{
	long regNo;
	String name;

	Student(long regNo, String name){
		this.regNo = regNo;
		this.name = name;
	}

	long regNo(){
		return regNo;
	}

	String getName(){
		return name;
	}
}

public class ConstructorExample{
    
	public static void main(String[] args) {
		Student firstStudent = new Student(412516, "xyz");
		Student secondStudent = new Student(412518, "abc");

		System.out.println(firstStudent.getName());
		System.out.println(firstStudent.regNo());

	}
}