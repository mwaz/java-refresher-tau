package chapter9;

public class WeddingCake extends Cake {

	public WeddingCake() {
		super("Chocolate");
		System.out.println("Wedding Cake");

		System.out.println(getFlavour());
		System.out.println(getPrice());
	}
	public int tiers;


	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}




}
