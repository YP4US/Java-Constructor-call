//inplicit constructor call by compiler

//To elucidate implicit and Explicit constructor call using Super() statement
//Name:Yogesh Pawar 	Date:15/08/2017
class Demo1
{
	Demo1()
	{
	System.out.println("Running Demo1 constructor...");
	}
}

class Demo2 extends Demo1
{
	Demo2()
	{
	//In this line compiler will autometically class a statement "super()" which will pass the execution to constructor of super class of that class in this case class Demo1
	
	System.out.println("Running Demo2 Constructor...");
	}
}

class MainClass1
{
	public static void main(String arg[])
	{
		Demo2 d2=new Demo2();
	}
}