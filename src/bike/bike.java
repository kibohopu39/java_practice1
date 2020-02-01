package bike;

public class bike {
	protected double Speed = 0;
	protected int color;

//只作用一次，建一個物件後初始化，若物件已經存在，那此方法就沒意義了
	// 這個叫做建構式
	public bike(int color) {
		System.out.println("呼叫了bike建構式");
		if (color > 0)
			this.color = color;
		else
			this.color = 1;
	}

	public void setColor(int color) {

		if (color > 0) {
			this.color = color;
		} else {
			this.color = 1;
		}
	}

	public int getColor() {
		return color;
	}

	public void upSpeed() {
		Speed = Speed > 5 ? 5 : Speed + 1;
	}

	public void downSpeed() {
		Speed -= 2;
	}

	public double getSpeed() {
		return Speed;
	}

}
