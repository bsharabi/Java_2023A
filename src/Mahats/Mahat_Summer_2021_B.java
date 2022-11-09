package Mahats;

import java.util.ArrayList;
import java.util.Scanner;

public class Mahat_Summer_2021_B {
    public static void main(String[] args) {
        System.out.println(q1());
        q3("Java is a good language", 'a');
        int[] arr = new int[8];
        System.out.println(q4_a(arr));
        System.out.println(q4_b(arr));
    }


    private static int q1() {
        Scanner sc = new Scanner(System.in);
        int cnt0 = 0;
        int cnt1 = 0;
        String str;
        //------------------- 1 -------------------
        do {

            str = sc.nextLine();
            if (str.length() >= 4 && !str.contains("T"))
                cnt0++;
        } while (str.length() >= 4);
        System.out.println(cnt0);
        //------------------------------------------

        //------------------- 2 -------------------
        do {
            str = sc.nextLine();
            if (str.length() >= 4)
                cnt1++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'T') {
                    cnt1--;
                    break;
                }
            }
        } while (str.length() >= 4);
        //-----------------------------------------

        //------------------- 3 -------------------

        ArrayList<String> al = new ArrayList<>();
        do {
            str = sc.nextLine();
            if (str.length() < 4)
                break;
            al.add(str);
        } while (true);
        int cnt2 = 0;
        for (int i = 0; i < al.size(); i++) {
            cnt2 += (al.get(i).contains("T")) ? 0 : 1;

            if (al.get(i).contains("T"))
                cnt2 += 0;
            else
                cnt2 += 1;

            if (!al.get(i).contains("T"))
                cnt2++;
        }
        //-----------------------------------------

        return cnt0;
    }

    private static void q3(String str, char ch) {
        //------------------- 1 -------------------
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                System.out.println(str.substring(i));
        }
        //-----------------------------------------
        //------------------- 2 -------------------
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                for (int j = i; j < str.length(); j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.println();
            }
        }
        //-----------------------------------------


    }

    private static boolean q4_a(int[] arr) {
        //[1,9,2,8,4,7,7,4,12]
        for (int i = 2; i < arr.length; i += 2) {
            if (arr[i] <= arr[i - 2])
                return false;
        }
        //[1,9,2,8,4,7,7,4,12]
        for (int i = 1; i < arr.length - 2; i += 2) {
            if (arr[i] <= arr[i + 2])
                return false;
        }
        return true;
    }

    private static int q4_b(int[] arr) {
        int size = arr.length;
        //[1,9,2,8,3,7]
        //[1,9,2,8,3]
        if (size % 2 == 0) {
            return  (arr[size - 1]<arr[0])?arr[size - 1]:arr[0];

        }
        else {
            return  (arr[size - 1]<arr[0])?arr[size - 2]:arr[0];
        }

    }
}
