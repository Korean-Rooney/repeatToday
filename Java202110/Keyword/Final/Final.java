package Java.Keyword.Final;

public class Final {
    public static void main(String[] args) {
        SuperClass sp = new SuperClass();
        // sp.BLUE = 10; // final 변수로 값 변경 불가능
        sp.SUPER_CLASS_METHOD();
    }
}
class SuperClass {
    int a; // 일반 멤버변수 선언 가능
    final int BLUE = 0;
    final int COLD_A; // 파이널 제한자가 들어간 필드는 값을 변경할 수 없음. (상수 취급)
    // 선언부에서 값을 저장하거나 생성자를 통해 값 저장만 가능
    // 파이널 제한자로 선언된 변수는 대문자와 구별(상수 취급)
    // 단어 사이의 구분은 언더스코어 기호 사용
    
    public SuperClass() {
        // BLUE = 1; // 파이널 제한자로 인하여 값 변경 불가
        COLD_A = 10; // Class 선언부에서 값을 지정 안하면 blank final 상수로 취급,
        // 생성자에서 값을 무조건 저장해줘야함.
    }

    public final void SUPER_CLASS_METHOD() {
        // 파이널 제한자로 메서드 변경 불가.
        // 즉, 오버라이딩 할 수 없다.
        System.out.println("final 제한자 사용된 SuperClass 메서드");
    } 

    public final void SUPER_CLASS_METHOD(int a) {
        // 파이널 제한자 붙은 메서드로 오버로딩은 가능.
        System.out.println("final 제한자 사용된 SuperClass 메서드의 오버로딩");
    }
}

class ChildClass extends SuperClass {
    int b;

    // public void SUPER_CLASS_METHOD() {
    //     // Cannot override the final method from SuperClass
    //     // 오버라이딩 불가 문구뜨면서 에러 발생.
    // }

}