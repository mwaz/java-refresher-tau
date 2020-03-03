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
}
