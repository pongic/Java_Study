package Coplit;

public class electricityBill {
    public static void main(String[] args) {

        double result_99 = 99 * 60.7;
        double result_150 = (100 * 60.7) + (50 * 125.9);
        double result_250 = (100 * 60.7) + (100 * 125.9) + (50 * 187.9);
        double result_301 = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (1 * 280.6);
        double result_450 = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (100 * 280.6) + (50 * 417.7);
        double result_510 = (100 * 60.7) + (100 * 125.9) + (100 * 187.9) + (100 * 280.6) + (100 * 417.7) + (10 * 670.6);


        System.out.println("=========================");
        System.out.println(" 주택용 전기요금(저압) 계산기");
        System.out.println("=========================");
        System.out.println("99kWh의 전기 요금은 " + result_99 + "원 입니다.");
        System.out.println("150kWh의 전기 요금은 " + result_150 + "원 입니다.");
        System.out.println("250kWh의 전기 요금은 " + result_250 + "원 입니다.");
        System.out.println("301kWh의 전기 요금은 " + result_301 + "원 입니다.");
        System.out.println("450kWh의 전기 요금은 " + result_450 + "원 입니다.");
        System.out.println("510kWh의 전기 요금은 " + result_510 + "원 입니다.");


        // 100kWh 이하는 kWh당 60.7원,
        // 100kWh 초과는 125.9원,
        // 200kWh 초과는 187.9원,
        // 300kWh 초과는 280.6원,
        // 400kWh 초과는 417.7원,
        // 500kWh초과는 670.6원
    }
}
