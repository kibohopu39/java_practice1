package execute;

//測試建構子的原理
public class class1229_4 {

	public static void main(String[] args) {

	}

}

class aaa {
	int a = 12;
	aaa() {
		System.out.println("aaa的建構子");
	}

	{
		System.out.println("{}a=" + a);
	}
	static {// 匿名，這種匿名的static，只要在該類別有物件生成或是有提及使用這個類別的static，就會自動載入
		System.out.println("static aaa");
	}

	static void m1() {
		System.out.println("static m1 aaa");
	}
}

class bbb extends aaa {
	bbb() {
		System.out.println("bbb建構子");
	}

	{
		System.out.println("bbb.{}");
	}

}

class ccc {

}