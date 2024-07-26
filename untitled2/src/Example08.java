import java.util.Arrays;

public class Example08 {
    public static void main(String[] ages){
//        - 10개의 정수 값을 저장할 수 있는 배열을 생성하고, 1부터 10까지의 값을 배열에 저장한 후, 이를 출력하세요.
//
         // 정수를 지정살 수 있는 배열을 생성 > ex)String [] str = new str[] ;
         // 1부터 10까지 넣고 출력한다 > Arrays,toString()
       int[] num = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(num));

    }

}

/*
      int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10}; 0으로 자동으로 초기화,배열 초기화 (0.0)boolean 초기화 >false
       System.out.println(arr[i]);
      위의 코드보단 확장성을 생각하면


      int [] arr = new int[10];

      for(int i=0; i<arr.toString(arr));
            arr[i] = i+1;
      for ( int j : arr){
         System.out.println(j);

 */
