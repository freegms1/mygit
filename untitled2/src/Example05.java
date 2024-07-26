import java.util.Scanner;

public class Example05 {
    public static void main(String[] args){
//        - 사용자로부터 숫자를 하나 입력받아, 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하여 출력하는 프로그램을 작성하세요.
//
//
        Scanner sc = new Scanner(System.in);
        //정수 num을 받아 양수인지 음수인지 0인지 판단하려면
        //num이 0이면 0
        //num이 0보다 크면 양수
        //num이 0보다 작으면 음수
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("0");
        } else if(num > 0) {
            System.out.println("양수");
        } else  {
            System.out.println("음수");
        }

    }
}
