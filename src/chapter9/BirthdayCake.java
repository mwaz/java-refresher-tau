package chapter9;

public class BirthdayCake extends Cake {
	private int candles;


	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}


	public BirthdayCake(){
		super("Vanilla");
		System.out.println("Birthday Cake");
		System.out.println(getFlavour());
		System.out.println(getPrice());
	}

}
