
public class EBill {
	String customerName;
	double unitsConsumed;
	double billAmount;
	
	public EBill() {
		this(" ",0);
	}
	public EBill(String customerName, double unitsConsumed) {
		this.customerName = customerName;
		this.unitsConsumed = unitsConsumed;
	}
	
	public void calculateBillAmount(){
		System.out.println("customerName"+"\t\t"+"unitsConsumed"+"\t"+"Electricity Bill");
		if(unitsConsumed <=100)
		{
			System.out.printf("%-25s",this.customerName+"\t"+this.unitsConsumed+"\t\t"+(this.unitsConsumed*5));
			
		}
		else if(100<unitsConsumed && unitsConsumed<=200)
		{
			System.out.printf("%-25s",this.customerName+"\t"+this.unitsConsumed+"\t\t"+(this.unitsConsumed*7));
			
		}
		else
			System.out.printf("%-25s",this.customerName+"\t"+this.unitsConsumed+"\t\t"+(this.unitsConsumed*10));
		
	}
}
