package BoyerMoore;

public class App {

	public static void main(String[] args) {
		
		String text = "This is a test";
		String pattern = "is a ";
		
		BoyerMoore boyerMoore = new BoyerMoore(text, pattern);
		boyerMoore.precomputeShifts();
		System.out.println( boyerMoore.search() );

	}
}
