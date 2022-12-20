package Day2;


class  Practice{
    String name;
    int age;
    String color;
    Practice(){

    }
    Practice(String name){//this() 로 다른 생성자를 호출함
        this(name, 1, "Blue");//마지막 Practice를 호출, 두가지 매개변수는 this() 내부에서 처리해준다.
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
