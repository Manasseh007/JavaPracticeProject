package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Meluleki", "Terrence");
		System.out.println(em1.showInfo());
		//em1.setAlternateEmail("melulekiterrence007@gmail.com");
		//System.out.println(em1.getAlternateEmail());
	}

}
