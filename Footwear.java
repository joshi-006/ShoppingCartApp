package Project;

class Footwear extends Product{
	public Footwear(String Name, double price) {
		super(Name,price);
	}

	@Override
	public double discount() {
		return price * (0.05);
	}

}