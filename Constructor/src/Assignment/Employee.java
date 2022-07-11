package Assignment;

import java.util.Scanner;

public class Employee {
private	int emp_id,salary;
	private String name;
	
	Employee(){}
	
int getEmp_Id()
{
   return emp_id;
}
void setEmp_Id(int emp_id)
{
	this.emp_id=emp_id;
}
int getSalary()
{
	return salary;
}
void setSalary(int salary)
{
	this.salary=salary;
}
String getName()
{
	return name; 
}
void setName(String name)
{
	this.name=name;
}


Employee(int emp_id,String name,int salary)
{
	this.emp_id=emp_id;
	this.name=name;
	this.salary=salary;
}public String toString()
{
	return emp_id+" "+name+" "+salary;
}

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int emp_id,salary;
	String name;
	Employee e1=new Employee();
	System.out.println("Enter emp_id,name,salary");
	emp_id=sc.nextInt();
	name=sc.next();
	salary=sc.nextInt();
	e1.setEmp_Id(emp_id);
	e1.setName(name);
	e1.setSalary(salary);
	System.out.println(e1);
	System.out.println();
	Employee e2=new Employee(emp_id,name,salary);
	System.out.println(e2);
	
}

}
