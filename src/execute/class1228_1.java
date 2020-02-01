package execute;

import bike.*;
import class2.scooter;

public class class1228_1 extends scooter {

	public static void main(String[] args) {
		bike b1 = new bike(2);
		b1.getSpeed();
		System.out.println(b1.getSpeed());
		scooter s1=new scooter();
		s1.upSpeed();s1.upSpeed();s1.upSpeed();
		System.out.println(s1.getSpeed());
	}

}
