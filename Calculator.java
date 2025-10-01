import java.util.Scanner;

public class Calculator {
    //덧셈 메소드 선언

    public static int add(int first, int second) {
        return first + second;
    }

    //뺄셈 메소드 선언
    public static int subtract(int first, int second) {
        return first - second;
    }

    //곱셈 메소드 선언
    public static int multiply(int first, int second) {
        return first * second;
    }

    //나눗셈 메소드 선언 (정수 나눗셈)
    public static int divide(int first, int second) {
        if (second == 0) {
            throw new IllegalArgumentException("0으로는 나눌 수 없습니다");
        }
        return first / second;
    }

    public static void main(String[] args) {
        System.out.println("계산기를 수행합니다");
        //덧셈 메소드 호출
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 두 정수 입력 받기
        // 첫번째 숫자를 입력하세요 출력
        System.out.println("첫번째 숫자를 입력하세요");
        int first = scanner.nextInt();

        // 두번째 숫자를 입력하세요 출력
        System.out.println("두번째 숫자를 입력하세요");

        int second = scanner.nextInt();
        int result = add(first, second);
        System.out.println(result);
        //뺄셈 메소드 호출

        //곱셈 메소드 호출

        //나눗셈 메소드 호출

        scanner.close();
        
    }
}

