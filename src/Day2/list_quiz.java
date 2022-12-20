package Day2;

import java.util.ArrayList;
import java.util.List;

public class list_quiz {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        try {
//            for (int i = 0; i < 5; i++) {
//                list.remove(i);
//            }
            int i = 0;
            while (i<5){
                list.remove(0);
                i++;
            }
        } catch (RuntimeException e) {
            list.stream().forEach(v -> System.out.println(v));
        }
    }
}
