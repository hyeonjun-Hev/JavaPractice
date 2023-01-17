package Day3;

public class switchTest {
    public static void main(String[] args) {
        int i = 1;
        if (i < 5) {
            switch (i) {
                case 2:
                    System.out.println("no");
                    break;
                case 3:
                    System.out.println("3");
                    break;
            }
            if (i==1){
                switch (i){
                    case 1:
                        System.out.println("Done!");
                }
            }
        }
    }
}
