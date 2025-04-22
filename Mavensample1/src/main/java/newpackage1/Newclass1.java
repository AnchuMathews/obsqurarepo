package newpackage1;

public class Newclass1 {
//Maven file created here
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Anchu"; //creating a string using "String" keyword
		System.out.println("My name is: " + s );
		String s1=new String("Welcome");
		System.out.println(s1);
		char a[]= {'A','B','C'};
		String a1=new String(a); //Converting array to string using new keyword.
		System.out.println(a1);
		
		
		//Length of string
		
		int var=s.length();
		int var1=s1.length();
		System.out.println( "Length of string 'welcome':  "+ var1);
		
		//concatination
		System.out.println(s.concat(s1));
		
		//uppercase and lower case
		String h1="ANCHU";
		System.out.println("Upper case value will be: "+s1.toUpperCase());
		
		System.out.println("Lower case value will be: "+h1.toLowerCase());	
		
		//reverse
		String h = "ANN MARY";
		System.out.println(h.replace(h, s));
		System.out.println(h.replaceAll(a1, h));
		
		//"equals" method
		String v1="java";
		String v2="java";
		String v3="Java";
		String v4="selenium";
		//method to find whether 2 strings are equal or not
		System.out.println(v1.equals(v2)); //"java" = "java" value will be true
		
		System.out.println(v1.equals(v4));//"java"="selenium"
		
		System.out.println(v1.equals(v3));//"java" ="Java"  here answer will be false because it is case sensitive
		
		//case sensitive ignore case
		System.out.println(v1.equalsIgnoreCase(v3)); //answer will be true
		
		//is empty
		
		String w="";
		System.out.println(w.isEmpty()); //answer will be true
		
		String w1="JAYDEN";
		System.out.println(w1.isEmpty());//answer will be false
		
		//"contains" of method which can be used for check whether a character or word present or not
		
		String r="Hi Welcome";
		System.out.println(r.contains("Welcome"));//Answer will be true
		
		System.out.println(r.contains("Hello"));// Answer will be false
		
		//Value of type casting
		int y=10;
		String y1=String.valueOf(y);
		System.out.println(y1);
		
		String x="";
		System.out.println("value of x: "+x.valueOf(y));
		
		//Using new keyword
		String aa1=new String("Java");
		System.out.println(aa1);
		
		//equals "=="
		String ad="ABC";
		String bd="ABC";
		System.out.println("Result will be: ");
		System.out.println(ad == bd);
		
		System.out.println(ad==aa1);//answer will be false
		
		//StringBuffer StringBuilder
		
		
		
		//StringBuffer a12=StringBuffer("hello");
		//System.out.println("String buffer value will be: "+a12);	

	}

//private static StringBuffer StringBuffer(String string) {
	// TODO Auto-generated method stub
	//return null;
}


