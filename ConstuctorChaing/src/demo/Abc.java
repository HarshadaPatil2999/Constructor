package demo;

public class Abc {
	
	Abc()
	{   // this(100);//we cant use loop goes to infinite.
		System.out.println("In default constuctor");
	}
	Abc(int a)
	{    this();//constuctor call 1st in other constuctor either we get error.
		System.out.println("In 1 parameter constuctor"+a);
	}
	Abc(int a,int b)
	{this(200);
		System.out.println("In 2 parameter constuctor"+a+" "+b);
	}
	
	Abc(int a,int b,int c)
	{this(100,20);
		System.out.println("In 3 parameter constuctor"+a+" "+b+" "+c);
	}
	public static void main(String[] args) {
		Abc a= new Abc();//in constuctor chaining we call any contuctor using this keyword.
	}
	
}
