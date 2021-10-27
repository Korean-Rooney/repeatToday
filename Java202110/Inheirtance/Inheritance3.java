package Java.Inheirtance;

public class Inheritance3 {
    public static void main(String[] args) {
        
        // 슈퍼클래스의 메서드를 상속받아 오버라이딩 할 경우
        // 코드의 통일성 향상됨
        Football fb = new Football();
        fb.sports();
        
        Basketball bk = new Basketball();
        bk.sports();

        Baseball bs = new Baseball();
        bs.sports();

        System.out.println("=================");
       
        // 코드의 통일성을 더욱 향상시키기 위해 업캐스팅 활용

        Play play = new Play(); // Play 클래스의 인스턴스 생성
        play = fb;
        play.sports();

        play = bk;
        play.sports();

        play = bs;
        play.sports();

        System.out.println("=================");
        polymorphism(fb);
        polymorphism(bk);
        polymorphism(bs);
        // 최종적으로 업캐스팅이 진행되어 오버라이딩 된 메서드가 출력됨.
        
        } 

        public static void polymorphism(Play play) {
           // Static 값을 준 이유는 다른 메서드에서 호출 하여 사용하기 위함
            play.sports();
            // Play타입 참조변수인 "로컬변수 play"
            // 로컬변수 play에 외부에서 받아온 값이 저장됨
            // Play play = xxx; 코드가 됨.

            // play 값에 각각 fb, bk, bs 값을 받으면
            // Play play = fb(= new Football()) 
            // Play play = bk(= new basketball()) 
            // Play play = bs(= new baseball()) 
            // 최종적으로 업캐스팅이 진행됨.
    }       
   

   
}

class Play {

    public Play() { // 슈퍼클래스의 생성자 생성
        
    }

    public void sports() {
        System.out.println("운동 하기");
    }

}

class Football extends Play {

    public void sports() {
        System.out.println("축구 하기"); //슈퍼클래스의 메서드 오버라이딩
    }

}

class Baseball extends Play {

    public void sports() {
        System.out.println("야구 하기"); //슈퍼클래스의 메서드 오버라이딩
    }

}

class Basketball extends Play {

    public void sports() {
        System.out.println("농구 하기"); //슈퍼클래스의 메서드 오버라이딩
    }

}