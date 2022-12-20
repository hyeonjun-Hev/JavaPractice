package Day1;

class Coffee{
    private int price;
    private String menu;
    private int shot;

    Coffee(int price, String menu, int shot){
        this.price = price;
        this.menu = menu;
        this.shot = shot;
    }
    public String order(){
        return menu + "커피 "+shot+"샷 "+price+"원";
    }
}


public class Practice01 {
    public static void main(String[] args) {
        Coffee Co = new Coffee(4500, "Americano", 2);
        System.out.println(Co.order());

    }
}
