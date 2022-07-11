package demo;
import java.util.Scanner;

import Assignment.Demoofcopyvalue;
public class Demo1 {
	int emp_id,salary;
    String name;
    Demo1(int emp_id,String name,int salary)
    {
    	this.emp_id=emp_id;
    	this.name=name;
    	this.salary=salary;
    }
    public String toString()
    {
    	return emp_id+" "+name+" "+salary;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int emp_id,salary;
    	String name;
    	System.out.println("Enter emp_id,name,salary");
    	emp_id=sc.nextInt();
    	name=sc.next();
    	salary=sc.nextInt();
    	 Demo1 d1=new Demo1(emp_id,name,salary);
    	 
    	System.out.println(d1);
    }
}
