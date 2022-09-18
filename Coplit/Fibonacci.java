package Coplit;
import java.util.Scanner;

public class Fibonacci {
    static Scanner input = new Scanner(System.in);
    static int[] result;
    static final int START_NUM = 1;
    static int getUserInput() {
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 :");
        int num = input.nextInt();
        return num;
    }

    static void fibonacci(int num) {
        result = new int[num];
        result[0] = START_NUM;
        result[1] = START_NUM;

        for (int i = 2; i < num; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
    }

    static void print() {
        System.out.println("[피보나치 수열 출력]");
        for (int i = 0; i < result.length; i ++) {
            System.out.println(result[i]);
        }
        System.out.println("[안내]프로그램을 종료합니다.");
    }

    public static void main(String[] args){
        int num = getUserInput();
        fibonacci(num);
        print();
        // 1단계. 프로그램 시작을 알리는 출력문 선언

        // 사용자의 입력값 받기.

        // 2단계. 피보나치 수열의 점화식 코드 작성
        // 피보나치 수열의 첫 번째와 두 번째 값을 변수로 정의합니다.

        // 피보니치 수열이 저장될 배열 객체 선언

        // 피보나치 수열의 첫 번째, 두 번째 값 할당

        // 반복문을 통한 피보나치 수열 점화식 작성
        // 해당 점화식은 첫 번째와 두 번째는 구할 필요 없기에 이를 고려한 반복문의 조건식을 작성합니다.
        // 피보나치 수열의 점화식은 n+2번 째 부터 구현.
        // 피보나치 수열의 n+2번 째 값은 (n + n+1)를 통해 구할 수 있습니다.

        // 3단계.
        // 결과 출력을 위한 안내 문구 출력 입니다.

        // 피보나치 수열은 fibonacci 배열에 들어가 있기에 이를 반복문을 통해 호출
    }
}