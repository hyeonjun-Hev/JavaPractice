package Day4;

class Parent {
    void display() {
        System.out.println("parents");
    }
}

class Child extends Parent {
    void display(String a) {
        System.out.println("child"+a);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent pa = new Parent(); // 허용
        Child ch = new Child();   // 허용
        Parent pc = new Child();  // 허용
//        Child cp = new Parent();  // 오류 발생. why?
    }
}
