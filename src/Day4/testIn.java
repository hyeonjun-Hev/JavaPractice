package Day4;

class People{
    void printInfo(){
        System.out.println("People");
    }
}

class Man extends People{
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("and i am man");
    }
    void printLn(){
        System.out.println("test message");
    }
}
class Woman extends People{
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("and i am wowan");
    }
}



public class testIn {
    static void func(People people) {
        people.printInfo();
    }
    public static void main(String[] args) {
        People people = new Man();
        Man man = new Man();
        people.printInfo();
        ((Man)people).printLn();//casting
        System.out.println();
        func(man);

        people = new Woman();
        people.printInfo();

    }
}

