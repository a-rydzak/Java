

class AccountTest{
	public static void main(String[] args){

	BankAccount andrewsAccount = new BankAccount();

	System.out.println(andrewsAccount.getAccountNum());
	System.out.println(andrewsAccount.getCheckingBalence());
	andrewsAccount.deposit(33.41, "checking",andrewsAccount.getAccountNum());
	andrewsAccount.withdraw(33.41, "checking",andrewsAccount.getAccountNum());
	andrewsAccount.withdraw(33.41, "checking",andrewsAccount.getAccountNum());
	System.out.println(andrewsAccount.getCheckingBalence());

			
			
	}
}