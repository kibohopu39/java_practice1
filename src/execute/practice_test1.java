package execute;

public class practice_test1 {

	public static void main(String[] args) {
		String a = "7677";
		if (a.matches("^[0-9]{"+a.length()+"}$")) {
			boolean isDup = true;//有重複就true
			for (int i = 0; i < a.length() - 1; i++) {
				char c = a.charAt(i);
				if (a.substring(i + 1).indexOf(c) != -1) {// 從左邊第i+1位置開始到最後一位數字切取出來做比較
					// 後面沒有出現與取出來的數
					isDup = false;
					System.out.println("great!");
				}else {
					isDup=true;
					System.out.println("OhOh");
				}
			}
		}else {
			//假設輸入的東西並沒有數字
			System.out.println("請輸入數字");
		}

	}

}
