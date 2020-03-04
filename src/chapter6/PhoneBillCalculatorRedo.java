package chapter6;

public class PhoneBillCalculatorRedo {
	private int id = 0;
	private double baseCost = 12.6;
	private  int allotedMinutes = 30;
	private int  minituesUsed = 6;

	public PhoneBillCalculatorRedo(){
		id = 0;
		baseCost = 12.6;
		allotedMinutes = 30;
		minituesUsed = 6;
	}
	public PhoneBillCalculatorRedo(int id){
		this.id = id;
		baseCost = 12.6;
		allotedMinutes = 30;
		minituesUsed = 6;
	}
	public PhoneBillCalculatorRedo(int id, double baseCost, int allotedMinutes, int minituesUsed){
		this.id = id;
		this.baseCost = baseCost;
		this.allotedMinutes = allotedMinutes;
		this.minituesUsed = minituesUsed;
	}

	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public double getBaseCost(){
		return baseCost;
	}

	public void setBaseCost(double baseCost){
		this.baseCost = baseCost;
	}

	public int getAllotedMinutes() {
		return allotedMinutes;
	}

	public void setAllotedMinutes(int allotedMinutes){
		this.allotedMinutes = allotedMinutes;
	}

	public int getMinituesUsed(){
		return  minituesUsed;
	}

	public  void setMinituesUsed(int minituesUsed){
		this.minituesUsed = minituesUsed;
	}

	public double calculateOverage(){
		if(minituesUsed <= allotedMinutes){
			return 0;
		}

		double overageRate = 0.25;
		double overageMinutes = minituesUsed - allotedMinutes;
		return overageMinutes * overageRate;
	}

	public double calculateTax(){
		double taxRate = 0.15;
		return taxRate * (baseCost + calculateOverage());
	}

	public double calculateTotal(){
		return baseCost + calculateOverage() + calculateTax();
	}

	public void printItemizedBill(){
		System.out.println("ID: " + id);
		System.out.println("Base Rate: $" + baseCost);
		System.out.println("Overage Fee: $"
				+ String.format("%.2f", calculateOverage()));
		System.out.println("Tax: $"
				+ String.format("%.2f", calculateTax()));
		System.out.println("Total: $"
				+ String.format("%.2f", calculateTotal()));
	}

}
