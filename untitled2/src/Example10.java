public class Example10 {
    public static void main(String[] args) {

//        - 주어진 정수 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요.

        int array[] = {4, 3, 2, 1, 0, -1, -2, -3, -4};

        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }


        }
        System.out.println("최대값:" + max);
        System.out.println("최소값:" + min);
    }
}
/*
         public static void main(Sting[] args){

         }

         public static void fineMaxNumber(int[] arr){
             int max = arr[0];
             int min = arr[0];
             //int max = Integer.MIN_VALUE;
             //int min = Integer.MAX_VALUE;

             for(int i = 0 ; i < arr.length; i++){
               if(max < arr[i]{
                  max = arr[i];
             }
                max = max < j ? j : max;
                max = Math.max(max,j);
                if(min > arr[i]){
                  min = arr[i];
              }
         }
 */