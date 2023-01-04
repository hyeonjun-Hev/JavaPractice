package Day3;


import java.lang.reflect.Method;

class Parents{
    private int a = 1;
    public  int b = 2;
}

class Child extends Parents{
    public int c = 3;
    void Method(){
//        System.out.println(a);
        //a is private. so doesn't display
        System.out.println(b);
        System.out.println(c);
    }
}

public class extendEx {
    public static void main(String[] args) {
        Child child = new Child();
        child.Method();
    }
}
