package Java202110.Interface;

public class Interfacce3 {
    public static void main(String[] args) {
        
        HowAnimal ha = new HowAnimal();
        ha.setAnimal(new Rion());
        ha.act1("사냥");

    
        ha.setAnimal(new Tiger());
        ha.act1("휴식");

        ha.setAnimal(new  Hippo());
        ha.act1("수영"); // 새로 추가할 클래스들을 뒤늦게 만들어도
        // 클래스와 파라미터만 다시 만들어주면
        // 전체적으로 통제해주는 클래스가 알아서 해줌.
    }
    
}

interface Animals { // 인터페이스 선언
 
    public void act(String act); // 인터페이스 메서드 선언
    
}

class Rion implements Animals { // 인터페이스를 구현하는 클래스1
 
    public void act(String act) {
        System.out.println("사자 : " + act + "하기"); // 구현된 클래스1 
    }
}

class Tiger implements Animals { // 인터페이스를 구현하는 클래스2

    public void act(String act) {
        System.out.println("호랑이 : " + act  + "하기"); // 구현된 클래스2
    }
}

class HowAnimal  { // 클래스들을 전체적으로 통제할 클래스

    Animals animal;   // 인터페이스 타입으로 변수 선언

    public void setAnimal(Animals animal) { // setter로 인터페이스 타입 변수를 받아옴
        this.animal = animal; // 즉, 구현할 클래스를 지정해주는 과정
   }
    public void act1(String act) {
        animal.act(act); // 구현할 클래스들의 메서드를 참조변수로 호출
                         // 호출만 하고 출력등의 과정은 그 클래스로 이동해서 사용 가능

    }

}

class Hippo implements Animals { // 이후 추가로 구현할 클래스 추가

    public void act(String act) {
        System.out.println("하마 : " + act  + "하기"); 
    }

}