package Mahats;

import java.util.Arrays;
import java.util.Random;

public class Mahat_Aviv_2022_A {

    public static void main(String[] args) {

        int[] arr = q2(5);
        System.out.println(Arrays.toString(arr));



    }


    private static int[] q2(int n) {
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int numAhadot = rd.nextInt(8) + 2;
            int numAsarot = rd.nextInt(numAhadot-1) + 1;
            arr[i] = numAsarot * 10 + numAhadot;
        }
        return arr;
    }
}

