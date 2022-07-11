package Assignment;
import java.util.Scanner;
public class Copyvalue {
	
			int emp_id,salary;
		     String name;
			
			Copyvalue(){}
			
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
		
       public String toString()
		{
			return emp_id+" "+name+" "+salary;
		}

		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int emp_id,salary;
			String name;
			Copyvalue c1=new Copyvalue();
			System.out.println("Enter emp_id,name,salary");
			emp_id=sc.nextInt();
			name=sc.next();
			salary=sc.nextInt();
			c1.setEmp_Id(emp_id);
			c1.setName(name);
			c1.setSalary(salary);
			System.out.println(c1);
			System.out.println();
			Copyvalue c2=new Copyvalue();
			c2.setEmp_Id(c1.getEmp_Id());
			c2.setName(c1.getName());
			c2.setSalary(c1.getSalary());

			System.out.println(c2);
			
		}
	}



