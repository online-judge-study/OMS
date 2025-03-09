package vaa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Gee {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int z1 = in.nextInt(); //주사위 1번
        int z2 = in.nextInt(); //주사위 2번
        int z3 = in.nextInt(); //주사위 3번

        if (z1 == z2 && z1 == z3) { // 1번 해결
            System.out.println(1000 * z1 + 10000);
            System.exit(0); //바로 코드를 종료 시킴
        }

        if (z1 == z2) { // 2번과 3번 
            System.out.println(100 * z1 + 1000);
        } else if (z2 == z3) {
            System.out.println(100 * z2 + 1000);
        } else if (z3 == z1) {
            System.out.println(100 * z3 + 1000);
        } else { 
            if (z1 > z2 && z1 > z3) {
                System.out.println(z1 * 100);
            } else if (z2 > z1 && z2 > z3) {
                System.out.println(z2 * 100);
            } else if (z3 > z2 && z3 > z1) {
                System.out.println(z3 * 100);
            }

        }
    }

}
