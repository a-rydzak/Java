//  Create a BankAccount class.

//  The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.

//  Create a class member (static) that has the number of accounts created thus far.

//  Create a class member (static) that tracks the total amount of money stored in every account created.

//  Create a private method that returns a random ten digit account number.

//  In the constructor, call the private method from above so that each user has a random ten digit account.

//  In the constructor, be sure to increment the account count.

//  Create a getter method for the user's checking account balance.

//  Create a getter method for the user's saving account balance.

//  Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.

//  Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.

//  Create a method to see the total money from the checking and saving.

//  Users should not be able to set any of the attributes from the class.


class BankAccount{

	private String accountNumber;
	private double checkingBalence;
	private double savingsBalence;

	static int numAccounts;
	static ArrayList<String> allAccounts = new ArrayList<String>();
	static double totalChecking;
	static double totalSavings;

	public BankAccount(){
		numAccounts+=1;
		this.accountNumber = genAccountNum();
		allAccounts.add(this.accountNumber);
	}

	private string genAccountNum(){
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		String accountNumber = Long.toString(number)
		return accountNumber;
	}

	public double getCheckingBalence(){
		return this.checkingBalence;
	}

	public double getSavingsBalence(){
		return this.savingsBalence;
	}

	// !!!!!!!!!!!!!!!!!!!!!!------------------------------------------------------Left off working this method

	public void deposit(Double amount, String accountType,String accountNumber){

		String account = accountType.toLowerCase().replaceAll("\\s","");

		Boolean vaildAccount = allAccounts.contains(accountNumber) ? True : False;

		if((vaildAccount) && (account=="checking")){
			this.checkingBalence+=amount;

		}else if((vaildAccount) && (account=="savings")){
			this.savingsBalence+=amount;
		}else{
			System.out.println("The account does not exist.")
		}

	}
}