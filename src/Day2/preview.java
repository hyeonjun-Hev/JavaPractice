package Day2;

import java.util.Arrays;


class Pre{

    //필드 변수 선언
    private String name;
    private int age;
    private String Color;

    //기본 생성자
    public Pre(){
        name = "ham";
        age = 29;
        Color = "Red";
    }//필드변수 초기화

    public Pre(String name, int age, String Color){
        this.name = name;
        this.age = age;
        this.Color = Color;
    }
    public String getName(){//메소드
        return name+" Name "+age+" ages "+Color;
    }
}
public class preview {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7};
        int newLen = 10;
        int[] arr2 = new int[newLen]; //0으로 자동 초기화

        //arraycopy (src, srcPos, dest, destPos, length)
        /*
        * src : 복사하려는 소스
        * srcPos : 원본소스에서 어느부분부터 읽어올지 위치를 정함 ( 처음부터 할거면 0 )
        * dest : 복사할 소스
        * destPos : 복사본 시작지점
        * length : 원본에서 복사본으로 데이터를 읽어서 쓸 데이터의 길이( 원본 > 복사본으로 얼만큼 읽어올거?)
        * */
        System.arraycopy(arr1, 1, arr2,2,2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr1,3);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = arr1.clone();
        System.out.println(Arrays.toString(arr4));


        // class practice
        Pre pre1 = new Pre();//default 생성자
        Pre pre = new Pre("hyeon", 24, "green");//매개변수 생성자
        System.out.println(pre1.getName());
        System.out.println(pre.getName());
    }
}
