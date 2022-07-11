package Assignment;
import java.util.Scanner;
public class ABC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter r value");
		char r=sc.next().charAt(0);
		for(char i=r;i>='A';i--)
		{
			for(char j='A';j<=i;j++ )
			{
			System.out.print(j+" ");
			}System.out.println();
		}
		for(char i='A';i<=r;i++)
		{
			for(char j='A';j<=i;j++ )
			{
			 System.out.print(j+" ");
			}System.out.println();
		}
	}

}
