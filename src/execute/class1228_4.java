package execute;

import javax.swing.JOptionPane;

public class class1228_4 {
//做一個猜數字的遊戲
	public static void main(String[] args) {
		// 我想用String的createanswer，但static還沒有實體，因此不能用
		// 所以要先建立
		class1228_4 obj = new class1228_4();
		String answer = obj.createAnswer(4);
		System.out.println(answer);
		boolean isWin=false;
		for(int i=0; i<10; i++) {//猜十次
			String guess = JOptionPane.showInputDialog("輸入數字");
			if(checkguess(guess))
			
			
			String result = obj.checkAB(answer, guess); 
			JOptionPane.showMessageDialog(null, result);
			if (result.equals("4A0B")) {
				isWin = true;
				break;
			}
		}
		
		if (isWin) {
			JOptionPane.showMessageDialog(null, "Winner");
		}else {
			JOptionPane.showMessageDialog(null, "Loser: " + answer);
		}
	}
boolean checkguess(String a) {
	boolean ret=false;
	if(a.length == 4) {
		if (a.matches("")) {
			
		}
	};
	
	return true;
}
	
	String checkAB(String a, String g) {//兩個字串的比對
		int A, B; A = B = 0;
		for (int i=0; i<a.length(); i++) {
			if (a.charAt(i) == g.charAt(i)) {
				A++;
			}else if(a.indexOf(g.charAt(i)) != -1) {
				B++;
			}
		}
		return A + "A" + B + "B";
	}

	String createAnswer(int d) {
		int[] poker = new int[10];
		for (int i=0; i<poker.length; i++)poker[i]=i;
		
		for (int i = poker.length-1; i>0; i--) {
			int rand = (int)(Math.random()*(i+1));
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<d; i++) {
			sb.append(poker[i]);
		}
	
		return sb.toString();
	}

}
