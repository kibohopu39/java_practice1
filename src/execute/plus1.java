package execute;

public class plus1 {

	public static void main(String[] args) {
		int i = 0, sum = 0, last = 10;
		while (i <= last) {
			sum += i++;
		}
		System.out.printf("1+2+....+%d=%d", last, sum);//梯形公式
	}

}
