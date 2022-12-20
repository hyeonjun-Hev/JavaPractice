package Day1;

import java.util.Arrays;

public class enhancedFor {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        for(int e : arr){//for문의 다른 사용 방법 제시. 같은 자료형으로 선언해주면 된다.
            System.out.println(e);
        }
        int[][] test = new int[][]{
                {1,2},
                {3,4,5},
                {6,7,8,9},
                {10,11,12,13,14}
        };
        for (int[] a : test){//다차원 배열인 경우에는 배열 처리를 해줘야 한다.
            System.out.println(Arrays.toString(a)); //toString 형태가 아니라면 주소값이 반환되니 조심하자
        }

        String[] arr2 = new String[]{"String", "String2", "String3"};//String 배열도 가능하다.
        for (String i : arr2){
            System.out.println(i);
        }

        System.out.println(arr2 instanceof String[]);
    }
}
