import java.util.Scanner;
public class Example03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("첫번쨰 숫자를 입력해주세요");
       double left = input.nextDouble();
        input.nextLine();
        System.out.println("연산자를 입력해주세요");
       String operator = input.nextLine();
        System.out.println("두번쨰 숫자를 입력해주세요");
        double right = input.nextDouble();
        input.nextLine();


        double result = 0;

       boolean isTrue = true;

        switch (operator) {
            case "+":
                result = left + right;
                break;

            case "-":
               result = left - right;
                System.out.println("계산 결과는 :" + result);
                break;

            case "*":
               result = left * right;
               System.out.println("계산 결과는 : " + result);
                break;
            case "/":
                result = left / right;
                System.out.println("계산 결과는 : " + result);
            case "%":
                result = left % right;
                System.out.println("계산 결과는 : " + result);
            default:
                isTrue = false;
                break;
        }
        if (isTrue) {
            System.out.println("계산 결과는 : " + result);
        } else {
            System.out.println("잘못된 연산자를 입력했습니다.");
        }
    }
//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("첫번째 숫자를 입력해 주세요.");
//        String leftOperand = sc.nextLine();
//
//
//        System.out.println("연산자를 입력해 주세요.");
//        String operator = sc.nextLine();
//
//        System.out.println("두번째 숫자를 입력해 주세요.");
//        String rightOperand = sc.nextLine();
//
//
//
//
//        if (validate(leftOperand, operator, rightOperand)) {
//            double result = calculate(Double.parseDouble(leftOperand), operator, Double.parseDouble(rightOperand));
//            System.out.println("계산 결과" + result);
//        } else {
//            System.out.println("잘못된 수식이 입력되었습니다.");
//        }
//
//
//    }
//
//    public static boolean validate(String str){
//        String operators = "+-*/%";
//        int operatorCount =0;
//        for(char c : str.toCharArray()){
//            if(operators.indexOf(c) != -1){
//                operatorCount++;
//            }else{
//                return false;
//            }
//        }
//        return operatorCount == 1;
//    }
//    public static double calculate(double left,String op,double right){
//        double result = 0.0;
//
//        switch(op){
//            case "+" :
//                result = left + right;
//                break;
//            case "-" :
//                result = left - right;
//                break;
//            case "*" :
//                result = left * right;
//                break;
//            case "/" :
//                result = left / right;
//                break;
//            case "%" :
//                result = left % right;
//                break;
//        }
//        return result;
//    }

}