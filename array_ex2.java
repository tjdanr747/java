import java.util.*;

 class array_ex2 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10]; // 길이가 10인 정수형 배열 iArr 선언 및 생성
        int[] iArr2 = new int[10]; // 길이가 10인 정수형 배열 iArr 선언 및 생성
        //int[] iArr3 = new int[]{100, 95, 80, 70, 60}; // 길이가 5인 정수형 배열 iArr 선언 및 생성과 동시에 초기화
        int[] iArr3 = {100, 95, 80, 70, 60}; // 길이가 5인 정수형 배열 iArr 선언 및 생성과 동시에 초기화
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i< iArr1.length; i++){
            iArr1[i] = i + 1; // iArr 배열의 각 요소에 1부터 10까지의 값을 저장
        
        }
        for (int i = 0; i < iArr2.length; i++) {
            iArr2[i] = (int)(Math.random() * 10) + 1; // iArr 배열의 각 요소에 1부터 10까지의 랜덤한 값을 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print(iArr1[i] + ", ");
        }
    System.out.println();
    System.out.println(Arrays.toString(iArr2)); // Arrays.toString() 메서드를 사용하여 배열의 내용을 문자열로 출력
    System.out.println(Arrays.toString(iArr3)); // Arrays.toString() 메서드를 사용하여 배열의 내용을 문자열로 출력
    System.out.println(Arrays.toString(chArr)); // Arrays.toString() 메서드를 사용하여 배열의 내용을 문자열로 출력
    System.out.println(iArr3); // 배열의 이름을 출력하면 배열의 주소값이 출력된다.
    System.out.println(chArr); // char 배열의 이름을 출력하면 배열의 요소들이 문자열로 출력된다.


    }






}
