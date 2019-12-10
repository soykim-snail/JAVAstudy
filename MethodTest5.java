package day6;
public class MethodTest5 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		int result = operate(010, 0b10); //8+2-->10
		System.out.printf("호출결과 1 : %#X%n", result); //10 --> 16진수로 0XA
		System.out.println("호출결과 2 : " + operate(0XB, 0)); //11+0-->11 
		System.out.println("호출결과 3 : " + operate(0XC, 0b10)); //12+2-->14
		int result2 = operate(11,22) %2; //홀수
		if(result2==0) 
			System.out.println("호출결과 4 : " + "짝수");
		else
			System.out.println("호출결과 4 : " + "홀수");
		
		System.out.println(getName());
		System.out.println("main() 수행종료");

	}
	static int operate(int num1, int num2) {
		return num1+num2;		
	}

	static int operate(int num1, int num2, int num3) { //메서드 오버로딩
		return num1+num2+num3;		
	}
	
	static String getName() {
		return "김소연";
	}
}
