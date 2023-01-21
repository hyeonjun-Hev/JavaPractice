package Day3;

public class switchTest {
    //자바 14에서 추가된 내용
    // break가 필요없어서 코드 진행할때 버그를 낮출 수 있을것으로 예상됨
    // 반환값이 생겨서 변수에 바로 담을 수 있음
    // yield로 받아 활용 가능함.
    // ajaxAction 리팩토링 예정.
    public static void main(String[] args) {
        // i값을 이렇게 준 이유는 테스트 해볼 부분이 있어서 작성
        // case가 모든 인자를 커버하지 못하는 경우 default 연산자가 필요하다.
        int i = 1;
        if (i < 5) {
            switch (i) {
                case 2 -> System.out.println("no");
                case 3 -> System.out.println("3");
            }
            if (i==1){
                switch (i){
                    case 1 -> System.out.println("Done!");

                }
            }
        }
    }
}
