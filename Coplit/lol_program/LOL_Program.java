package Coplit.lol_program;

public class LOL_Program {
    public static void main(String[] args) {
        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");

        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
        LoL_char me = new LoL_char();
        String[] meChar = me.user_create();
        System.out.println("");

        me.user_print(meChar);
        LoL_char you = new LoL_char();
        String[] youChar = you.user_create();
        System.out.println("");

        you.user_print(youChar);

        int[] myCharInt = me.user_info_int(meChar);
        int[] youCharInt = you.user_info_int(youChar);
        me.attack(myCharInt, youCharInt);

    }
}
