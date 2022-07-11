package demo;
import java.util.Scanner;
public class Theater {
	String theatername,movie,movie1,movie2,movie3,movie4,address,contact;
	
Theater(){}
String getTheatername()
{
	return theatername;
}
void setTheatername(String theatername)
{
	this.theatername=theatername;
}
String getMovie1()
{
	return movie1;
}
void setMovie1(String movie1)
{
	this.movie1=movie1;
}
String getMovie2()
{
	return movie2;
}
void setMovie2(String movie2)
{
	this.movie2=movie2;
}
String getMovie3()
{
	return movie3;
}
void setMovie3(String movie3)
{
	this.movie3=movie3;
}
String getMovie4()
{
	return movie4;
}
void setMovie4(String movie4)
{
	this.movie4=movie4;
}String getAddress()
{
	return address;
}
void setAddress(String address)
{
	this.address=address;
}
String getContact()
{
	return contact;
}
void setContact(String contact)
{
	this.contact=contact;
}


void movieDetails(String movie)
{
	if(movie.equals(movie1)) 
	{
		System.out.println("timing of shows:9Am,12Pm,4Pm,7Pm");
		System.out.println("ticket fare:250,200,150");
	}	
		else if(movie.equals(movie2))
		{
			System.out.println("timing of shows:9Am,12Pm,4Pm,7Pm");
			System.out.println("ticket fare:250,200,150");
		}
		else if(movie.equals(movie3))
		{
			System.out.println("timing of shows:9Am,12Pm,4Pm,7Pm");
			System.out.println("ticket fare:250,200,150");
		}
		else if(movie.equals(movie4))
		{
			System.out.println("timing of shows:9Am,12Pm,4Pm,7Pm");
			System.out.println("ticket fare:250,200,150");
		}
		else
			System.out.println("no such movie ");

}
public String toString()
{
	return theatername+" \n"+address+"\n "+contact+"\n"+movie1+" "+movie2+" "+movie3+" "+movie4;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String theatername,movie,movie1,movie2,movie3,movie4,address,contact;
	Theater t1=new Theater();
	System.out.println("Enter:theatername,address,contact,movie1,movie2,movie3,movie4");
	theatername=sc.next();
	address=sc.next();
	contact=sc.next();
	movie1=sc.next();
	movie2=sc.next();
	movie3=sc.next();
	movie4=sc.next();
	
	
	t1.setTheatername(theatername);
	t1.setAddress(address);
	t1.setContact(contact);
	t1.setMovie1(movie1);
	t1.setMovie2(movie2);
	t1.setMovie3(movie3);
	t1.setMovie4(movie4);
	System.out.println(t1);
	System.out.println();
	System.out.println("enter movie name:");
	movie=sc.next();
	t1.movieDetails(movie);
	
	
	
}


}
