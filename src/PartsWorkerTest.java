public class PartsWorkerTest {

	public static void main(String[] args) {
		
		// order of constructor
		//String first, String last, String ssn, double paymentPerPiece, int bonusPartAmount,double fixedBonus, int piecesProduced
	
	PartsWorker w1 = new PartsWorker("John", "Doe", "111-11-1111", 5, 50, 100, 51);
	PartsWorker w2 = new PartsWorker("Joe", "Bloggs", "222-22-2222", 7.5, 50, 100, 40);
	
	// printing w1 calling each method
	System.out.println("Testing bonus achieved:\n");
	System.out.println("Parts Worker: " + w1.getFirstName() + " " + w1.getLastName());
	System.out.println("social security number: " + w1.getSocialSecurityNumber());
	System.out.printf("payment per part: $%.2f\n", w1.getPaymentPerPiece() );
	System.out.println("parts made: "+ w1.getPiecesProduced());
	System.out.printf("wage excl bonus $%.2f\n", w1.wage());
	System.out.printf("bonus amount: $%.2f\n", w1.getFixedBonus());
	System.out.println("Parts made needed for bonus: " + w1.getBonusPiecesRequired());
	System.out.println("bonus reached?: " + w1.reachedBonus());
	System.out.printf("total earnings: $%.2f\n", w1.earnings());
	
	System.out.println("");
	
	// printing w2 object as toString
	System.out.println("Testing bonus not achieved:\n");
	System.out.println(w2);
	
	System.out.println("");
	
	// testing wrong inputs - set to $0 (same as example given)
	System.out.println("Testing negative numeric inputs:\n");
	w2.setPaymentPerPiece(-10);
	w2.setBonusPiecesRequired(-100);
	w2.setFixedBonus(-30);
	w2.setPiecesProduced(-80);
	
	// printing w2 with toString method
	System.out.println(w2.toString());
	
	
	
	
 }// end main
}// end class
