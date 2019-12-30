### interface

* it is  class, final class, abstract class!

* Every method in it is abstract method.

* so called *a very special one of an abstract class*, and supporting multi inheritance.
* useful to standardize!!



How to make..?

```java
interface NameOfInterface {
    CONSTANT = value; //initialize!!
    absctact nameOfMethod;
}
```

```java
interface NewInterface extends MotherInterface, FatherInterface {
    
} // double inheritance possible!!
```



How to use...?

key word `implements`

```java
class NewClass extends AClass implements AnInterface {

}
```

