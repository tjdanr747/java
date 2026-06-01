import java.util.Scanner;

public class Main {public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요.>");
    try (Scanner scanner = new Scanner(System.in)) {
        int month = scanner.nextInt();// 입력받은 월을 변수 month에 저장

        switch (month) {
            case 3, 4, 5 -> System.out.println("현재 계절은 봄입니다.");
            case 6, 7, 8 -> System.out.println("현재 계절은 여름입니다.");
            case 9, 10, 11 -> System.out.println("현재 계절은 가을입니다.");
            case 12, 1, 2 -> System.out.println("현재 계절은 겨울입니다.");
            default -> System.out.println("잘못된 입력입니다. 월은 1부터 12 사이여야 합니다.");
        }
    } // 입력받은 월을 변수 month에 저장
    }
    
}
