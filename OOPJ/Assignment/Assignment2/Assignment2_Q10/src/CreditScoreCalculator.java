
public class CreditScoreCalculator {
	private int creditHistory;
	private double creditUtilization;
	private boolean paymentHistory;
	
	
	public CreditScoreCalculator(int creditHistory, double creditUtilization, boolean paymentHistory) {
		super();
		this.creditHistory = creditHistory;
		this.creditUtilization = creditUtilization;
		this.paymentHistory = paymentHistory;
	}
	
	public int getCreditHistory() {
		return creditHistory;
	}
	public void setCreditHistory(int creditHistory) {
		this.creditHistory = creditHistory;
	}
	public double getCreditUtilization() {
		return creditUtilization;
	}
	public void setCreditUtilization(double creditUtilization) {
		this.creditUtilization = creditUtilization;
	}
	public boolean isPaymentHistory() {
		return paymentHistory;
	}
	public void setPaymentHistory(boolean paymentHistory) {
		this.paymentHistory = paymentHistory;
	}
	
	public void calculateCreditScore() {
		int creditScore =0;
		if(this.paymentHistory) {
			creditScore = (getCreditHistory()* 15) + (int)(getCreditUtilization() * 30) + 55;
			System.out.println("Your credit score is "+creditScore);
		}
		else {
			creditScore = (getCreditHistory() * 15) + (int)(getCreditUtilization()* 30) + 35;
			System.out.println("Your credit score is "+creditScore);
		}
	}
	

	
}
