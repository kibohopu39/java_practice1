package execute;

public class practice_test1 {

	public static void main(String[] args) {
		String a = "7677";
		if (a.matches("^[0-9]{"+a.length()+"}$")) {
			boolean isDup = true;//�����ƴNtrue
			for (int i = 0; i < a.length() - 1; i++) {
				char c = a.charAt(i);
				if (a.substring(i + 1).indexOf(c) != -1) {// �q�����i+1��m�}�l��̫�@��Ʀr�����X�Ӱ����
					// �᭱�S���X�{�P���X�Ӫ���
					isDup = false;
					System.out.println("great!");
				}else {
					isDup=true;
					System.out.println("OhOh");
				}
			}
		}else {
			//���]��J���F��èS���Ʀr
			System.out.println("�п�J�Ʀr");
		}

	}

}
