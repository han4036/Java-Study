
public class ex03 {

	public static void main(String[] args) {
		/*//if문 변수 설정
		int years = 5;
		//if문 출력
		if(years<=1) {
		System.out.println("경력 1년이하 초급개발자");
		}else if(years<=2) {
		System.out.println("경력 2년이하 중급개발자");
		}else if(years<=3) {
		System.out.println("경력 3년이하 고급개발자");
		}else {
		System.out.println("완벽한 개발자");
		}*/
		int years = 5;
		String str;
		if(years<=1) {
		str ="경력 1년이하 초급개발자";
		}else if(years<=2) {
		str = "경력 2년이하 중급개발자";
		}else if(years<=5) {
		str = "경력 5년이하 고급개발자";
		}else {
		str = "완벽한 개발자";
		}
		System.out.println(str);

		

 }
}
