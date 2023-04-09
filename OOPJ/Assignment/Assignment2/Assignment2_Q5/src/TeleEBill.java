
public class TeleEBill {
	String Customer_name;
	long Phone_number;
	int Number_of_calls_made;
	double Duration_of_calls;
	int index=0;
	public TeleEBill() {
		
		this(" ",0,0,0.0);
	}
	public TeleEBill(String customer_name, long phone_number, int number_of_calls_made, double duration_of_calls) {
		super();
		Customer_name = customer_name;
		Phone_number = phone_number;
		Number_of_calls_made = number_of_calls_made;
		Duration_of_calls = duration_of_calls;
	}
	
	public String getCustomer_name() {
		return Customer_name;
	}


	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}


	public long getPhone_number() {
		return Phone_number;
	}


	public void setPhone_number(long phone_number) {
		Phone_number = phone_number;
	}


	public int getNumber_of_calls_made() {
		return Number_of_calls_made;
	}


	public void setNumber_of_calls_made(int number_of_calls_made) {
		Number_of_calls_made = number_of_calls_made;
	}


	public double getDuration_of_calls() {
		return Duration_of_calls;
	}


	public void setDuration_of_calls(double duration_of_calls) {
		Duration_of_calls = duration_of_calls;
	}

	public void teleBill(){
		int flat = 100;
		Math.round(this.Duration_of_calls);
		index=index+Number_of_calls_made;
		if(index<=100 && Duration_of_calls<=1) {
			System.out.println("Telephone bill : "+((Number_of_calls_made*50)+flat)+" cents");
		}
		else
			System.out.println("Telephone bill : "+((Number_of_calls_made*25)+flat)+" cents");
	}
	
	
}
