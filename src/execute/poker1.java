package execute;

public class poker1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] poker = new int[52];// 0
		long now = System.currentTimeMillis();
//		for (int i=0;i<poker.length;i++) {
//			poker[i]=i;
//		};
		// �~�P�A�� random�A�ҥH�n�ư����ƪ�
		for (int i = 0; i < poker.length; i++) {

			int rand = (int) (Math.random() * 52 + 1);
			// �ˬd
			boolean thesame = false;
			for (int j = 0; j < i; j++) {// �Ĥ@�Ӽƶi�ӥH��A�}�l�ˬd
				if (rand == poker[j]) {
					// ����
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
