package Day3;


import java.lang.reflect.Method;

class Parents{
//    private int a = 1;
//    public  int b = 2;

    int i;
}

class Child extends Parents{
    public int c = 3;
    Child(){
        super(); //기본 생성자까지 호출함
        // 기본 생성자없이 생성자가 있다면 이 부분은 버그를 일으킨다.
        // 따라서 부모 클래스에서 생성자를 선언했을시에는 기본 생성자까지 생성을 해놔야 한다.
        // 자세한 설명은 extendEx2 에서 이어진다.
        c = 30;
    }

    void Method(){
//        System.out.println(a);
        //a is private. so doesn't display
//        System.out.println(b);
        System.out.println(c);
    }
}

public class extendEx {
    public static void main(String[] args) {
        Child child = new Child();
        child.Method();
    }
}
