
public class Car implements Valuable{
	private String name;
	private double price;
	
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double EstimateValue(int month) {
		double p=price*(1-0.2);
		for(int i=0;i<month;i++) p=p*(1-0.01);
		return p;
	}
	
	public double estimateValue(int month) {
		double p=price*(1-0.2);
		for(int i=0;i<month;i++) p=p*(1-0.01);
		return p;
	}
	
	public double estimateValue() {
		double p=price*(1-0.2);
		p=p*(1-0.01);
		return p;
	}

	@Override
	public String toString() {
		return String.format("car name: %s\ninitial price: %.2f",name,price);
	}
}
