public class array_ex1 {
    public static void main(String[] args) {
        int[] score = new int[5]; // 길이가 5인 정수형 배열 score 선언 및 생성
        int k = 1; // 배열에 저장할 값 초기화
        score[0] = 50; 
        score[1] = 60;
        score[k+1] = 70;
        score[3] = 80;
        score[4] = 90; // 배열의 각 요소에 값 저장
        int temp = score[k+2] + score[4]; // score[3]과 score[4]의 합을 temp에 저장 
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]: %d%n", i, score[i]);
        }
        System.out.printf("temp: %d%n", temp);
        System.out.printf("score[%d]: %d%n", 7, score[7]); // score[7]은 배열의 범위를 벗어나므로 오류 발생
    } // main 메서드 종료
}
