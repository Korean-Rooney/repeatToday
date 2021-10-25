package Java202110.Keyword.Static;

public class Static {
    public static void main(String[] args) {
        // CLassA.ClassAMethod(); // 클래스명으로 접근 불가 => static 멤버가 아니기 떄문이다.
        ClassB.ClassBMethod(); // 클래스명으로 접근 가능 => static 멤버이다.
        ClassB.ox = 3; // ClassB의 필드인 ox도 static멤버이므로 접근가능
        // ClassB.dx = 4; // ClassB의 필드인 dx는 인스턴스 멤버이므로 접근 불가능
    
        ClassA a = new ClassA();
        a.ClassAMethod(); // static멤버가 아닌 인스턴스 멤버들은 인스턴스 생성후에 접근 해야함.

        ClassB b = new ClassB();
        b.dx = 4; //인스턴스 멤버이므로 접근 가능
        b.ClassBMethod(); // static멤버도 인스턴스 생성 가능
        ClassB.ClassBMethod2(); // staic 키워드로 staitc 변수들로 하여금
        // 메모리에 클래스가 로딩될 때 같이 로딩되게 끔 함.
        // 그러므로 메모리에 로딩이 되는 순서의 차이지
        // 코드 풀어나가는 순서가 바뀌지는 않는다.
        // 그러나, 인스턴스 멤버를 인스턴스가 메모리에 로딩되기 전 단계에 
        // 코드에서 명시되면 컴파일 오류 발생함. 
    }



}

class ClassA{ // static 메서드가 아님

    public void ClassAMethod(){
        System.out.println("static 메서드가 아님");
    }

}

class ClassB{ // , static 메서드    
    static int ox = 1;
    int dx = 2;
    public static void ClassBMethod(){
        System.out.println(ox + ". static 메서드");

    }
    public static void ClassBMethod2(){
        System.out.println(ox + ". static 메서드2");
    
}

}