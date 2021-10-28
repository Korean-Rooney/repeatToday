package Java202110.Keyword.Static;

import Java202110.Keyword.This.This;

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


        System.out.println("========================");
        //ClassB 타입의 변수 선언 및 인스턴스 생성, 저장
        ClassB b1 = new ClassB();
        ClassB b2 = new ClassB();

        b1.dx = 2; b2. dx = 3;
        System.out.println("b1.dx = " + b1.dx +",  b2.dx = "+ b2.dx);
        // 인스턴스 변수는 각각의 주소값에 저장이 가능하다.

        ClassB.ox = 3; ClassB.ox =6; 
        b1.ox = 4; b2.ox = 5; // static 변수에 접근하려면 이 코드도 되긴함.
        // 그러나 static 변수는 모든 인스턴스에서 하나의 메모리 공간을 공유하기 때문에
        // 참조변수가 같은 인스턴스 공간을 가리키고 있음.
        System.out.println("b1.dx = " + b1.ox +",  b2.dx = "+ b2.ox);



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
    
    public static void ClassBMethod(String ox){
        //this.ox // this, super도 인스턴스 주소를 저장하는 참조변수이므로
        //static 메서드가 로딩되는  시점에는 존재하지 않는다.
         System.out.println(ox + ". static 메서드");
    }

    public static void ClassBMethod2(){
        System.out.println(ox + ". static 메서드2");
    
}

}