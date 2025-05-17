
//Example for aggregation - child class (Aggregation is "has a " relationship)

//Student class


package Aggregation;

public class AggregationAss3 {
	String name;
	int rollnumber;
	AggregationAss1 obj1;
	//private AggregationAss1 obj1;
	
	AggregationAss3(String name,int rollnumber,AggregationAss1 obj2)
	{
		
		this.name=name;
		this.rollnumber=rollnumber;
		this.obj1=obj2;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggregationAss1 obj1=new AggregationAss1("#12 ,13th cross , Rose valley, bangalore");
		AggregationAss3 obj2=new AggregationAss3("Anchu Mariya",18,obj1);
		System.out.println("Name of student : "+obj2.name);
		System.out.println("Roll number will be : "+obj2.rollnumber);
		System.out.println("Address will be: "+obj2.obj1.address);
		System.out.println("");

	}

}
