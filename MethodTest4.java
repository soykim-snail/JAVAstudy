package day6;
public class MethodTest4 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		printMyName(0b10, '*');
		printName("�鸸��", '&');
		System.out.println("main() ��������");

	}
	static void printMyName(int num, char deco) {
		for(int i=1; i<=num; i++)
			System.out.println(deco + "Kim Soyun" + deco);
	}

	static void printName(String name, char deco) {
		System.out.println(deco + name + deco);
	}
	
}
