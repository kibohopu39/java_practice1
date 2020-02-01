package class2;
import bike.*;
public class Bike2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike p1 = new bike();

		do {
			System.out.println(p1.getSpeed());
			p1.upSpeed();
		} while (p1.getSpeed() < 10);
	}

}
