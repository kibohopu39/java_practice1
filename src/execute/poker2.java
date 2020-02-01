
package execute;

public class poker2 {
	public static void main(String[] args) {
		int[] poker = new int[52];// 0
		long now = System.currentTimeMillis();
		for (int i = 0; i < poker.length; i++) {
			boolean thesame = false;		
			int rand;
			do {
				rand = (int) (Math.random() * 52 + 1);
				// ÀË¬d
				for (int j = 0; j < i;) {
					thesame = true;
					break;
				}
			} while (thesame);
			poker[i]=rand;
			System.out.println(poker[i]);
		}
		System.out.println("===========");
		System.out.println(System.currentTimeMillis()-now);
	}
}