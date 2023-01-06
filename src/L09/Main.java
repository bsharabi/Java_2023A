package L09;
public class Main {


    public static void main(String[] args) {
//        Ceremony c = new Ceremony();
//        c.doChoices();
//        System.out.println(c.winner());
        int number = 4372;
        int level = levelOfNumber(number);
        System.out.println(level);
        boolean ans = levelOfSubArray(new int[]{}, new int[]{});

    }

    private static boolean levelOfSubArray(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null)
            return false;
        boolean[] arr1Bollean = new boolean[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int levelArr1 = levelOfNumber(arr1[i]);
            for (int j = 0; j < arr2.length; j++) {
                if (levelOfNumber(arr2[j]) == levelArr1)
                    arr1Bollean[i] = true;
            }
        }

        for (int i = 0; i < arr1Bollean.length; i++) {
            if (arr1Bollean[i] == false)
                return false;
        }
        return true;
    }

    private static int levelOfNumber(int number) {
        int even = 0, odd = 0;
        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            if (digit % 2 == 0)
                even += digit;
            else
                odd += digit;

        }
        return even - odd;
    }

}
