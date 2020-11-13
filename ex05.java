
public class ex05 {

	public static void main(String[] args) {
		//변수 설정
		String ride = "자전거";
		String str;
		
		//스위치문
		switch(ride) {
		case "외발자전거" : str = "바퀴가 한개";break;
		case "자전거" : str = "바퀴가 두개";break;
		case "세발자전거" : str = "바퀴가 세개";break;
		case "네발자전거" : str = "바퀴가 네개";break;
		default : str = "자전거가 아님";
		}
		System.out.println(str);
}
}
