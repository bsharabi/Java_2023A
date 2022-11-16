package Mahats;

public class Mahat_Aviv_2021_A {
    int i;
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 0, 13, 131, 44};
        System.out.println(Q4(arr));
    }

    public static boolean Q4(int[] arr) {
        int size = arr.length;
        if (size % 2 == 0)
            return false;
        int i = 0;
        while (i < size / 2) {

//            switch (arr[i]) {
//                case 0:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                    break;
//                default:
//                    return false;
            if (arr[i] > 9 || arr[i] < 0) {
                return false;

//            if(arr[i]>=0 && arr[i]<=9) {
//                continue;
//            }
//                else{
//                    return false;
//                }
            }
            i++;
        }
        if (arr[i] != 0)
            return false;
        i++;
        while (i < size) {
            if (arr[i] <= 9 && arr[i] > 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}