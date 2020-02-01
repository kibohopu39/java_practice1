package execute;

import java.lang.reflect.Array;

public class poker3 {
	public static void main(String[] args) {
		int[] poker = new int[52];
		for (int i = 0; i < poker.length; i++)
			poker[i] = i;
		for (int i = poker.length - 1; i > 0; i--) {
			int rand = (int) (Math.random() * (i + 1));

			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
			System.out.print(poker[i] + " ");
		}
		System.out.println("\n=================================");
		int[][] players = new int[4][13];// 4人，13張牌，樹狀分配所有牌
		for (int i = 0; i < poker.length; i++) {
			players[i % 4][i / 4] = poker[i];
		}
		// �w�q
		String[] suits = { "黑桃", "愛心", "方塊", "梅花" };// 四種花色，順序為 0,1,2,3
		char[] suits2 = { '\u2660', '\u2665', '\u2666', '\u2663' };// 換成圖案
		String[] values = { "A ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 ", "J ", "Q ", "K" };
		for (int[] player : players) {// each 巡訪每一個在 players下的元素
//排序

			for (int card : player) {
				System.out.print(suits2[card % 4] + " " + values[card / 4] + " ");// 用關係式表示四種花色、牌面值跟 card 的關係
			}
			System.out.println(" ");
		}
	}
}
