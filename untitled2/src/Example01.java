import java.util.Scanner;

public class Example01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        String name = sc.nextLine();

        if(isDigit(name)){
            System.out.println("이름에 숫자가 포함되어 있습니다.");
            return;
        }
        String age = sc.nextLine();
        if(!isDigit(age)){
            System.out.println("나이에 문자가 포함되어 있습니다.");
            return;
       }
//            if(isDigit(age)) -> if(isDigit(age)==true)
//            if(!isDigit(age)) -> if(isDigit(age)==true)


        System.out.printf("사용자의 이름은 %s 나이는 %d",name,age);



    }

    public static boolean isDigit(String str){
        String digit = "0123456789";
        for(int i = 0; i< str.length();i++){
            if(digit.indexOf(str.charAt(i)) == -1){

                return false;
            }
        }
        return true;

    }
}