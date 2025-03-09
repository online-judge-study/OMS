package vaa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Gee {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        
        StringTokenizer to = new StringTokenizer(a, " ");

        System.out.println(to.countTokens());

    }

}
