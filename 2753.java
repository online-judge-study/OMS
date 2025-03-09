package vaa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int yun = in.nextInt();

        if ((yun % 4 == 0 && yun % 400 == 0) || (yun % 4 == 0 && yun % 100 != 0)) { //둘이 같으면 참
            System.out.println(1);
        } else {
            System.out.println(0);
        } 

    }

}
