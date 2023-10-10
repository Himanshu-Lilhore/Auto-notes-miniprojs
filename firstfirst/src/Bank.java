class Account
{
	private String username;
	private int balance;
	private String password;
	
	Account(String username, int balance, String password)
	{
		this.username = username;
		this.balance = balance;
		this.password = password;
	}
	
	//setters
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	//getters
	public void getBalance(String name, String pass)
	{
		if(name == "Raju" && pass == "Welcome")
		{
			System.out.println(this.balance);
		}
		else
		{
			System.out.println("Unauthorized access");
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		Account a1 = new Account("Himanshu", 0, "password");
		Account a2 = new Account("ahenS", 10, "password1");
		
		a1.getBalance("him", "hi");
		a2.getBalance("Raju", "Welcome");

	}

}
