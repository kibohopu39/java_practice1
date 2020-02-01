package execute;

public class class1229_3 {
	public static void main(String[] args) {
		aaa1 obj1 = new aaa1();
		bbb1 obj2 = new bbb1();
		dosomething(obj1);
		
	}

	static void dosomething(Javaer javaer) {// Javaer 類別的
		javaer.OCAJP();
	}
}

interface Javaer {// 介面裡，可以不用有實作，但在 class 中不可以，這裡只有定義規格
	void OCAJP();// 規格隱含 public，不用寫修飾字

	void OCPJP();
}

class aaa1 implements Javaer {// 用這個類別定義出上述的實作
	public void OCAJP() {
		System.out.println("aaa1");
	};// 有大括號表示有實作

	public void OCPJP() {
	};
}

class bbb1 implements Javaer {// 用另一個類別定義出上述的實作，這裡是多型的概念
	public void OCAJP() {
		System.out.println("bbb1");
	};// 有大括號表示有實作

	public void OCPJP() {
	};
}
