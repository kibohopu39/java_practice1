package class1229;

//身分證產生器
public class TWID {
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

	// 想法，當我們呼叫這個類別，我們的建構子就給予一個有效的身分字號
	// 基於使用者的需求，指定各種參數來決定身分證字號，因此便需要多種建構子來應付
	// 如下
	public TWID() {
		this((int) (Math.random() * 2) == 0);
	}

	public TWID(boolean isMale) {
		// 自動呼叫祖宗的建構式 super()，但這裡我們可以利用建構式的不同來應對建立後產出的結果
		// 而為了讓維護方便，可以讓所有的建構式全部指向其中一個建構式，讓該建構式去呼叫
		// 因此利用this()呼叫自己的其他建構式
		// 這個建構式指定了性別，但沒有指定地點，因此可以讓地點由亂數選出
		// 因應地點要亂數取出，我們將 checkID 中的 letters 拿出來，設定成 static
		this((int) (Math.random() * 26), isMale);
	}

	public TWID(int area) {
		// 性別隨機 0或1，
		this(area, (int) (Math.random() * 2) == 0);
	}

	public TWID(int area, boolean isMale) {
		// super();
		// 這個建構式必須給出使用者一組ID，而且是正確無誤的
		// 以下開始來做ID
		// 做一個String，建議用stringbuffer，接著把首位的地區碼放進來
		StringBuffer sb = new StringBuffer(letters.substring(area, area + 1));
		sb.append(isMale ? "1" : "2");
		for (int i = 0; i < 7; i++) {// 做出後7位數字
			sb.append((int) (Math.random() * 10));// 每次隨機加入0~9的數字
		}
		String id10 = sb.toString();
		// 第8位加入後就要確定是正確的，所以叫出static來辨別，並且我們用最笨的方法，一個一個測
		for (int i = 0; i < 10; i++) {
			if (checkID(id10 + i)) {// 如果true
				id = id10 + i;
				break;
			}else {}//continue 但不寫也會continue,
		}
	}

	private TWID(String ID) {
		// 指定數字，但因為開放出去使用的話，會有隨意輸入造成錯誤的問題
		// 雖然有這層需要，但我們希望在特定條件下呼叫這個建構式
		// 比方說可以造一個 static，用 static 呼叫建構式來new實體
		this.id=ID;
	}
	public static TWID createTWTID(String ID) {
		TWID temp=null;
		if (checkID(ID)) {
			temp =new TWID(ID);
		}
		return temp;
	}

	// 建立一個 static 方法，因為當我們產生的身分證的時候，再去檢查數字是否合理就來不及了
	// 只要是 static，那麼就跟物件是否產生無關係，可以直接使用
	public static boolean checkID(String ID) {
		// 將身分證字母依照其數字編序

		if (ID.matches("[A-Z][1-2][0-9]{8}")) {
			char areaN = ID.charAt(0);// 第一位是什麼英文字母
			// 找出11個數字
			int n12 = letters.indexOf(areaN) + 10;
			// indexof 找出字母在letters的哪一個位置
			// 剛好位置數字有規律，因此我們才依照規律建一個string
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
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

}
