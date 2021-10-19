package Java202110.Final;

public class Final2 {
    public static void main(String[] args) {
        PERSON ps = new PERSON(); // 다른 클래스에서 has-a 관계로는 사용 가능
        ps.run();
    }
    
    
}

final class PERSON { // final 제한자가 사용된 클래스
    // 클래스를 변경할 수 없다
    // 즉, 상속할 수 없다.
    // final 메서드보다 더 광범위한 제한을 둘 때 사용
    int apple ;
    final int BOO; // blank final 상수

    public PERSON() {
        BOO = 3;
    }
    
    public void run() {
        System.out.println("달리기");
    }

}

// class army extends PERSON{
//     // The type army cannot subclass the final class Person
//     // final 클래스를 상속 할 수 없음. 에러 발생
// }