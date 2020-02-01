package execute;

public class poker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poker = new int[52];// 0
		long now = System.currentTimeMillis();
//		for (int i=0;i<poker.length;i++) {
//			poker[i]=i;
//		};
		// 洗牌，用 random，所以要排除重複的
		for (int i = 0; i < poker.length; i++) {

			int rand = (int) (Math.random() * 52 + 1);
			// 檢查
			boolean thesame = false;
			for (int j = 0; j < i; j++) {// 第一個數進來以後再開始檢查
				if (rand == poker[j]) {
					// 重複
					thesame = true;
					break;
				} else {
					if (!thesame) {
						poker[i] = rand;
					} else {
						i--;
					}
				}
				System.out.println(poker[i]);

			}
		}
//		System.out.println("-------\t"+System.currentTimeMillis()-);
	}

}
