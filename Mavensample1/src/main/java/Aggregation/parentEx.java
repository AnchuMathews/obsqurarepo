package Aggregation;

public class parentEx {
	String name;
	childEx teacher;
	
	parentEx(String name, childEx teacher1)
	{
		this.name = name;
		this.teacher=teacher1;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childEx teacher1=new childEx("John Savio");
		parentEx department1=new parentEx("computer science ",teacher1);
		System.out.println(department1.name+"department has teacher "+department1.teacher.name);
		//System.out.println(department1.name);
		//System.out.println(teacher1.name);

	}
}
