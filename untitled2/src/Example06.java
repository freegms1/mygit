public class Example06 {
    public static void main(String[] args){
//        - 1부터 100까지의 정수 중에서 짝수만 출력하는 프로그램을 작성하세요.
        //1부터 100까지의 정수중에서 짝수를 구하는 방법은
        //숫자를 2로 나눌떄 나머지가 0일떄 이므로
        // 반복문을 통해 100까지 반복시키고
        // 조건식을 통해 2를 나눴을떄 0으로 나누어 떨어지는걸
        // 출력하면 됩니다.
        for(int i = 2; i <= 100; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
