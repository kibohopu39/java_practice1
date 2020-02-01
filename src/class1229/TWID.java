package class1229;

//�����Ҳ��;�
public class TWID {
	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";

	// �Q�k�A��ڭ̩I�s�o�����O�A�ڭ̪��غc�l�N�����@�Ӧ��Ī������r��
	// ���ϥΪ̪��ݨD�A���w�U�ذѼƨӨM�w�����Ҧr���A�]���K�ݭn�h�ثغc�l�����I
	// �p�U
	public TWID() {
		this((int) (Math.random() * 2) == 0);
	}

	public TWID(boolean isMale) {
		// �۰ʩI�s���v���غc�� super()�A���o�̧ڭ̥i�H�Q�Ϋغc�������P������إ߫Უ�X�����G
		// �Ӭ��F�����@��K�A�i�H���Ҧ����غc���������V�䤤�@�ӫغc���A���ӫغc���h�I�s
		// �]���Q��this()�I�s�ۤv����L�غc��
		// �o�ӫغc�����w�F�ʧO�A���S�����w�a�I�A�]���i�H���a�I�Ѷüƿ�X
		// �]���a�I�n�üƨ��X�A�ڭ̱N checkID ���� letters ���X�ӡA�]�w�� static
		this((int) (Math.random() * 26), isMale);
	}

	public TWID(int area) {
		// �ʧO�H�� 0��1�A
		this(area, (int) (Math.random() * 2) == 0);
	}

	public TWID(int area, boolean isMale) {
		// super();
		// �o�ӫغc���������X�ϥΪ̤@��ID�A�ӥB�O���T�L�~��
		// �H�U�}�l�Ӱ�ID
		// ���@��String�A��ĳ��stringbuffer�A���ۧ⭺�쪺�a�ϽX��i��
		StringBuffer sb = new StringBuffer(letters.substring(area, area + 1));
		sb.append(isMale ? "1" : "2");
		for (int i = 0; i < 7; i++) {// ���X��7��Ʀr
			sb.append((int) (Math.random() * 10));// �C���H���[�J0~9���Ʀr
		}
		String id10 = sb.toString();
		// ��8��[�J��N�n�T�w�O���T���A�ҥH�s�Xstatic�ӿ�O�A�åB�ڭ̥γ̲ª���k�A�@�Ӥ@�Ӵ�
		for (int i = 0; i < 10; i++) {
			if (checkID(id10 + i)) {// �p�Gtrue
				id = id10 + i;
				break;
			}else {}//continue �����g�]�|continue,
		}
	}

	private TWID(String ID) {
		// ���w�Ʀr�A���]���}��X�h�ϥΪ��ܡA�|���H�N��J�y�����~�����D
		// ���M���o�h�ݭn�A���ڭ̧Ʊ�b�S�w����U�I�s�o�ӫغc��
		// ��軡�i�H�y�@�� static�A�� static �I�s�غc����new����
		this.id=ID;
	}
	public static TWID createTWTID(String ID) {
		TWID temp=null;
		if (checkID(ID)) {
			temp =new TWID(ID);
		}
		return temp;
	}

	// �إߤ@�� static ��k�A�]����ڭ̲��ͪ������Ҫ��ɭԡA�A�h�ˬd�Ʀr�O�_�X�z�N�Ӥ��ΤF
	// �u�n�O static�A����N�򪫥�O�_���͵L���Y�A�i�H�����ϥ�
	public static boolean checkID(String ID) {
		// �N�����Ҧr���̷Ө�Ʀr�s��

		if (ID.matches("[A-Z][1-2][0-9]{8}")) {
			char areaN = ID.charAt(0);// �Ĥ@��O����^��r��
			// ��X11�ӼƦr
			int n12 = letters.indexOf(areaN) + 10;
			// indexof ��X�r���bletters�����@�Ӧ�m
			// ��n��m�Ʀr���W�ߡA�]���ڭ̤~�̷ӳW�߫ؤ@��string
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
