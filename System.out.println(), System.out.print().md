### System.out.println(), System.out.print()

(1) 출력 데이터를 한 개만 지정

(2) 출력할 데이터가 여러개일 때는 `+`연산자로 결합하여 한 개로 전달해야

(3) 출력하려는 데이터의 타입에 따라 출력 형식이 정해진다.

​		int --> 10진수 숫자
 		char --> 문자
​		double --> 소수점 이하의 자리수를 설정불가


### System.out.printf()

Java5(JDK 1.5) 부터 - **System.out.printf()** 추가됨

​	System.out.printf("출력하려는 포맷문자열")
​	System.out.printf("가나다")
​	System.out.printf("가나다\n")
​	System.out.printf("가나다%n")
​	System.out.printf("가나%d다", sum)
​	System.out.printf("가나%.2f다", avg)
​	System.out.printf("가%d나%.2f다", sum, avg)
