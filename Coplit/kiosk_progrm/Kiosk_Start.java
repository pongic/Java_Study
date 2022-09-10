package Coplit.kiosk_progrm;

public class Kiosk_Start {
    public static void main(String[] args) {
        /**
         * @main() 메서드 동작
         * 프로그램 실행 -> 메뉴 입력 -> 수량 입력 및 가격 계산 -> 가격 출력
         */
        //TODO:
        Kiosk_Program program = new Kiosk_Program();
        program.input_print();
        int number = program.count();
        program.cost(number);
        int result = number * Kiosk_Program.N;
        program.output_print(result);
    }
}
