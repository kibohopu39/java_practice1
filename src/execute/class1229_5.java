package execute;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class class1229_5 extends JFrame {
	private JButton open, close, exit;

	public class1229_5() {// 設定自己的建構式
		super("這個是視窗");// super為呼叫父類的建構式，要看父類有設定何種建構式
		// 視窗擁有按鈕，初始化就要有
		setLayout(new FlowLayout(FlowLayout.CENTER));
		open = new JButton("open");
		//設置按鈕位置才能顯示
		add(open);

		// 視窗設定，回去找自己或直屬類別有沒有設定方法
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new class1229_5();
	}

}
