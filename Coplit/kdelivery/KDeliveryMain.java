package Coplit.kdelivery;

import java.util.Scanner;
import static java.lang.System.exit;
public class KDeliveryMain {
    private static int SHOP_MAX = 5;
    private static int ORDER_MAX= 5;
    private static int FEEDBACK_MAX = ORDER_MAX;

    /**
     * 배열을 담을 수 있는 객체 생성
     * 사용 범위, 객체 타입, 객체 이름
     */
    private Shop[] shops;
    private Order[] orders;
    private Feedback[] feedbacks;

    // 해당 변수를 제어하는 Idx변수를 정의하고 초기화
    private int feedbackIdx, orderIdx, shopIdx;

    private Scanner s = new Scanner(System.in); // 사용자의 입력을 받는 객체 생성

    /**
     * @KDeliveryMainV1() : 매장 정보, 주문 정보, 리뷰 정보 초기화
     * initValues() 메서드 사용
     * */
    KDeliveryMain() {
        initValues();
    }

    /**
     * @initValues() : 객체에 저장될 수 있는 크기 지정
     * SHOP_MAX, ORDER_MAX, FEEDBACK_MAX = 5
     * */
    private void initValues() {
        shops = new Shop[SHOP_MAX];
        orders = new Order[ORDER_MAX];
        feedbacks = new Feedback[FEEDBACK_MAX];
    }

    /**
     * @close() : 프로그램 종료를 위해 사용되는 메서드
     * 사용자가 종료를 선언하면 동작합니다.
     * main()에서 활용됩니다.
     * */
    void close() {
        System.out.println("[안내] 이용해주셔서 감사합니다.");
        System.exit(0);
    }


    /**
     * selectMainMenu() : 기능을 나열하며, 사용자가 원하는 기능을 정수로 받습니다.
     * */
    int selectMainMenu () {
            System.out.println("[치킨의 민족 프로그램 V1] ");
            System.out.println("-------------------------");
            System.out.println("1) [사장님용] 음식점 등록하기");
            System.out.println("2) [고객님과 사장님용] 음식점 별점 조회하기");
            System.out.println("3) [고객님용] 음식 주문하기");
            System.out.println("4) [고객님용] 별점 등록하기");
            System.out.println("5) 프로그램 종료하기");
            System.out.println("-------------------------");
            System.out.println("[시스템] 무엇을 도와드릴까요? ");
            int num = s.nextInt();
            if (num > 0 && num < 6) {
                return num;
            }
            return selectMainMenu();
    }

    public void selectAddShopMenu() {
        /**
         * @selectAddShopMenu() : 음식점의 정보를 등록합니다.
         * @shops   : 가게 정보를 저장합니다.
         * @shopIdx : 가게 정보의 인덱스
         * */

        /**
         * @Shop.java 의 Shop 클래스를 활용한 객체 생성
         * @public 클래스 : 동일 패키지 및 다른 패키지에서 사용가능
         * @addFood() : Shop.java 의 Shop 클래스의 addFood() 메서드
         * 해당 메서드는 매장명, 음식명, 가격을 입력받아 객체에 저장
         * 값이 저장될 때 마다 shopIdx 값 증가
         */
        System.out.println("[안내] 반갑습니다. 가맹주님!");
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        s.nextLine();
        String shopName = s.nextLine();

        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        String foodName = s.nextLine();

        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        int price = s.nextInt();

        shopIdx = 0;
        for (Shop i : shops) {
            if (i != null) {
                shopIdx +=1;
            } else {
                shops[shopIdx] = new Shop(shopName);
                shops[shopIdx].addFood(foodName,price);
                System.out.printf("[안내]%s에 음식(%s, %d) 추가되었습니다.\n",shopName,foodName,price);
                System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.\n");
                break;
            }
        }

    }

    /**
     * @selectDashboardMenu() : 해당 메서드는 등록된 가게 정보를 출력합니다.
     * Feedback.java 파일의 클래스 및 메서드를 활용합니다.
     * */
    public void selectDashboardMenu() {
        for (Feedback feedback : feedbacks) {
            if (feedback != null) {
                feedback.printInfo();
            }
        }
    }

    /**
     * @selectOrderMenu() : 주문 기능
     * 사용자의 입력을 받아 orders 객체에 저장
     * */
    public void selectOrderMenu() {
        System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
        System.out.println("[안내] 주문자 이름을 알려주세요!");
        s.nextLine();
        String customerName = s.nextLine();
        System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
        String shopName = s.nextLine();
        System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
        String foodName = s.nextLine();

        orderIdx = 0;
        for (Order order : orders) {
            if (order != null) {
                orderIdx +=1;
            } else {
                orders[orderIdx] = new Order(customerName, shopName, foodName);
                System.out.printf("[안내] %s님!\n",customerName);
                System.out.printf("[안내] %s매장에 %s주문이 완료되었습니다.\n",shopName,foodName);
                break;
            }
        }
    }
    /**
     * @selectFeedbackMenu() : 메뉴의 피드백을 입력받는 기능
     * */
    public void selectFeedbackMenu() {
        System.out.println("[안내] 고객님! 별점 등록을 진행합니다.");
        System.out.println("[안내] 주문자 이름은 무엇인가요?");
        s.nextLine();
        String customerName = s.nextLine();

        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        String shopName = s.nextLine();

        System.out.println("[안내] 주문하신 음식 이름은 무엇인가요?");
        String foodName = s.nextLine();

        System.out.println("[안내] 음식맛은 어떠셨나요? (1점 ~ 5점)");
        int grade = s.nextInt();

        feedbackIdx = 0;
        for (Feedback feedback : feedbacks) {
            if (feedback != null) {
                feedbackIdx +=1;
            } else {
              feedbacks[feedbackIdx] = new Feedback(customerName, shopName,foodName,grade);
                System.out.println("[안내] 리뷰 등록이 완료되었습니다.");
                break;
            }
        }

    }

    public static void main(String[] args) {
        KDeliveryMain program = new KDeliveryMain();
        while(true) {
            int num = program.selectMainMenu();
            switch (num) {
                case 1: program.selectAddShopMenu(); break;
                case 2: program.selectDashboardMenu(); break;
                case 3: program.selectOrderMenu(); break;
                case 4: program.selectFeedbackMenu(); break;
                case 5: program.close();
                default: System.out.println("잘못 입력하였습니다."); break;
            }
        }
    }
}
