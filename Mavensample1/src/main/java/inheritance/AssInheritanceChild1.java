package inheritance;

public class AssInheritanceChild1 extends AssInheritanceParent  {
	float H=5;
	float h1=100;
	float h2=(H/h1)*a;
	
	float pf1=20;
	float pf2=100;
	float pf3=(pf1/pf2)*a;
	public void child()//salary slip 
	{
		
		System.out.println("HRA will be: "+h2);
		
		System.out.println("PF amount will be: "+pf3);
		}
	
}
