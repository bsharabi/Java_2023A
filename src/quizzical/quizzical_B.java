package quizzical;

import java.util.Arrays;

public class quizzical_B {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{0,1,23,33,382,498,163,43,8,9,10,5,6,7})));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < word1.length; i++)
            str1 += word1[i];
        for (int i = 0; i < word2.length; i++)
            str2 += word2[i];
        return str1.equals(str2);
    }

    public static String restoreString(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++)
            arr[indices[i]] = s.charAt(i);
        return String.valueOf(arr);
    }

    public static int findNumbers(int[] nums) {
        int countEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if (((int) Math.log10(nums[i]) + 1) % 2 == 0)
                countEven++;
        }
        return countEven;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countSmallerNumber = new int[nums.length];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (currentNumber > nums[j])
                    countSmallerNumber[k]++;
            }
            k++;
        }
        return countSmallerNumber;
    }

    static class Car{

        private String type;
        private String model;
        private String color;

        public Car(String type, String model, String color) {
            this.type = type;
            this.model = model;
            this.color = color;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isSameCar(Car c){

            return (c.type.equals(type)&& c.model.equals(model));
        }
    }
}
