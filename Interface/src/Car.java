
public class Car implements Valuable{
	private String name;
	private double price;
	public Car(String name, double price) {
		this.name=name;
		this.price=price;
	}
	public double EstimateValue(int month)
	{
		price=price*(1-0.2);
		for(int i=0;i<month;i++)
		{
			price=price*(1-0.01);
		}
		return price;
	}
	@Override
	public String toString() {
		return String.format("car name: %s\ninitial price: %.2f", name,price);
	}
}
