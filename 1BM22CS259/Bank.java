import java.util.*;
class Account{
	String name;
	int accno;
	String acctype;
	double balance;
	Account(String name,int accno,String acctype,double balance)
	{
		this.name=name;
		this.accno=accno;
		this.acctype=acctype;
		this.balance=balance;
	}
	void deposit(double amt){
		balance+=amt;
	}
	void withdraw(double amt){
		if((balance-amt)>=0){
			balance-=amt;
		}
		else{
			System.out.println("Insufficient balance");
		}
	}
	void display(){ 
		System.out.println(" Name:" + name + " accnor:" + accno + " account_type:" + acctype + " balance:" + balance);
	}
}
class Savingaccount extends Account{
	private static double rate=5;
	private double minbal=500;
	Savingaccount(String name,int accno,double balance){
		super(name,accno,"savings",balance);
	}
	void interest(){
		balance+=balance*(rate)/100;
		System.out.println("Balance:" + balance);
	}
	void checkmin(){
		if(balance<minbal){
			System.out.println("balance is less than minimum balance,insufficient balance");
		}	
	}
		
}
class Curracc extends Account{
	private double minbal=500;
	private double charge=50;
	Curracc(String name,int accno,double balance){
		super(name,accno,"current",balance);
	}
	void checkmin(){
		if(balance<minbal){
			System.out.println("balance is less than minimum balance,service charges imposed:" + charge);
			balance-=charge;
			System.out.println("Balance is:" + balance);
		}
	}
}

class Bank{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the type of account:");
		String type=sc.nextLine();
		System.out.println("Enter the account number:");
		int accno=sc.nextInt();
		System.out.println("Enter the Balance:");
		double balance=sc.nextDouble();
		int ch;
		double amt1,amt2;
		Account ac=new Account(name,accno,type,balance);
		Savingaccount sa=new Savingaccount(name,accno,balance);
		Curracc ca=new Curracc(name,accno,balance);
		System.out.println("NAME:Shivaraj K Pujari");
		System.out.println("USN:1BM22CS259");
		while(true)
		{
			if(ac.acctype.equals("savings"))
			{
				System.out.println("\nMENU\n 1.deposit 2.withdraw 3.compute interest 4.diplay 5.exit");
				System.out.println("Enter the choice");
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:System.out.println("Enter the amount");
						amt1=sc.nextInt();
						sa.deposit(amt1);
						break;
					case 2:System.out.println("Enter the amount");
						amt2=sc.nextInt();
						sa.withdraw(amt2);
						sa.checkmin();
						break;
					case 3:sa.interest();
						break;
					case 4:sa.display();
						break;
					case 5:System.exit(0);
						
					default:System.out.println("Inavlid input");
						break;
				}
			}
			else{
				System.out.println("\n MENU \n 1.deposit 2.withdraw 3.display ");
				System.out.println("Enter the choice");
				ch=sc.nextInt();
				switch(ch){
					case 1:System.out.println("Enter the amount:");
					amt1=sc.nextInt();
					ca.deposit(amt1);
					break;
					case 2:System.out.println("Amount to be withdraw");
					amt2=sc.nextInt();
					ca.withdraw(amt2);
					ca.checkmin();
					break;
					case 3:ca.display();
					break;
					case 4:System.exit(0);
				}
			}
		}
		
	}
}
	
	