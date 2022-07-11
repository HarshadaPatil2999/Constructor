package demo2;
import java.util.Scanner;
public class Student {
	int id,percentage;
	String name,dept,city,contact;
	Student(int id,String name,String dept,String city,String contact,int percentage)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.city=city;
		this.contact=contact;
		this.percentage=percentage;
	}
	void grades()
	{
		if(percentage>=75)
			System.out.println(" A grade");
		else if(percentage>=60)
			System.out.println(" B grade");
		else if(percentage>=50)
			System.out.println(" C grade");
		else if(percentage>=40)
			System.out.println(" D grade");
		else
			System.out.println("no grade");
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+city+" "+contact+" "+percentage; 
	}
	public static void main(String[] args) {
		int id,percentage;
		String name,dept,city,contact;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:id,name,dept,city,contact,percentage");
		 id=sc.nextInt();
		 name=sc.next();
		 dept=sc.next();
		 city=sc.next();
		 contact=sc.next();
		 percentage=sc.nextInt();
		 Student s1=new Student(id,name,dept,city,contact,percentage);
		 System.out.println(s1);
		 s1.grades();
	}

}
