package chapter9;

public class Cake {
	private String flavour;
	private double price;

	public Cake ( String flavour){
		setFlavour(flavour);
		setPrice(120.50);
	}


	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
