import java.util.Scanner;
public class Example07 {
//     - 사용자로부터 숫자 n을 입력받아, 1부터 n까지의 합을 계산하여 출력하는 프로그램을 작성하세요.
    public static void main(String[] args){
        //숫자 number을 입력받아 1~n까지 숫자의 합을 계산하는 프로그램은
        // 정수 number을 입력받은 숫자만큼
        // 반복문으로 더하는 식을 만들면된다.
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int result= 0;
     for(int i = 1; i <= number; i++){

         result = result + i ;

    }
        System.out.println(result);

 }
}
