package encapsulationpackage;
//In encapsulation the variables of a class will be hidden from other classes & accessed only through getter and setter methods

public class EncapsParent1 { //right click code > source > "generate getter and setter" (shortcut)
	private String username;
	private int password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}

}
