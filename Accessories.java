package Project;

class Accessories extends Product{
	public Accessories(String Name, double price) {
		super(Name,price);
	}

	@Override
	public double discount() {
		return price*(0.2);
	}
	

}