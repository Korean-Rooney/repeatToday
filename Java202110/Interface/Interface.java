package Java202110.Interface;

public class Interface {
    // Parent p = new Parent(); interface는 인스턴스를 생성할 수 없다
    Parent P = new Child(); // interface는 참조변수 타입으로 사용은 가능하다
    // => 업캐스팅을 통한 다형성 활용이 가능하다
    
}

interface Parent {
    int A = 10; // interface의 모든 멤버변수는 public static final이 붙은 상수로 취급
    
    // public parent(){} interfae는 생성자를 가질 수 없다

    public void write(); // interface의 모든 메서드는 public abstract가 붙은 추상메서드로 취급된다
    // 그러기 때문에 body를 가질 수 없다
    // 추상메서드가 있기 때문에 오버라이딩을 통해 구현시켜야함

}

class Child implements Parent { //상속이지만, 메서드 구현의 개념으로 implements를 사용
    
    public void write() {
        // A = 13; interface의 멤버변수로 final키워드가 암묵적으로 들어가 있어
        // 상수 취급을 받아, 변경 불가능
        System.out.println(A + "슈퍼클래스를 상속받아 구현한 메서드");
    }
}