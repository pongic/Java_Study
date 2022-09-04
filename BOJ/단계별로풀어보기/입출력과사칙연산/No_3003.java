package BOJ.단계별로풀어보기.입출력과사칙연산;
import java.util.Scanner;

public class No_3003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int king = input.nextInt();
        int queen = input.nextInt();
        int rook = input.nextInt();
        int bishop = input.nextInt();
        int night = input.nextInt();
        int pawn = input.nextInt();

        System.out.println(1 - king);
        System.out.println(1 - queen);
        System.out.println(2 - rook);
        System.out.println(2 - bishop);
        System.out.println(2 - night);
        System.out.println(8 - pawn);
    }
}
