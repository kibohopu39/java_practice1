package class2;

import bike.*;

public class scooter extends bike {
	private int gear;
	private double speed;

	public scooter() {
		super(3);
		System.out.println("呼叫了scooter建構式");
	}

	public void upSpeed() {
//		System.out.println("haha~");
		super.upSpeed();
		speed *= 1.2;
	}// 改寫，先叫出父類的upSpeed方法，再新增子類別的方法
//若是直接全部改掉那可以直接換名字

	public void upSpeed(int gear) {
		setgear(gear);
		speed = Speed < 1 ? 1 : Speed * 1.2 * gear;
	}

	private void setgear(int gear) {
		this.gear = gear;
	}
}
