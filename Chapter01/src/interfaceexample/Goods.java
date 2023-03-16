package interfaceexample;

class Goods {
	public String description;
	public double price;

	public Goods(String des, double pr) {
		description = des;
		price = pr;
	}

	public void display() {
		System.out.println("item: " + description + " price: " + price);
	}
}