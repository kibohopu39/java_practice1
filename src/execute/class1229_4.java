package execute;

//���իغc�l����z
public class class1229_4 {

	public static void main(String[] args) {

	}

}

class aaa {
	int a = 12;
	aaa() {
		System.out.println("aaa���غc�l");
	}

	{
		System.out.println("{}a=" + a);
	}
	static {// �ΦW�A�o�ذΦW��static�A�u�n�b�����O������ͦ��άO�����Ψϥγo�����O��static�A�N�|�۰ʸ��J
		System.out.println("static aaa");
	}

	static void m1() {
		System.out.println("static m1 aaa");
	}
}

class bbb extends aaa {
	bbb() {
		System.out.println("bbb�غc�l");
	}

	{
		System.out.println("bbb.{}");
	}

}

class ccc {

}