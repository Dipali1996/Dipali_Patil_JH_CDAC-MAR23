
public class BMI {
	double Height;
	double Weight;
	
	public BMI() {
		this.Height = 0;
		this.Weight = 0;
	}
	public BMI(double H,double W) {
		this.Height = H;
		this.Weight = W;
	}
	
	public void setWeight(double W) {
		this.Weight =W;
	}
	
	public double getWeight() {
		return this.Weight;
	}
	
	public void setHeight(double H) {
		this.Height =H;
	}
	
	public double getHeight() {
		return this.Height;
	}
	
	public void calculateBMI() {
		double BMI = (Weight/(Height *Height));
		System.out.println("BMI : "+BMI);
	}
}
