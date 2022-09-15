package Coplit;
import java.util.Scanner;

/**
 * 해당 프로그램은 예측에 필요한 a, b를 사용자가 입력하도록 합니다.
 * 해당 프로그램은 하나의 값이 아닌 다수의 값을 입력받고 다수의 예측을 수행하도록 합니다.
 * */
public class Ai_V2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;  // 예측에 필요한 요소
        /*
         * 인공지능 예측에 필요한 변수를 정의합니다.
         * a,b    : 예측에 필요한 요소
         * x_list : 예측에 필요한 광고비 배열
         * y      : 예측한 결과값(웹 페이지 방문자 수)
         * y_list :
         */
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("==============================");
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        a = input.nextInt();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        b = input.nextInt();


        // 이전 버전과 달리 다수의 '광고비'를 '배열'로 정의합니다.
        // 반복문을 활용하여 광고비 배열을 출력합니다.

        // 한 줄 띄기 및 예측 결과 안내 문구 출력

        // 반복문을 활용해 다수의 광고비(x_list)를 호출하여 방문자 수 예측값을 연산합니다.

    }
}