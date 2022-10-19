class Car2 {
    private String modelName = "소나타";
    private int modelYear = 2016;
    private String color = "blue";


    Car2(String modelName){
        this.modelName = modelName;
    }
    public String getModel() {
        return this.modelYear + "년식 " + this.color + " color " + this.modelName;
    }
}

public class Method03 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("dt");
        System.out.println(myCar.getModel());
    }
}
