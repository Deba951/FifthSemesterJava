class Bank{
	String name;
	int acc;
	String type;
	int bal;
	
	void assign(String a, int b, String c, int d){
		name = a;
		acc = b;
		type = c;
		bal = d;
	}
	
	void deposit(int x){
		bal = bal + x;
	}
	
	void withdraw(int y){
		System.out.println("Balance is " + bal);
		bal = bal - y;
	}
	
	void display(){
		System.out.println("Name : " + name);
		System.out.println("Balance : " + bal);
	}
}
class q26{
	public static void main(String args[]){
		Bank ob = new Bank();
		ob.display();
		ob.assign("Piyasa",1177, "Personal",10000);
		ob.deposit(60000);
		ob.withdraw(500);
		ob.display();
	}
}