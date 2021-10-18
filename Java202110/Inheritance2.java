package Java202110;

public class Inheritance2 {
    public static void main(String[] args) {
        Child2 ch = new Child2("축구하기"); 
        ch.go();
        ch.go2();
        ch.go3();

        System.out.println("===============");

        Parent2 p2 = new Parent2("농구하기");
        p2.go();
        p2.go2();
        // p2.go3(); // 슈퍼클래스에서는 서브클래스에 접근 불가

        System.out.println("===============");
        p2 = ch; // 업캐스팅
        p2.go();
        p2.go2();
        // p2.go3(); // 영역의 축소로 공통멤버를 제외한 서브클래스의 멤버는 접근 불가

        System.out.println("===============");
        if(p2 instanceof Child2 ) {
            ch = (Child2)p2; // 다운캐스팅
            ch.go();
            ch.go2(); // 영역의 확장으로 서브클래스의 멤버에 접근 가능
            ch.go3();
        }
    }
  

}

class Parent2 {
    String action;

    public Parent2(String action) {
        this.action = action;
        System.out.println("Parent2의 생성자 호출");
    }
    
    public void go() {
        System.out.println("슈퍼클래스에서 " + action);
    }

    public void go2() {
        System.out.println("오버라이딩 안된 메서드");
    }
}

class Child2 extends Parent2 {

    public Child2(String action) {
        super(action); // 슈퍼클래스의 파라미터 생성자만 정의되어 서브클래스에서 명시해줌.
        System.out.println("Child2의 생성자 호출");

    }

    public void go() {
        System.out.println("서브클래스에서 " + action);

    }
    public void go3() {
        System.out.println("서브클래스의 일반 메서드");
    }
    
}

   