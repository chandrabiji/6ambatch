
public class Student {
	//instance variables
	public int sid;
	public String sname;
	public int marks;
	public String grade;
	
	
    //default constructor
	public Student(){}
	//parameterized constructor
	public Student(int sid, String sname, int marks) {
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}
	
	public String grade()
	{
		String grade = null;
		if(marks>90){
			grade="A";
		}else if(marks<90 && marks>80){
			grade="B";
		}
		return grade;
	}



	public static void main(String[] args) {
		Student s1 = new Student(100,"ABC",82);//instance or object
		System.out.println(s1.grade());

	}

}
