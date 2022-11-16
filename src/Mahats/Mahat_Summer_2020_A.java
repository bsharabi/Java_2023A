package Mahats;

public class Mahat_Summer_2020_A {
    public static void main(String[] args) {
        int[] arr = {22, 56, 123, 12, 10, -4, 2};
        System.out.println(q4(arr));
        System.out.println(q4_1(arr));
    }
    //T(n)=6n+8
    //O(n)
    public static boolean q4(int[] arr) {
        if (arr == null || arr.length < 3 || arr.length % 2 == 0)
            return false;

        int size = arr.length;
        int middle = size / 2;

        for (int i = 0; i < middle; i++)
            if (arr[i] <= arr[middle])
                return false;

        for (int i = middle + 1; i < size; i++)
            if (arr[i] >= arr[middle])
                return false;

        return true;
    }
    //T(n)=5n+7
    //O(n)
    // סיבוכיות הפתרון הינה לינארית מכיוון ואנחנו רצים על גודל המערך פעם אחת בדיוק ובריצה מבצעים השוואה יחידה של איבר האמצע מול כל איבר השונה ממנו
    private static boolean q4_1(int[] arr) {
        if (arr == null || arr.length < 3 || arr.length % 2 == 0)
            return false;
        int size = arr.length;
        int middle = size / 2;
        for (int i = 0; i < size; i++) {
            if (i != middle) {
                if (i < middle) {
                    if (arr[i] <= arr[middle])
                        return false;
                } else {
                    if (arr[i] >= arr[middle])
                        return false;
                }
            }
        }
        return true;
    }


}
