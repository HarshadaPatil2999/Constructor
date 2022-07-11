package demo;

public class Student {
	
	int id,marks;
	String name,dept;
	
	Student()
	{
//		id=102;
//		name="raj";
//		dept="civil";
//		marks=70;
	}
	Student(int id,String name,String dept,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+marks;
	}
	
	public static void main(String[] args) {
		
		int id,marks;
		String name,dept;
		Student s1=new Student();
		System.out.println(s1);
		System.out.println();
//		id=101;
//		name="riya";
//		dept="elect";
//		marks=70;
		Student s2=new Student(101,"riya","elect",70);
		
		System.out.println(s2);
	}

}
