
public class ex04 {

	public static void main(String[] args) {
		//switch문은 if문과 비슷한형식, 변수를 정하고 변수 값에따라 결과를 다르게 출력하기위해 사용한다
		//코딩에따라 if문이 비효율적인경우 switch문을 쓰는경우도 있다
		/* switch(변수){
		 * case a : 출력값;
		 * case b : 출력값;
		 * case c : 출력값;
		 * case d : 출력값;
		 * default : 출력값; (default는 굳이 안써도 무방)
		 }*/

		//변수설정
		//int tire = 3;
		//String str;
		//스위치문, case 뒤에는 변수값을 입력해준다.
		/*switch(tire) {
		case 1 : str ="외발자전거";
		case 2 : str ="두발자전거";
		case 3 : str ="세발자전거";
		case 4 : str ="네발자전거";
		default : str ="자전거가 아님";
		}
		System.out.println(str);*/
		//break를 걸지않으면 계속 스위치문이 돌아가므로 오류가난다
		//break를 걸면 switch문이 실행중 변수값을 만나면 switch문을 빠져나오는 알고리즘
		
			int tire = 3;
			String str;
				
			switch(tire) {
			case 1 : str ="외발자전거";break;
			case 2 : str ="두발자전거";break;
			case 3 : str ="세발자전거";break;
			case 4 : str ="네발자전거";break;
			default : str ="자전거가 아님";
			}
			System.out.println(str);
}
}