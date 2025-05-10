package Assignments;

public class Ass4 {
	
	//Assignment_4

	//1) Program to set your name and age by static method and get them in an another static method

	
	
	static String a = "Anchu Mathews";
	static int b=31;
	public static void display()
	{

	System.out.println("Name of candidate: "+a);
	System.out.println("Age will be: "+b);
	}

	//2)Find the factorial of a number:
	public static void factorial()
	{
	int a=5;
	int fact=1;

	System.out.println("Entered value will be: "+a);
	for(int i=1;i<=a;i++)
	{
	fact=fact*i;
	}
	System.out.println("Factorial of given number will be: "+fact);

	}

	//3)Check whether a number is paliandrome or not and reverse a number

	public static void paliandrome()
	{
	//reverse a number:
	int n=6123;
	int rev=0;
	int rem;
	while(n>0)
	{
	rem=n%10;
	rev=(rev*10)+rem;
	n=n/10;
	}
	System.out.println("Reversed number: "+rev);
	}
	
	//Write a program to check whether the candidate is eligible for Voting(Use static method and boolean return type).
	public static int vote(int a)
	{
	//int a=10;	
	if(a>=18)
	{
	System.out.println("eligible for voting: true/false: " + (a<18));	
	}
	else
	{
		System.out.println("eligible for voting: true/false: "+ (a>=18));
	}
	return a;	
	}
	/* Write a program to check whether the customer have discount (get 20% discount if total amount is greater than 5000) or not and get
the final amount in main method. (static methods)
*/
	public static float amount(float a)
	{
		if(a>=5000)
		{
			float t=(float) (5000*0.20);
			System.out.println("Total amount including discount: "+t);
			return t;
		}
		else {
			System.out.println("No discount "+ a);
			return a;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass4.display();
		Ass4.factorial();
		Ass4.paliandrome();
		//System.out.println("result "+Ass4.vote());
		System.out.println(vote(11));
		System.out.println(amount(1001));
	}

}
