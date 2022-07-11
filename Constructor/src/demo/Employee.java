package demo;
import java.util.Scanner;
public class Employee {
	
	int id,salary;
	String name,firstname,lastname,dept,design;
	
	
	Employee(){}
	
int getId()
{
   return id;
}
void setId(int id)
{
	this.id=id;
}
int getSalary()
{
	return salary;
}
void setSalary(int salary)
{
	this.salary=salary;
}
String getFirstame()
{
	return firstname; 
}
void setFirstname(String firstname)
{
	this.firstname=firstname;
}
String getLastname()
{
	return lastname;
}void setLastname(String lastname)
{
	this.lastname=lastname;
}
String getDesign()
{
	return design;
}
void setDesign(String design)
{
	this.design=design;
}
String getDept()
{
	return dept;
}
void setDept(String dept)
{
	this.dept=dept;
}
public String toString()
{
	return id+" "+firstname+" "+lastname+" "+dept+" "+design+" "+salary;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int id,salary;
	String name,firstname,lastname,dept,design;
	Employee e1=new Employee();
	System.out.println("Enter id,firstname,lastname,dept,design,salary");
	id=sc.nextInt();
	firstname=sc.next();
	lastname=sc.next();
	dept=sc.next();
	design=sc.next();
	salary=sc.nextInt();
	e1.setId(id);
	e1.setFirstname(firstname);
	e1.setLastname(lastname);
	e1.setDept(dept);
	e1.setDesign(design);
	e1.setSalary(salary);
	
	System.out.println(e1);
	
}
}
