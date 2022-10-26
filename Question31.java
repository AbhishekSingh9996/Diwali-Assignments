class BankAccount{
	int account;
	int balance;
	double interest_rate;
	BankAccount b1;
	
	void setdetails(int account, int balance, double interest_rate){
		this.account = account;
		this.balance = balance;
		this.interest_rate = interest_rate;
		printdetails();
		
	}
	void printdetails(){
		System.out.println(this.account);
		System.out.println(this.balance);
		System.out.println(this.interest_rate);
		
		Interest i1 = new Interest();
		i1.interest(b1);
		
	}
		
	
	   class Interest{
		void interest(BankAccount b){
		double interest = (balance * 1* interest_rate)/100;
		System.out.println("Interst for one year : "+interest);
		}
	}
}
class Question31{
	public static void main (String [] args){
		BankAccount b1 = new BankAccount();
		b1.setdetails(123,1000,1.5);
		
	}
}