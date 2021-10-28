package Java202110.Keyword.Super;

public class Super {
    public static void main(String[] args) {
        
        Child ch = new Child(); //Child 클래스타입의 참조변수 선언, 인스턴스 생성 및 저장
        // 서브클래스의 인스턴스가 생성되기전 슈퍼클래스의 자동적으로 먼저 생성된다.
        ch.info("사과", "낙타");

        System.out.println("===========================");
        ch.info(); 


        System.out.println("===========================");

    }    
}

class Parent {
    String favoriteAnimal = "호랑이";
    String favoriteFood = "사탕";

    public void info() {
        this.info("메론","참치");
        System.out.println("나는 슈퍼클래스 메서드");
    }
        
    public void info(String favoriteFood, String favoriteAnimal) {
       this.favoriteAnimal = favoriteAnimal;
       this.favoriteFood = favoriteFood;
            System.out.println("나는 슈퍼클래스 파라미터 메서드");
        }


}

class Child extends Parent {
   
    public void info() {
        this.info("파인애플","치타"); // => 파라미터 메서드를 받아와 값을 입력하고 파라미터 메서드를 수행 하는 this 레퍼런스

        System.out.println("가장 좋아하는 음식은 " + favoriteFood + "이고, 가장 좋아하는 동물은 " + favoriteAnimal + "입니다.");
        // => 기본 멤버로 저장된 값들이 출력 되는 값.
    }

    public void info(String favoriteFood, String favoriteAnimal) {
        
        System.out.println("가장 좋아하는 음식은 " + favoriteFood + "이고, 가장 좋아하는 동물은 " + favoriteAnimal + "입니다.");
    }


}