package Project;

class Electronics extends Product{
	public Electronics(String Name, double price) {
		super(Name,price);
	}

	@Override
	public double discount() {
		return price *(0.1);
	}

}