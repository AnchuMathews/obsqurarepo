//Assignment for encapsulation

package encapsulationpackage;

public class Bank {
	private int pin;
	private String c;
	private String d;
	public void setpin(int pin)
	{
		this.pin=pin;
	}
	
	public String getpin() 
	{
	c="Valid pin";
	d="Invalid pin";
	if(pin == 1001 || pin == 1234|| pin == 1212)
	{
		//System.out.println("Valid pin!!");
		return c;
		
	}
	else
	{
		//System.out.println("invalid pin!!");
	
		return d;
	}
	}

}
