package inheritance;

public class AssInheritanceChild1 extends AssInheritanceParent  {
	public void child()//salary slip 
	{
		float a=10000;
		float d=100;
		float b=150;
		float H=5;
		float h1=100;
		float h2=(H/h1)*a;
		System.out.println("HRA will be: "+h2);
		float pf1=20;
		float pf2=100;
		float pf3=(pf1/pf2)*a;
		System.out.println("PF amount will be: "+pf3);
		}
	
}
