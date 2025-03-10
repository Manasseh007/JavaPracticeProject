package bankingaccountapp;

public class Savings extends Account {
	// List Properties specific to the savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the savings account
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
		//System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		//System.out.println("NEW SAVINGS ACCOUNT");
		//System.out.println(name);
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		//System.out.println("Implement rate for Savings");
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
		//System.out.println(safetyDepositBoxID);
	}
	
	// List any methods specific to savings account
	public void showInfo() {
		//System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				"Your Savings Account Features " +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}
}
