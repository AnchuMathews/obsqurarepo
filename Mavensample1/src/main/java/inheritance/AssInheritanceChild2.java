package inheritance;

public class AssInheritanceChild2 extends AssInheritanceChild1{
	public void child2()
	{
		//this.child();
		float a=10000;
		float d=100;
		float b=150;
		float H=5;
		float h1=100;
		float h2=(H/h1)*a;
		float pf1=20;
		float pf2=100;
		float pf3=(pf1/pf2)*a;
		float T=a + h2 - pf3 - d + b;
		System.out.println("Total salary will be: "+T);
		
		
	}
	

}
