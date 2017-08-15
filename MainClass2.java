////exlicit constructor call by programmer
//To elucidate the use of using Super() statement for parameterized constructor
//Name:Yogesh Pawar 	Date:15/08/2017
class Demo1
{
	Demo1(int args)
	{
	System.out.println("Running Demo1 constructor...");
	System.out.println("args value is:"+args);
	}
}

class Demo2 extends Demo1
{
	Demo2()
	{
	//At this point if programmer pass arguments in superclass then programmer need to specify super(respective argument)
	super(10);	
	System.out.println("Running Demo2 Constructor...");
	}
}

class MainClass2
{
	public static void main(String arg[])
	{
		Demo2 d2=new Demo2();
	}
}