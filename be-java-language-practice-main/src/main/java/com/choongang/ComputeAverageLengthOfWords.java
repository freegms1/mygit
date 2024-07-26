package com.choongang;

public class ComputeAverageLengthOfWords {
    public int computeAverageLengthOfWords(String word1, String word2) {
        int result;
        //TODO: 두 단어를 입력받아 두 단어의 평균 길이를 할당해야 합니다.
        // 미리 선언된 result 변수에 word1, word2의 평균 길이를 구해서 할당하세요.
        result = (word1.length()+word2.length())/2;

        System.out.println(result);

        // 아래 코드는 수정하지 말아야 합니다.
        return result;
    }
}
