package Day2;


class  Practice{
    String name;
    int age;
    String color;
    Practice(){

    }
    Practice(String name){//this() 로 다른 생성자를 호출함
        this(name, 1, "Blue");//마지막 Practice를 호출, 두가지 매개변수는 this() 내부에서 처리해준다.
//        다른 생성자를 호출할때 가장 중요한 부분은 생성자의 첫번째 줄에서만 가능하다는것을 생각하자.
//        this는 인스턴스 메소드만 사용할수 있고, 클래스 메소드에서는 사용할 수 없다. (static 붙으면 사용이 불가능 하다는 뜻_ 사실 당연한 말임)
    }
    Practice(String name, int age){
        this.name =name;
        this.age =age;
    }
    Practice(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String getText(){
        return name +" name "+age+" age "+color;
    }
}
public class constructorPrac {
    public static void main(String[] args) {
        Practice p = new Practice();
        Practice p2 = new Practice("ham");
        Practice p3 = new Practice("ham", 2);
        Practice p4 = new Practice("hame", 3, "Red");
        //생성자의 종류는 전달하는 매개변수에 따라 결정하여 저장된다.
        System.out.println(p.getText());
        System.out.println(p2.getText());
        System.out.println(p3.getText());
        System.out.println(p4.getText());
    }

}
