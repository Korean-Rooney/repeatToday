package Java202110.Keyword.This;

public class This {
    public static void main(String[] args) {
        animals am = new animals("호랑이",2.5,200);
        am.animalInfo();

        am = new animals("사자",2.0);
        am.animalInfo();

        am = new animals();
        am.animalInfo();
        
    }
}

class animals {
    String animal = "원숭이";
    double height = 0.8;
    int weight = 15;
    
    public animals() {
        this("악어",3,300);
    }

    public animals(String animal, double height) {
        this(animal,height,180); // 생성자 this 키워드 사용으로 중복코드를 다른 생성자에서 호출
    }

    public animals(String animal, double height, int weight) { 
        this.animal = animal; // this 키워드 사용으로 멤버변수와 로컬 변수를 구분
        this.height = height;
        this.weight = weight;
        
    }

    public void animalInfo() {
        System.out.println( " 종류 :" + animal + ", 키: " + height + "M, 몸무게: " + weight + "Kg"  );       
    }
}