package Day2;

import java.lang.reflect.Array;
import java.util.Arrays;

class Arr{
    int[][] test = {
            {1,2},
            {3,4,5},
            {6,7,8,9}
    };
    int[] test2 ={1,2,3,4};
    int[][] arr(){
        return test;
    }
}

class nameReturn{
    String name;
    int age;
    nameReturn(){
    }
    nameReturn(String name){
        this(name, 1);
    }
    nameReturn(String name, int i){
        this.name = name;
        this.age = i;
    }
    String nameAge(){
        return name+" name "+age+" age ";
    }
}
public class Day2_remind {
    public static void main(String[] args) {
        Arr a = new Arr();
//        System.out.println(Arrays.toString(a.test2));
//        System.out.println(Arrays.deepToString(a.test));//deeptoString은 다차원 , toString은 1차원 배열을 의미함
//        System.out.println(Arrays.deepToString(a.arr()));
        int[] arr1 = a.test2.clone();
//        System.out.println(Arrays.toString(arr1));
        int[][] arr2 = a.test.clone();
//        System.out.println(Arrays.deepToString(arr2));
        int[][] arr3 = Arrays.copyOf(a.test,1);
        System.out.println(Arrays.deepToString(arr3));
        // Array end

        nameReturn nameReturn = new nameReturn("ham", 2);
        System.out.println(nameReturn.nameAge());
    }

}
