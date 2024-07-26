import java.util.Arrays;
import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
//        - 사용자로부터 5명의 학생의 점수를 입력받아 배열에 저장한 다음, 평균 점수를 계산하여 출력하세요.
//
        Scanner sc= new Scanner(System.in);

        double [] score = new double[5]; // 5명의 점수를 입력받을 배열 생성
        double sum = 0.0;
        for(int i= 0; i < score.length; i++){                // i 는 score.length( 배열의 크기)만큼 더하는 반복문 생성
            System.out.println("학생들의 성적을 입력하십시오.");
            score[i]=sc.nextInt();                            // 성적 5개를 입력받고
            sum=sum+score[i];                                 // 성적을 더합니다.
        }
        System.out.println("평균성적은 "+(sum/score.length));   // 성적을 더한거를 크기만큼 나눠서 출력.

    }
}
/*
        int [] arr = new int[5];
       //1. 점수 입력
        Scanner sc = new Scanner(System.in);
       //2. 배열에 할당
        for(int i=0;i < arr.length; i++){
            arr[i] = sc.nestInt():
            sc.nestline();
            }
         ex)for(int i =0; i<arr.length;i++){
            sum += arr[i];
            }
            변경가능
            for(int j : arr){
            sum += j;
            }
       //3. 평균값 출력
             int sum = 0;
             for(int number: arr){
             sum += number;
       }

              System.out.println(sum / arr.length);
 */