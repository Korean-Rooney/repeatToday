package Java202110.Interface;

public class Interfacce3 {
    public static void main(String[] args) {
        
        HowAnimal ha = new HowAnimal();
        ha.setAnimal(new Rion());
        ha.act1("사냥");

    
        ha.setAnimal(new Tiger());
        ha.act1("휴식");
    }
    
}

interface Animals {
 
    public void act(String act);
    
}

class Rion implements Animals {

    public void act(String act) {
        System.out.println("사자 : " + act + "하기");
    }
}

class Tiger implements Animals {

    public void act(String act) {
        System.out.println("호랑이 : " + act  + "하기");
    }
}

class HowAnimal  {

    Animals animal;   // 인터페이스 타입으로 변수 선언

    public void setAnimal(Animals animal) {
        this.animal = animal;
   }
    public void act1(String act) {
        animal.act(act);
    }

}