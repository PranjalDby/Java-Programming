package inheritance;
import java.util.Scanner;
import java.sql.*;
public class Inheritance {
	
	class Dog{
		String name;
		int age;
		double price;

		Dog(String name, int age,double price) {
			this.name = name;
			this.age = age;
			this.price = price;
		}
	}

	class BrunoMars extends Dog {

		BrunoMars(String name, int age, double pp) {
			//Calling the constructor of parent class
			super(name, age, pp);
		}
	}
	
	class Bank {
		long accNumber;
		private long balance;
		private String name;

		Bank(long accNumber, long balance, String name) {
			this.balance = balance;
			this.accNumber = accNumber;
			this.name = name;
		}

		public long getbalance() {
			return this.balance;
		}

		public String getHolderName() {
			return this.name;
		}
	}

	class SavingAccount extends Bank {
		SavingAccount(long accNumber, long balance, String name) {
			super(accNumber, balance, name);
		}

		public int withdraw(long rs) {
			if (super.balance == 0 || (super.balance < rs)) {
				System.out.println("Not enough Money");
				return -1;
			}
			super.balance -= rs;
			return 0;

		}

		public void deposit(long rs) {
			if (rs < 0) {
				System.out.println("negative amount entere'd");
				return;
			}
			super.balance += rs;
			System.out.println("Current balance = " + super.balance);

		}

	}
	
	// Removed SqlDriver class as DriverManager cannot be extended
	
	public static void main(String args[]) {
		Inheritance ii = new Inheritance();
	
		BrunoMars b = ii.new BrunoMars("BrunoMars", 10,15000);
		System.out.println(b.name + " " + b.price + " " + b.age);
		SavingAccount sa = ii.new SavingAccount(120456788, 100000, "Mohammad");
		System.out.println(sa.getbalance() + " " + sa.getHolderName() + " ");
		sa.withdraw(56000);
		sa.deposit(10000);
		Scanner sc = new Scanner(System.in);
		SavingAccount annonim;
		String name = "";
		long accNumber = 00;
		long balance = 00;
		while (true) {

			System.out.println("Enter you'r name = ");
			name = sc.nextLine();
			System.out.println("Enter you'r account number = ");
			accNumber = sc.nextLong();
			System.out.println("Enter the initial amount =  ");
			balance = sc.nextLong();
			annonim = ii.new SavingAccount(accNumber, balance, name);

			System.out.println("::::::::: Bank Transaction System :::::::::::");
			int opt = 0;
			System.out.println("1:check balance\n2:withdraw\n3:deposit\n4:exit");
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					if (annonim != null) {
						System.out.printf("%d", annonim.getbalance());
						break;
					}
					System.out.println("Something went wrong");
					break;
				case 2:
					long withdrawAmnt = 0;
					System.out.println("Enter amount to withdraw");
					withdrawAmnt = sc.nextLong();
					if (withdrawAmnt <= 0) {
						System.out.println("Wrong amount! please try again");
					} else if (withdrawAmnt > annonim.getbalance()
							|| withdrawAmnt == (annonim.getbalance() - (10 / 100) * annonim.getbalance())) {
						System.out.println("Not enough balance");
					} else {
						System.out.println("Withdrawing..........");
						int status = annonim.withdraw(withdrawAmnt);
						if (status < 0) {
							System.out.println("Something went Wrong!");
							return;
						} else {
							System.out.println("Withdrawl Successfull");
						}
					}
					break;

				case 3:
					long depo_amnt = 0;
					System.out.println("Enter the money to deposit");
					depo_amnt = sc.nextLong();
					annonim.deposit(depo_amnt);

				case 4:
					sc.close();
					return;
				default:
					break;
			}
		}
	}
}
