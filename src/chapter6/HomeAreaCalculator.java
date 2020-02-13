package chapter6;

public class HomeAreaCalculator {

		public static void main(String args[]){
			Rectangle room1 = new Rectangle();
			room1.setWidth(25);
			room1.setLength(50);
			double roomOneArea = room1.calculateArea();

			Rectangle room2 = new Rectangle(30, 75);
			double roomTwoArea = room2.calculateArea();
			double totalArea = roomOneArea + roomTwoArea;

			System.out.println("Area of both rooms is " + String.format("%.2f", totalArea));


		}

}
