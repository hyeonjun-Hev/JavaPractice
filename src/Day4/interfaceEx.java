package Day4;

interface object {
    abstract void things();
}
interface sound {
    abstract void sounds();
}

class robot implements object, sound{
    @Override
    public void things() {
        System.out.println("this is robot");
    }
    @Override
    public void sounds() {
        System.out.println("(robot sound");
    }
}

class Car implements object,sound{
    @Override
    public void things() {
        System.out.println("this is Car");
    }
    @Override
    public void sounds() {
        System.out.println("(Car sound)");
    }
}

public class interfaceEx {
    public static void main(String[] args) {
        Car car = new Car();
        robot r = new robot();
        car.things();
        car.sounds();
        r.things();
        r.sounds();
    }


}
