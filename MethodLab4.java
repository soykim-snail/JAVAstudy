package day6;
public class MethodLab4 {
	public static void main(String[] args) {
		int[] array1 = {10, 20, 30};
		int[] array2 = {100, 500, 300, 200, 400};
		int[] array3 = {1, 10, 3, 4, 5, 8, 7, 6, 9, 2};
		
		System.out.printf("가장 큰 값은 %d입니다.%n", maxNumberArray(array1));
		System.out.printf("가장 큰 값은 %d입니다.%n", maxNumberArray(array2));
		System.out.printf("가장 큰 값은 %d입니다.%n", maxNumberArray(array3));

	}

	static int maxNumberArray(int[] p) {
		int max=p[0];
		for(int i=0; i<p.length; i++)
			if(p[i]>max)
				max = p[i];
		return max;
	}
	
	
}
