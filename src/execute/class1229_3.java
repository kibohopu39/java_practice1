package execute;

public class class1229_3 {
	public static void main(String[] args) {
		aaa1 obj1 = new aaa1();
		bbb1 obj2 = new bbb1();
		dosomething(obj1);
		
	}

	static void dosomething(Javaer javaer) {// Javaer ���O��
		javaer.OCAJP();
	}
}

interface Javaer {// �����̡A�i�H���Φ���@�A���b class �����i�H�A�o�̥u���w�q�W��
	void OCAJP();// �W�����t public�A���μg�׹��r

	void OCPJP();
}

class aaa1 implements Javaer {// �γo�����O�w�q�X�W�z����@
	public void OCAJP() {
		System.out.println("aaa1");
	};// ���j�A����ܦ���@

	public void OCPJP() {
	};
}

class bbb1 implements Javaer {// �Υt�@�����O�w�q�X�W�z����@�A�o�̬O�h��������
	public void OCAJP() {
		System.out.println("bbb1");
	};// ���j�A����ܦ���@

	public void OCPJP() {
	};
}
