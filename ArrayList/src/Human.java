
public class Human implements Valuable{
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public double EstimateValue(int months) {
		return Double.POSITIVE_INFINITY;
	}
	
	public double estimateValue(int months) {
		return Double.POSITIVE_INFINITY;
	}
	
	public double estimateValue() {
		return Double.POSITIVE_INFINITY;
	}

	@Override
	public String toString() {
		return String.format("Human name: %s\nregisered age: %d",name,age);
	}
}
