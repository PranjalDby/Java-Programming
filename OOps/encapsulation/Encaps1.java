package encapsulation;

class Bank {
	public String name;
	private double balance;
	protected long accountNumber;

	Bank(String name,long accNumber){
	this.name = name;
	this.accountNumber = accNumber;
	this.balance = 0.0f;
 }

	public void deposit(double balance) {

		this.balance += balance;
	}

	public double getbalance() {

		return this.balance;
	}

}

class Encaps1 {

	public static void main(String[] args) {

		Bank hdfc = new Bank("Pranjal", 12456009);
		hdfc.deposit(10000.0);
		System.out.println(hdfc.getbalance());
	}

}
