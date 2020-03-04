package chapter6;

public class PhoneBill {

	public static void main(String args[]){
		PhoneBillCalculatorRedo bill = new PhoneBillCalculatorRedo(123456);

		bill.setMinituesUsed(1000);
		bill.printItemizedBill();
	}

}
