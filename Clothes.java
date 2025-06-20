package Project;

class Clothes extends Product{
	public Clothes(String Name, double price) {
		super(Name,price);
		
	}

	@Override
	public double discount() {
		return price * (0.15);
	}

}
