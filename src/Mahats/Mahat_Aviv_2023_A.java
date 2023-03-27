package Mahats;

import java.util.Arrays;
import java.util.Scanner;

public class Mahat_Aviv_2023_A {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter q number");
            System.out.println("exit press -1");
            int num = in.nextInt();
            switch (num) {
                case 1:
                    q1();
                    break;
                case 2:
                    q2();
                    break;
                case 3:
                    boolean bool = q3_a(new int[]{1, 2, 3, 4, 5, 6, 7}, 0, 1);
                    System.out.println("q3_a = " + bool);
                    bool = q3_b(new int[]{1, 2, 3, 4, 5, 6, 7});
                    System.out.println("q3_b = " + bool);
                    break;
                case 4:
                    //x =17 -> b[1]
                    // b[1].pass -> 26
                    //b[3].pass ->17

                    // Alex 18
                    //s=18
                    //m=0

                    // Benny 26
                    //s=44
                    // m=1

                    // Char 16
                    //s=60
                    //m=1

                    // Dani 17
                    //s=77
                    //m=1

                    // Dani 17
                    //m=1
                    //s=94

                    // s/5 -> 94/5 -> 18.8
                    // m - > 1

                    String[] pNumber = notPopular(new Bus[]{}, 8);
                    System.out.println(Arrays.toString(pNumber));

                    break;
                case 5:
                    bool = q5_a(357, 34567);
                    System.out.println(bool);
                    bool = q5_a(13, 123);
                    System.out.println(bool);
                    bool = q5_a(7, 7007);
                    System.out.println(bool);


                    bool = q5_a(72, 7007);
                    System.out.println(bool);
                    bool = what(new int[]{13, 7802, 51, 133, 77, 255}, new int[]{123, 78002, 591, 13, 7, 25});
                    System.out.println(bool);
                    bool = what(new int[]{123, 78002, 591, 13, 7, 25}, new int[]{13, 7802, 51, 133, 77, 255});
                    System.out.println(bool);
                    System.out.println("הפעולה מבצעת באופן כללי בדיקה האם לכל ערך במערך a קיים אח במערך b");

                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:


                    bool = q9_a("12344321");
                    System.out.println(bool);


                    bool = q9_a("12343321");
                    System.out.println(bool);

                    bool = q9_b("2b2442b3$aa%a#ab$$%b");
                    System.out.println(bool);

                    bool = q9_bE("2b2442b3$aa%a#ab$$%b");
                    System.out.println(bool);


                    bool = q9_b("2b24423$aa%a#ab$$%b");
                    System.out.println(bool);

                    bool = q9_bE("2b24423$aa%a#ab$$%b");
                    System.out.println(bool);


                    String[] newArray = q9_c(new String[]{});
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case -1:
                    return;


            }


        }

    }

    private static String[] q9_c(String[] strings) {
        int count = 0;

        for (int i = 0; i < strings.length; i++) {
            if (q9_bE(strings[i]))
                count++;
        }

        String[] temp = new String[count];

        count = 0;
        for (int i = 0; i < strings.length; i++) {
            if (q9_bE(strings[i]))
                temp[count++] = strings[i];
        }

        return temp;
    }

    private static boolean q9_a(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    private static boolean q9_bE(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                newString += s.charAt(i);
        }
        return q9_a(newString);
    }

    private static boolean q9_b(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) < 'a' || s.charAt(left) > 'z' || s.charAt(left) < 'A' || s.charAt(left) > 'Z') {
                left++;
                continue;
            }
            if (s.charAt(right) < 'a' || s.charAt(right) > 'z' || s.charAt(right) < 'A' || s.charAt(right) > 'Z') {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static boolean what(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < b.length; j++) {
                if (q5_a(a[i], b[i]))
                    flag = true;
            }
            if (!flag)
                return false;
        }
        return true;

    }

    private static boolean q5_a(int num1, int num2) {
        if (num1 <= 0 || num2 <= 0)
            return false;

        boolean msb = num1 % 10 == num2 % 10;

        while (num1 > 9) {
            num1 /= 10;
        }

        while (num2 > 9) {
            num2 /= 10;
        }

        boolean lsb = num1 == num2;
        return lsb && msb;
    }

    private static String[] notPopular(Bus[] buses, int num) {

        int countArray = 0;
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].pass < num)
                countArray++;

        }
        String[] tempArray = new String[countArray];
        countArray = 0;
        for (int i = 0; i < buses.length; i++) {
            if (buses[i].pass < num)
                tempArray[countArray++] = buses[i].pNumber;

        }
        return tempArray;
    }

    private static boolean q3_a(int[] arr, int inx, int value) {

        for (int i = inx + 1; i < arr.length; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }

    private static boolean q3_b(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (q3_a(arr, i, arr[i]))
                return false;
        }
        return true;
    }

    private static void q2() {
        String input;
        int numberOfString = 0;
        while ((input = in.nextLine()).length() <= 13) {

//            boolean bool = input.contains("X") && !input.contains("Y");

            boolean flag = false;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'X')
                    flag = true;
                else if (input.charAt(i) == 'Y') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                numberOfString++;
            }

        }
        System.out.println(numberOfString);
    }

    private static void q1() {

        int count = 0;
        while (count < 100) {
            int number = in.nextInt();
            if (number < 0) {
                System.out.println("Invalid argument");
                continue;
            }

//            int lenNumber = (int) Math.log10(number) + 1;
            if (number > 99 && number < 1000) {
                int sumDigit = 0;
                while (number != 0) {
                    sumDigit += number % 10;
                    number /= 10;
                }
                System.out.println(sumDigit);
            }
            count++;
        }


    }

    static class Bus {

        public int pass;
        public String pNumber;
    }
}
