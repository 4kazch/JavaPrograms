import java.util.*;

class Acc{
	String name;
	int accno;
	int balance;
	String type;
	
	Acc(String n, int a){
		this.name  = n;
		this.accno = a;
		this.balance = 0;
		this.type = "";
	}
	
	int deposit(int n){
		balance += n;
		return balance;
	}
	int withdraw(int n){
		balance -= n;
		return balance;
	}
	
	int checkBalance(){
		return balance;
	}
	
}

public class bankacc{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("enter account no");
		int n = sc.nextInt();
		
		Acc acc1 = new Acc(name,n);
		
		System.out.println("deposit money");
		int x = sc.nextInt();
		int bal = acc1.deposit(x);
		System.out.println("balance: ");
		bal = acc1.checkBalance();
		System.out.println(bal);
		
		System.out.println("withdraw money");
		x = sc.nextInt();
		bal = acc1.withdraw(x);
		System.out.println("balance: ");
		bal = acc1.checkBalance();
		System.out.println(bal);
		
		System.out.println("name = "+ acc1.name);
		System.out.println("account number = "+ acc1.accno);
		
		
	}
	
}
