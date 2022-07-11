package Assignment;
import java.util.Scanner;
public class Demoofcopyvalue {
	int emp_id,salary;
    String name;
    Demoofcopyvalue(int emp_id,String name,int salary)
    {
    	this.emp_id=emp_id;
    	this.name=name;
    	this.salary=salary;
    }
    int getEmp_Id()
    {
       return emp_id;
    }
    int getSalary()
    {
    	return salary;
    }
    String getName()
    {
    	return name; 
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
    	Demoofcopyvalue d1=new Demoofcopyvalue(emp_id,name,salary);
    	System.out.println(d1);
    	Demoofcopyvalue d2=new Demoofcopyvalue(d1.getEmp_Id(),d1.getName(),d1.getSalary());
    System.out.println(d2);
    }
}
