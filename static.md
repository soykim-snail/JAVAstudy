#### tip!

*How to call a method outside of this package?*

[방법1] import that class!

```java
package day8;
import day6.MethodLab3;
public class void main(String[] args) {
	MethodLab3.getRandom(9) ....;
}
```



[방법2] put package name!

```java
package day8;
public class void main(String[] args) {
	day6.MethodLab3.getRandom(9) ....;
}
```



#### tip!

Show me your class loading operation!



#### error!

java.lang.StackOverflowError : call stack이 꽉 찼을 때!

java.lang.OutOfMemoryError : heap이 꽉 찼을 때!







## static

뜻: 정적, 고정

제어자

*member variable*와 *method* 앞에 지정 가능하다

객체생성을 하지 않아도 자동으로 메모리영역을 할당하거나 호출가능한 상태가 된다.

static이 붙은 member variable과 method는 ` ClassName.memberName ` 로 사용할 수 있다. (in any other classes)



### when `static`?

