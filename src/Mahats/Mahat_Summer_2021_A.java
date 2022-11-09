package Mahats;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Mahat_Summer_2021_A {

    public static void main(String[] args) {
        int[] arr = g();
        System.out.println(Arrays.toString(arr));
        arr = gF();
        System.out.println(Arrays.toString(arr));
        System.out.println(q4(arr));
    }

    public static int q4(int[] arr) {
        if (arr.length == 1)
            return 0;

        int size = arr.length;
        int index = -1;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                index = i;
                break;
            } else if (arr[i] == arr[i + 1])
                return -1;
        }
        if (index == 0 || index == -1)
            return -1;
        for (int i = index; i < size - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return -1;
            }
        }

        return index;
    }

    public static int[] g() {
        Random rd = new Random();
        int size = rd.nextInt(20) + 10;
        System.out.println("Size = " + size);
        int[] arr = new int[size];
        int rand = rd.nextInt(size - 2) + 1;
        System.out.println("Rand = " + rand);

        for (int i = 0; i < rand; i++)
            arr[i] = i;

        for (int i = rand; i < size; i++)
            arr[i] = rand--;
        arr[rand] = (arr[rand] > arr[rand - 1]) ? arr[rand - 1] : 0;
        return arr;
    }

    public static int[] gF() {
        Random rd = new Random();
        int size = rd.nextInt(20) + 3;
        System.out.println("Size = " + size);
        int[] arr = new int[size];
        int rand = rd.nextInt(size);
        System.out.println("Rand = " + rand);

        for (int i = 0; i < rand; i++)
            arr[i] = rd.nextInt(30);

        for (int i = rand; i < size; i++)
            arr[i] = rd.nextInt(30);
        return arr;
    }
}
