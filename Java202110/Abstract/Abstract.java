package Java202110.Abstract;
public class Abstract {

    public static void main(String[] args) {
        Normal normal = new Normal(); // Normal 클래스의 인스턴스 생성
        // AbstractClass abs = new AbstractClass(); // 추상클래스는 인스턴스 생성 불가능
        // 추상메서드의 객체가 생성되지 못하므로 추상메서드 내에 있는 일반메서드 호출 불가능
        normal.normalMethod();

        System.out.println("=============================");

        SubClass2 sc2 = new SubClass2();
        sc2.normalMethod2(); // AbstractClass를 상속하여 오버라이딩 추상 메서드
        sc2.abstractMethod(); // AbstractClass를 상속하여 구현한 추상 메서드
        sc2.subClassMethod(); // SubClass를 상속하여 오버라이딩한 메서드
        sc2.subClassMathod2(); // subClass를 상속하여 구현한 메서드
        sc2.subClassMethod3(); // 오버라이딩을 하지 않아 상속받은 subClass의 일반메서드 2 호출

        System.out.println("=============================");

        SubClass sc; // SubClass의 참조변수 선언
        sc = sc2; //  SubClass의 참조변수에 SubClass의 인스턴스 저장 => 업캐스팅, 영역의 축소 일어남.// 슈퍼클래스에 있는 메서드만 구현 가능
        sc.abstractMethod();  //
        sc.subClassMethod();  // 동적바인딩으로 인해 표기는 subClass의 메서드로 보이지만, 컴파일 될 때는 sc2에 저장된 메서드를 찾아감
        sc.subClassMathod2(); // 동적바인딩으로 인해 표기는 subClass의 메서드로 보이지만, 컴파일 될 때는 sc2에 저장된 메서드를 찾아감
        sc.subClassMethod3(); //  
        //sc.lastMethod(); 영역의 축소로 서브클래스인 SubClass에 선언된 메서드는 호출 불가능





    }
}

class Normal { // 일반 클래스

    public Normal() {
        System.out.println("Normal 클래스의 생성자 호출");
    }

    public void normalMethod() {
        System.out.println("Normal 클래스의 일반 메서드 호출");   
    }
    //abstract AbstractMethod(); 일반클래스에서는 추상메서드를 가질 수 없다
}

abstract class SuperClass { // 추상클래스

    public SuperClass() {
        System.out.println("추상클래스의 생성자 호출");
    }

    public void normalMethod2() {
        System.out.println("추상클래스의 일반메서드 호출");
    }

    public abstract void abstractMethod();
    // 추상클래스에서 추상메서드 호출 가능
}
// 추상클래스의 서브 클래스 생성
// 추상클래스의 서브 클래스 오버라이딩 생략후, 서브클래스의 서브클래스 생성
abstract class SubClass extends SuperClass { // 추상클래스를 상속받은 서브클래스는 반드시 추상메서드를 오버라이딩하여 구현시켜야 한다.

    // protected abstract void abstractMethod() { 추상메서드를 오버라이딩 하기 위해서는 접근제한자의 범위가 슈퍼클래스보다 축소되면 안된다.
    // 추가로 서브클래스가 오버라이딩을 하지 않는다면, 오류가 생기지만, 
    // 오버라이딩을 하지 않을 시, 해당 클래스는 추상화클래스로 선언해주어야 하고 
    // 해당클래스를 상속받는 서브클래스를 만들고 슈퍼클래스의 메서드를 오버라이딩을 하면됨   
    public SubClass() {
        System.out.println("subClass의 생성자 호출!");
    }
    public void subClassMethod() {
        System.out.println("SubClass의 일반 메서드");
    }

    public void subClassMethod3() {
        System.out.println("subClass의 일반 메서드2, subClass2에서 오버라이딩 안할거임");
    }
    
    public abstract void subClassMathod2();
} 

class SubClass2 extends SubClass {

    public SubClass2() {
        System.out.println("Subclass2의 생성자 호출!");
    }

    public void abstractMethod() {
        System.out.println("서브클래스2에서 구현한 슈퍼클래스의 추상메서드 abstractMethod");
    } 

    public void normalMethod2() {
        System.err.println("서브클래스2에서 오버라이딩한 슈퍼클래스의 일반메서드 normalMethod2 메서드");
    }

    public void subClassMethod() {
        System.out.println("서브클래스2에서 오버라이딩한 서브클래스의 일반메서드 subClassMethod");
    }

    public void subClassMathod2() {
        System.out.println("서브클래스2에서 구현한 서브클래스의 추상메서드 subClassMethod2");
    }
    
    public void lastMethod() {
        System.out.println("SubClass2의 일반메서드 lastMthod");
    }
        
}
