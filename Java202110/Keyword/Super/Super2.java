package Java.Keyword.Super;

public class Super2 {
    public static void main(String[] args) {
        Person p = new Person();
        //1. 슈퍼클래스의 인스턴스 생성
        //2. 생성자에 this 레퍼런스가 없다면 생성자만 호출.
        //3. 생성자에 this 레퍼런스가 있다면 파라미터 생성자 호출.
        System.out.println("===============");

        Person2 p2 = new Person2();
        //1. 서브클래스의 인스턴스가 생성되기 전 슈퍼클래스의 인스턴스를 먼저 생성
        //2. 서브클래스 생성자에 this가 없다면 
        //3. 생성자에 this 레퍼런스가 있다면 파라미터 생성자 호출.
        //4. 생성자에 this 레퍼런스가 없다면 암묵적으로 생성자 구문 최상단에 super() 생성됨.
        //5. 슈퍼클래스의 생성자에 호출, =>슈퍼클래스의 생성자에 this()가 있다면 슈펄클래스의 파라미터 생성자 호출.
        //6. 슈퍼클래스의 파라미터 생성자 출력 - 슈퍼클래스 생성자 출력 - 서브클래스 생성자 출력(this()가 있다면 파라미터 생성자부터 출력)

    }
}

class Person {
    int a;
    public Person() {
        this("c");   
        System.out.println("슈퍼클래스의 생성자");
    }

    public Person(String alpa) {   
        System.out.println("슈퍼클래스의 파라미터 생성자");
    }
}

class Person2 extends Person {

    public Person2() { 
        this("c");  
        System.out.println("서브클래스의 생성자");
    }

    public Person2 (String alpa) {  
        super();
        System.out.println("서브클래스의 파라미터 생성자");
    }
}