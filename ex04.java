
public class ex04 {

	public static void main(String[] args) {
		//switch���� if���� ���������, ������ ���ϰ� ���� �������� ����� �ٸ��� ����ϱ����� ����Ѵ�
		//�ڵ������� if���� ��ȿ�����ΰ�� switch���� ���°�쵵 �ִ�
		/* switch(����){
		 * case a : ��°�;
		 * case b : ��°�;
		 * case c : ��°�;
		 * case d : ��°�;
		 * default : ��°�; (default�� ���� �Ƚᵵ ����)
		 }*/

		//��������
		//int tire = 3;
		//String str;
		//����ġ��, case �ڿ��� �������� �Է����ش�.
		/*switch(tire) {
		case 1 : str ="�ܹ�������";
		case 2 : str ="�ι�������";
		case 3 : str ="����������";
		case 4 : str ="�׹�������";
		default : str ="�����Ű� �ƴ�";
		}
		System.out.println(str);*/
		//break�� ���������� ��� ����ġ���� ���ư��Ƿ� ����������
		//break�� �ɸ� switch���� ������ �������� ������ switch���� ���������� �˰���
		
			int tire = 3;
			String str;
				
			switch(tire) {
			case 1 : str ="�ܹ�������";break;
			case 2 : str ="�ι�������";break;
			case 3 : str ="����������";break;
			case 4 : str ="�׹�������";break;
			default : str ="�����Ű� �ƴ�";
			}
			System.out.println(str);
}
}