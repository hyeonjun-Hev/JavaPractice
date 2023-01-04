package Day3;


import Day3.test.protectedTest;

public class package2 extends protectedTest {

    
    public static void main(String[] args) {
        package1 pack = new package1();
        System.out.println(pack.name);//default 접근 제어자
        System.out.println(pack.name2);
        protectedTest protectedTest = new protectedTest();
        System.out.println(protectedTest.name);

    }
}

