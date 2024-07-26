import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = input.nextInt();

        int[] numberArr = new int[3];

        for(int i= 0; i<3;i++){
            numberArr[i] = input.nextInt();
        }

        int maxNumber = numberArr[0];
        int minNumber = numberArr[0];


        for(int i=1;i <= numberArr.length-1;i++){

            maxNumber = Math.max(maxNumber, numberArr[i]);
            minNumber = Math.min(minNumber, numberArr[i]);
            //maxNumber = Math.max(1,7);
            //maxnumber = 7;

        }

        System.out.println(maxNumber+""+minNumber);



//        int max_number;
//        if(num1 > num2){
//            max_number= num1
//        }


//        if(num1<num2&&num2<num3){
//        System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d",num1,num3);
//    }else if(num1<num2&&num2>num3&&num1<num3) {
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num1, num2);
//        } else if(num1<num2&&num2>num3&&num1>num3){
//                System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d",num3,num2);
//            }else if(num1>num2&&num2>num3) {
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num3, num1);
//        }else if(num1==num2&&num2<num3) {
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num1, num3);
//        }else if(num1==num2&&num2>num3){
//                System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num3, num1);
//        }else if(num1>num2&&num2==num3) {
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num3, num1);
//        }else if(num1<num2&&num2==num3){
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num1, num3);
//        }else if(num1==num3&&num2<num3){
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num1, num3);
//        }else if(num1==num3&&num2>num3){
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num3, num2);
//        }else if((num1==num2)&&(num2==num3)){
//            System.out.printf("가장 작은 수 :%d 가장 큰 수 :%d", num1, num3);
//
//        }


     }
}





