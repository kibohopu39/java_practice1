package execute;

import java.util.Scanner;

//���լO�_�B�@���`
public class class1229_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String ID = in.next();//��J����
		String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
		if (ID.matches("[A-Z][1-2][0-9]{8}")) {
			char areaN = ID.charAt(0);// �Ĥ@��O����^��r��
			// ��X11�ӼƦr
			int n12 = letters.indexOf(areaN) + 10;
			// indexof ��X�r���bletters�����@�Ӧ�m
			// ��n��m�Ʀr���W�ߡA�]���ڭ̤~�̷ӳW�߫ؤ@��string
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			int n3 = Integer.parseInt(ID.substring(1, 2));
			int n4 = Integer.parseInt(ID.substring(2, 3));
			int n5 = Integer.parseInt(ID.substring(3, 4));
			int n6 = Integer.parseInt(ID.substring(4, 5));
			int n7 = Integer.parseInt(ID.substring(5, 6));
			int n8 = Integer.parseInt(ID.substring(6, 7));
			int n9 = Integer.parseInt(ID.substring(7, 8));
			int n10 = Integer.parseInt(ID.substring(8, 9));
			int n11 = Integer.parseInt(ID.substring(9, 10));
			int sum = n1 * 1 + n2 * 9 + n3 * 8 + n4 * 7 + n5 * 6 + n6 * 5 + n7 * 4 + n8 * 3 + n9 * 2 + n10 * 1
					+ n11 * 1;
			int rec = sum % 10;
			if (rec == 0) {
				System.out.println("��F");
			} else {
				System.out.println("���F");
			}
		} else {
			System.out.println("���F");
		}

	}

}
