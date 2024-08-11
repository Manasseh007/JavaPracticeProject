package bankingaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		String file = "C:\\Users\\lonew\\OneDrive\\Documents\\NewBankAccounts.csv";
		
		// Read a CSV file then create new accounts based on that data.
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			//System.out.println("NEW ACCOUNTS");
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			//System.out.println(name + " " + " " + sSN + " " + accountType + " $" + initDeposit);
			
			if (accountType.equals("Savings")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				//System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		//accounts.get(5).showInfo();
		
		for (Account acc : accounts) {
			System.out.println("\n**********************");
			acc.showInfo();
		}
	}
}

/*
Checking chkacc1 = new Checking("Meluleki Terrence", "9633225874", 15000);
Savings savacc1 = new Savings("Terry Smith", "147258369", 25000);

savacc1.compound();

savacc1.showInfo();
System.out.println("*****************");
chkacc1.showInfo();

 * savacc1.deposit(5000);
 * savacc1.withdraw(200);
 * savacc1.transfer("Brokerage ", 3000);
 */

