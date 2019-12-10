package day6;
public class MethodTest4 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(0b10, '*');
		printName("백만불", '&');
		System.out.println("main() 수행종료");

	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco + "Kim Soyun" + deco);
	}

	static void printName(String name, char deco) {
		System.out.println(deco + name + deco);
	}
	
}
