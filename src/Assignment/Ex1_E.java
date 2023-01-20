package Assignment;

import java.util.Scanner;

public class Ex1_E {

    public static void main(String[] args) {
        q1_Mahat_2022_A();
        boolean ans = q3_Mahat_2022_A(new int[]{13,6,3,13,6,3,13,6,3});
        System.out.println(ans);
        q1_Mahat_2022_B();
        q3_Mahat_2022_B();
    }

    private static void q1_Mahat_2022_A() {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo;
        int counter = 0;
        int sumOfPosNumber = 0;
        int countEqualsPair = 0;
        while ((numberOne = sc.nextInt()) + (numberTwo = sc.nextInt()) != 0) {
            counter += 2;
            sumOfPosNumber += (numberOne > 0) ? 1 : 0;
            sumOfPosNumber += (numberTwo > 0) ? 1 : 0;
            countEqualsPair += (numberOne == numberTwo) ? 1 : 0;
        }
        System.out.println("Counter Of Number - " + counter);
        System.out.println("Sum Of Pos Number - " + sumOfPosNumber);
        System.out.println("Counter Of Equals Pairs Number - " + countEqualsPair);

    }

    private static boolean q3_Mahat_2022_A(int[] arr) {
        if (arr.length % 3 != 0)
            return false;
        int numberOfParts = arr.length / 3;
        int c = 0;
        for (int i = 0; i < numberOfParts; i++) {
            int number = arr[i * numberOfParts];
            for (; c < i * numberOfParts + numberOfParts; c++) {
                if (arr[c] != number)
                    return false;
            }
        }
        return true;
    }

    private static void q1_Mahat_2022_B() {
    }

    private static void q3_Mahat_2022_B() {
    }


}
