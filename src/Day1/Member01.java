package Day1;

class Field {
    static int classVar = 10;
    int instanceVar = 20;
}

class changeValue {
    public int changeV(int a){
        a=20;
        return a;
    }

}


public class Member01 {
    public static void main(String[] args) {
        int var = 30;
        System.out.println(var+"\n");


        Field myF1 = new Field();
        Field myF2 = new Field();

        System.out.println(Field.classVar);
        System.out.println(myF1.classVar);//클래스 변수는 인스턴스에서도 같은 값으로 사용된다
        System.out.println(myF2.classVar+"\n");

        myF1.classVar =100;

        System.out.println(Field.classVar);
        System.out.println(myF1.classVar);//마찬가지로 같은 값으로 사용되기 때문에, 인스턴스에서 호출해도 100이 출력됨
        System.out.println(myF2.classVar+"\n");
        //클래스 변수는 클래스가 메모리에 올라갈때 1회 생성된다

        System.out.println(myF1.instanceVar);//인스턴스 변수의 경우에는 각각의 인스턴스마다 독립적으로 사용됨
        System.out.println(myF2.instanceVar);

        myF1.instanceVar=200;//F1의 값을 바꾼 모습, F2의 값은 변화하지 않는다

        System.out.println(myF1.instanceVar);//200
        System.out.println(myF2.instanceVar);//20
        //인스턴스 생성시 변수는 메모리에 올라간다.

    }
}
