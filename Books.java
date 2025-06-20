package Project;

class Books extends Product{

	public Books(String Name, double price) {
		super(Name, price);
	}

	@Override
	public double discount() {
		return price *(0.02);
	}

}
