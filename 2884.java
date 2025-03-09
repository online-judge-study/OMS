package vaa;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int shi = in.nextInt(); // 시
        int bun = in.nextInt(); // 분

        if (shi == 0) {
            shi++;
            shi = 24;
        }

        int shi1 = (((shi 60) + bun) - 45) / 60; // 전체의 시

        int bun2 = ((bun * 60) - 2700); // 45분을 뺀 분

        if (bun2 < 0) { // 분이 음수면 60분의 초를 더해주고 나눔
            bun2 += 3600;
            bun2 /= 60;
        } else { // 분이 양수 이면 바로 60으로 나누어 줌
            bun2 /= 60;
        }

        if (shi1 == 24) {
            shi1 = 0;
        }

        if (shi1 < 0) {
            shi1 += 2;
            shi1= 23;
        }

        System.out.println(shi1 + " " + bun2);

    }

}
