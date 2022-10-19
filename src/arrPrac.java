
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.Arrays;
public class arrPrac {

    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[10];
        int[][] arr2 = {
                {10, 20},
                {10, 20, 30, 40},
                {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}
        };

        int[][] b = {{1,2,3,5,6},{0,2},{123,5672,111,01}};
        System.out.println(Arrays.deepToString(b));
        System.out.println(Arrays.deepToString(arr2));//for 문을 쓰지 않고 출력을 가능하게 해주는 친구
        //Arrays를 import시켜야 사용할 수 있다.
//        System.out.println("# Output 1");
//        for (int i = 0; i < arr2.length; i++) {
//            for (int k = 0; k < arr2[i].length; k++) {
//                System.out.println("arr[" + i + "][" + k + "] = " + arr2[i][k]);
//            }
//        }
    }

}
