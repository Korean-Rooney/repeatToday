package Java202110.Interface;

public class Interface2 {
    public static void main(String[] args) {
        DDD A = new DDD(); // 인스턴스 생성 후 각 메서드 호출.
        A.Run();
        A.stop();
    }
}

interface AAA {

    public static void Run() {}

}

interface BBB {

    public static void Stop() {}
}

class CCC {

    public void walk() {

    }
}

class DDD implements AAA, BBB { // 클래스는 인터페이스를 동시 상속 받을 수 있다.
    public void Run() {
        System.out.println("AAA 인터페이스로부터 구현한 Run() 메서드");
    }

    public void stop() {
        System.out.println("BBB 인터페이스로부터 구현한 Stop() 메서드");
    }
}

// interface EEE implement AAA {} // 인터페이스는 구현을 할 수 없어서 extends로 상속해야함
interface EEE extends AAA{}

// class FFF implements  AAA, CCC{} // 인터페이스와 클래스를 동시에 상속 받을 수 없다.
interface FFF extends AAA, BBB{} // 인터페이스는 인터페이스를 동시 상속 받을 수 있다.