package execute;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class class1229_5 extends JFrame {
	private JButton open, close, exit;

	public class1229_5() {// �]�w�ۤv���غc��
		super("�o�ӬO����");// super���I�s�������غc���A�n�ݤ������]�w��ثغc��
		// �����֦����s�A��l�ƴN�n��
		setLayout(new FlowLayout(FlowLayout.CENTER));
		open = new JButton("open");
		//�]�m���s��m�~�����
		add(open);

		// �����]�w�A�^�h��ۤv�Ϊ������O���S���]�w��k
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new class1229_5();
	}

}
