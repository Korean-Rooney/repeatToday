package Java202110;
class Inheritance { 
    public static void main(String[] args) {
        //서브클래스를 불러오기 위해서 인스턴스를 생성
        // => Child 타입의 참조변수 child 선언 후 Child의 인스턴스 주소 저장
        Child child = new Child(); 
        child.act(); // 슈퍼클래스의 메서드에 접근이 가능하다.
        child.ability(); // 서브클래스의 메서드에 접근이 가능하다.

        System.out.println("===================================");
        child.a = "먹기"; // 슈퍼클래스의 멤버변수에 접근이 가능하다.
        child.act();
        child.ability();

        System.out.println("===================================");
        //child.Parent(); => 생성자에는 접근 불가능, 슈퍼 클래스명과 같기 때문

         
    }
}

class Parent {
    String a = "요리하기"; // Parent 클래스에 멤버변수 선언
    String b = "상속";

    public Parent() { // 생성자는 리턴값은 가지지 않고, 본인 클래스명과 같다.
        System.out.println("나는 슈퍼클래스이다");
    }

    public void act() {
        System.out.println("슈퍼클래스에서 " + a);
    }

}

class Child extends Parent {
    String c = "쿠키"; // Child 클래스의 멤버변수 선언

    public Child() {
        System.out.println("나는 서브클래스이다");
    }

    public void ability() { // 슈퍼클래스의 멤버변수, 선언없이 사용가능
        System.out.println("슈퍼클래스에서" + a +"를 "+ b + 
        "서브클래스에서 " + a);
        System.out.println("내가 잘하는 것은 " + c + a);
    }
}