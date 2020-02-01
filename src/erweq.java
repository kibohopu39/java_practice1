import java.awt.image.renderable.RenderableImage;

public class erweq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o, t, three, four, five, six, p0;
		o = 0;
		t = 0;
		t = 0;
		three = 0;
		four = 0;
		five = 0;
		six = 0;
		p0 = 0;

		for (int i = 0; i < 100; i++) {
			int a = (int) (Math.random() * 6 + 1);
			switch (a) {
			case 1:
				o = o + 1;
				break;
			case 2:
				t++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			default:
				p0++;
				break;
			}
		}
		;
		if (p0 == 0) {
			System.out.printf("1ÂI¥X²{ %d ¦¸\n", o);
			System.out.printf("2ÂI¥X²{ %d ¦¸\n", t);
			System.out.printf("3ÂI¥X²{ %d ¦¸\n", three);
			System.out.printf("4ÂI¥X²{ %d ¦¸\n", four);
			System.out.printf("5ÂI¥X²{ %d ¦¸\n", five);
			System.out.printf("6ÂI¥X²{ %d ¦¸\n", six);
		}
//		---------------------------------------------------------
//		°µ¦Ñ¤d
		int[] point = new int[7];
		for (int i = 0; i < 100; i++) {
			int rend = (int) (Math.random() * 9 + 1);// 1-9
			point[rend >= 7 ? rend - 3 : rend]++;// 7,8,9ªº¦¸¼Æ+¨ì4,5,6
		}
		if (point[0] == 0) {
			for (int i = 0; i <= 6; i++) {
				System.out.printf("%d ÂI¥X²{ %d\n", i, point[i]);
			}
		}
//		----------------------------------------------------------

	}
}
