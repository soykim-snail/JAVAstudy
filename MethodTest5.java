package day6;
public class MethodTest5 {
	public static void main(String[] args) {
		System.out.println("main() �������");
		int result = operate(010, 0b10); //8+2-->10
		System.out.printf("ȣ���� 1 : %#X%n", result); //10 --> 16������ 0XA
		System.out.println("ȣ���� 2 : " + operate(0XB, 0)); //11+0-->11 
		System.out.println("ȣ���� 3 : " + operate(0XC, 0b10)); //12+2-->14
		int result2 = operate(11,22) %2; //Ȧ��
		if(result2==0) 
			System.out.println("ȣ���� 4 : " + "¦��");
		else
			System.out.println("ȣ���� 4 : " + "Ȧ��");
		
		System.out.println(getName());
		System.out.println("main() ��������");

	}
	static int operate(int num1, int num2) {
		return num1+num2;		
	}

	static int operate(int num1, int num2, int num3) { //�޼��� �����ε�
		return num1+num2+num3;		
	}
	
	static String getName() {
		return "��ҿ�";
	}
}
