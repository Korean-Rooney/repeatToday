package Java.Method;

public class Method {
    public static void main(String[] args) {
        methodClass mc = new methodClass(); // 클래스타입 참조변수에 인스턴스 주소를 저장
      
        mc.method1(); // 리턴값, 파라미터 없으므로 호출시 간단한 코드만 작성하면 됨

        System.out.println("===========================");

        mc.method2(10); // 파라미터만 있으므로 메서드의 괄호 안에 파라미터로 전달할 인자들 넣어줘야함

        System.out.println("===========================");
        
        // mc.method3(); // 리턴값만 있으므로 메서드 호출시 값을 받아옴. return 으로 int a = 3을 받아옴. 
        // int result = mc.method3(); // 리턴 값을 int 타입 변수인 result에 저장
        // System.out.println("리턴 받은 값 : " + result); // 저장받은 result 값을 출력하면 문장도 실행됨.
        System.out.println("리턴 받은 값 : " + mc.method3()); // 그렇기 때문에 따로 값을 저장안하고 메서드를 바로 사용하면
                                          // 메서드 출력됨과 동시에 리턴값을 받아와 사용할 수 있음.

        System.out.println("===========================");

        String result = mc.method4("안녕");
        System.out.println("리턴 받은 값 : " + result);
    }
}
class methodClass{
    int a = 3;
    String b = "abc";

    public void method1(){
        System.out.println("리턴값 없고, 파라미터도 없는 메서드");

    }

    public void method2(int num){
        a = num; // int타입의 변수 a에 받아온 파라미터인 num값을 저장
        System.out.println("리턴값 없고, 파라미터는 있는 메서드, a에 저장된 값 :" + a);

    }

    public int method3(){
        System.out.println("리턴값 있고, 파라미터는 없는 메서드");
        
        return a; // int는 class 선언부에 선언되었고 method2에서 값변경이 일어남
    }

    public String method4(String str){
        b = str;
        System.out.println("리턴값 있고, 파라미터도 있는 메서드");

        return b;
    }
}