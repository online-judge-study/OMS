package vaa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt(); //x좌표의 값
        int y = in.nextInt(); //y좌표의 값

        if ( x > 0 && y > 0 ) {
            System.out.println("1");
        } else if ( x < 0 && y > 0 ) {
            System.out.println("2");
        } else if ( x < 0 && y < 0 ) {
            System.out.println("3");
        } else if ( x > 0 && y < 0 ) {
            System.out.println("4");
        } 

    }

}
