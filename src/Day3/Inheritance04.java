package Day3;

class Parent2 {
    int a;
    Parent2() { a = 10; }
    Parent2(int n) { a = n; }
}
 
class Child2 extends Parent2 {
    int b;
    Child2() {
//      super(40);
        // 12번째 라인이 주석처리 됨에 따라, super();가 자동으로 삽입된다.
        // 따라서 부모 클래스의 기본 생성자에 따라 a는 10으로 초기화되고, 10이 출력된다.
        // 12번 라인이 주석이 해제될 경우, a는 40으로 초기화되고, 40이 출력된다.
        b = 20;
    }
    void display() {
        System.out.println(a);
        System.out.println(b);
    }
}
 
public class Inheritance04 {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.display();
    }
}