package bankingaccountapp;

public interface IBaseRate {
	
	// Write a method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}
}
