public class StringUtil {
    /*- 다음 기능을 수행하는 메서드를 **`StringUtil`** 클래스 내에 작성하세요:
    - **`reverse`**: 하나의 **`String`**을 매개변수로 받아 그 문자열을 뒤집은 결과를 반환합니다.
    - **`concat`**: 두 개의 **`String`**을 매개변수로 받아 이를 연결한 결과를 반환합니다.
    - **`contains`**: 하나의 **`String`**과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환합니다.
        */
    public static String reverse(String str){
        String reverseString = "";
        for (int i = str.length()- 1 ; i >= 0; i--){
            reverseString = reverseString + str.charAt(i);

        }
        return reverseString;

    }

    public static String concat(String str1,String str2,String str3){
        return str1 + str2 + str3;// 문자열 + 가능
    }

    public static boolean contain(String str1,String str2){
//        for(int i = 0 ; i < str.length();i++){
//            if(str.charAt(i) == c){
//                return true;
//            }
//        }
          for(int i = 0; i <= str2.length() - str1.length();i++){
              Boolean correntStringisEqual = true;
              for(int j = i; j < i + str1.length();i++){
                  if(str2.charAt(j) != str1.charAt(j - i)){
                      correntStringisEqual = false;
                  }
                  if(correntStringisEqual = false ) return true;
              }
              return false;
          }
        return false;
    }

}
