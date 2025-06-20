package Project;

abstract class Product{
	protected String Name;
	protected double price;
	
	public Product(String name, double price) {
	    if (price < 0) {
	        throw new IllegalArgumentException("❌ Price cannot be negative.");
	    }
	    this.Name = name;
	    this.price = price;
	}
	public abstract double discount();
	
	public double finalPrice() {
		return price - discount();
	}
		
	public void display(){
		System.out.println(Name + "$"+ finalPrice());
	}
}
