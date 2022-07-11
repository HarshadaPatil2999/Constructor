package demo2;
import java.util.Scanner;
public class Student2 {
	int id,percentage;
	String name,dept,city,contact;
	

int getId()
{
	return id;
}
void setId(int id)
{
	this.id=id;
}
String getName()
{
	return name;
}
void setName(String name)
{
	this.name=name;
}
String getDept()
{
	return dept;
}
void setDept(String dept)
{
	this.dept=dept;
}
String getCity()
{
	return city;
}
void setCity(String city)
{
	this.city=city;
}
String getContact()
{
	return contact;
}
void setContact(String contact)
{
	this.contact=contact;
}
int getPercentage()
{
	return percentage;
}
void setPercentage(int percentage)
{
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
	
	Student2 s1=new Student2();
	s1.setId(id);
	s1.setName(name);
	s1.setDept(dept);
	s1.setCity(city);
	s1.setContact(contact);
	s1.setPercentage(percentage);
	System.out.println(s1);
	s1.grades();
	
}
}
