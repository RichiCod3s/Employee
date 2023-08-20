
public class PartsWorker extends Employee {	
	
	private int piecesProduced; // how many parts the worker made
	private double paymentPerPiece; // how much the worker earns per part
	private int bonusPiecesRequired; // how many parts the worker needs to make for bonus
	private double fixedBonus; // the amount of the bonus 
	
	// 7-argument constructor
	public PartsWorker(String first, String last, String ssn, double paymentPerPiece, int bonusPartAmount,
			double fixedBonus, int piecesProduced) {
		super(first, last, ssn);
		setPiecesProduced(piecesProduced);
		setBonusPiecesRequired(bonusPartAmount);
		setPaymentPerPiece(paymentPerPiece);
		setFixedBonus(fixedBonus);
	}

	
	public int getPiecesProduced() {
		return piecesProduced;
	}
	
	public void setPiecesProduced(int piecesProduced) {
			this.piecesProduced = piecesProduced > 0 ? piecesProduced : 0;
	}// end method
	
	public double getPaymentPerPiece() {
		return paymentPerPiece;
	}


	public void setPaymentPerPiece(double paymentPerPiece) {
		this.paymentPerPiece = paymentPerPiece > 0 ? paymentPerPiece : 0;
	}


	public int getBonusPiecesRequired() {
		return bonusPiecesRequired;
	}


	public void setBonusPiecesRequired(int bonusNumber) {
		bonusPiecesRequired = bonusNumber > 0 ? bonusNumber:0;
	}
	
	public double getFixedBonus() {
		return fixedBonus;
	}
	
	
	public void setFixedBonus(double fixedBonus) {
		this.fixedBonus = fixedBonus > 0 ? fixedBonus: 0;
	}
	
	// has the worker made enough parts to reach bonus
	public boolean reachedBonus() {
		if(getPiecesProduced()>= getBonusPiecesRequired() && getPiecesProduced() > 0) {
			return true;
		}else {
			return false;
		}
	}// end method
	
	// standard wage without the bonus
	public double wage() {
		return getPiecesProduced() * getPaymentPerPiece(); 
	}
	
	@Override
	public double earnings() {
		if(!reachedBonus()) {
		return wage();  // no bonus
		}else {
			return wage() + getFixedBonus(); // bonus achieved 
		}
	}
	
	// return String representation of PartsWorker object
	public String toString() {
		return String.format("Parts Worker: %s\n%s: $%,.2f\n%s: %d\n%s: $%,.2f\n%s: $%,.2f\n%s: %d\n%s: %b\n%s: $%,.2f",
				super.toString(), "payment per part", getPaymentPerPiece(), "parts made", getPiecesProduced(),
				"wage excl bonus", wage(), "fixed bonus amount", getFixedBonus(), "parts made needed for bonus",
				getBonusPiecesRequired(), "bonus achieved", reachedBonus(), "total earnings", earnings());
	} // end method toString

} // end class
