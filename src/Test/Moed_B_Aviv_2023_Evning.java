package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Moed_B_Aviv_2023_Evning {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the question number \nfor exit enter -1");
            int num = sc.nextInt();
            switch (num) {
                case -1:
                    System.out.println("Good bye");
                    return;
                case 1:
                    int number = sc.nextInt();
                    // סעיף א
                    if (number < 100 || number > 1000)
                        System.out.println("Wrong number");
                    // סעיף ב
                    int firstDigit = number % 10;
                    int secondDigit = ((number / 10) % 10);
                    int thirdDigit = (number / 100);
                    if (firstDigit == secondDigit && secondDigit == thirdDigit)
                        System.out.println("Yes all the digit are equal");
                    // סעיף ג
                    int[] x = {111, 222, 333, 444, 555, 666, 777, 888, 999};
                    for (int i = 0; i < x.length; i++)
                        if (x[i] % 111 == 0) System.out.println("YES ALL THE DIGIT ARE EQUAL");

                    break;
                case 2:
                    // a
                    System.out.println(sod(7, 4));
                    //b
                    System.out.println(sod(4, 3));
                    // c
                    System.out.println(sod(3, 4));
                    //d
                    System.out.println("בודקת האם המרחק בין a ל b בערך מוחלט הינו 1");
                    //בודקת האם המרחק בין a ל b בערך מוחלט הינו 1
                    //e
                    System.out.println(" פונקציה אשר מוגדרת להחזיר ערך כלשהו במקרה שלנו ערך בוליאני חייבת להחזיר ערך בכל מקרה ולכן במידה והתנאים הראשונים לא מתקיימים נרצה להחזיר שקר");
                    // פונקציה אשר מוגדרת להחזיר ערך כלשהו במקרה שלנו ערך בוליאני חייבת להחזיר ערך בכל מקרה ולכן במידה והתנאים הראשונים לא מתקיימים נרצה להחזיר שקר
                    break;
                case 3:
                    int[] data = {0, 5, 6, 9, 8, 7, 5, 6, 5, 8, 4, 0, 1, 2, 0, 1, 4, 5, 6, 3, 6, 9, 8, 7, 4, 5, 6, 3, 2, 1};
                    boolean ans = q3(data);
                    System.out.println(ans + " The array contains all digit [0-9]");
                    int[] data2 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
                    ans = q3(data2);
                    System.out.println(ans + " The array does not contain all the digits [0-9]");
                    break;
                case 4:
                    double[][] mat = new double[10][10];
                    for (int i = 0; i < 10; i++) {
                        mat[i] = new double[10];
                        for (int j = 0; j < 10; j++) {
                            mat[i][j] = new Random().nextInt(250);
                        }
                    }
                    System.out.println(Arrays.deepToString(mat));
                    System.out.println(maxBig(mat));
                    break;
                case 5:
                    what(4, 3);
                    System.out.println("a=5 , b=3");
                    System.out.println("הטענה תמיד נכונה מכיוון והפעולות שאנו מבצעים בפונקציה הן קומוטטיבית כלומר לא משנה אם נחבר a פעמים b או להפך b פעמים a");
                    System.out.println("הפעולה מבצעת כפל בית זוג המספרים שהתקבלו");
                    why(4, 3);
                    System.out.println("x=2 , b=4");
                    why(2, 4);
                    System.out.println("הטענה שגויה מכיון והפונקציה מחזירה את תוצאת החזקה על מספר");
                    System.out.println("הפעולה מבצעת חזקה על מספר");
                    break;
                case 6:
                    Taxi[] taxis = new Taxi[10];
                    for (int i = 0; i < 10; i++) {
                        taxis[i] = new Taxi(String.valueOf(new Random().nextInt(9999999) + 9000000), "driver name-" + i, new Random().nextInt(10) + 2);
                    }
                    System.out.println(Arrays.deepToString(taxis));
                    printAllTaxiAvailable(taxis);
                    String maxNumber = getMaxNumberOfPassengerTaxiAvailable(taxis);
                    System.out.println(maxNumber);
                    break;
                case 7:
                    Dog[] dogs = new Dog[10];
                    for (int i = 0; i < 10; i++) {
                        dogs[i] = new Dog("dog-" + i, "type-" + new Random().nextInt(10), "color-" + new Random().nextInt(5));
                    }
                    System.out.println(Arrays.deepToString(dogs));
                    int count = countTypeOfDogs(dogs, "type-" + new Random().nextInt(10));
                    System.out.println(count);
                    printAllType(dogs);
                    Dog[] ansDog = getAllDogColor(dogs, "color-" + new Random().nextInt(5));
                    System.out.println(Arrays.deepToString(ansDog));
                    break;
                case 8:
                    what(11, 4, 22);
                    what(7, 4, 13.3);
                    what(11, 34.6, 12.5);
                    System.out.println("הפונקציה ממינת ומדפיסה את שלושת המספרים מהקטן לגדול");
                    break;
                case 9:
                    int[] arr = {12, 13, 1, 10, 34};
                    int ans2 = what(arr);
                    System.out.println(ans2);
                    System.out.println("הפונקציה סוכמת את שלושת האיברים הגדולים במערך");
                    break;

            }
        }
    }

    public static int what(int[] arr) {
        int x = arr[0];
        int y = 0;
        int z = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > x) {
                z = y;
                y = x;
                x = arr[i];
            } else if (arr[i] > y) {
                z = y;
                y = arr[i];
            } else if (arr[i] > z) {
                z = arr[i];
            }
        }
        return x + y + z;
    }

    // זאת פונקציה שהייתה נתונה לכם.
    private static double big(double[] data) {
        if (data == null || data.length == 0)
            return Integer.MIN_VALUE;
        double max = data[0];
        for (int i = 0; i < data.length; i++) {
            if (max < data[i])
                max = data[i];
        }
        return max;
    }

    public static void what(double A, double B, double C) {
        double D;
        if (A > B) {
            D = A;
            A = B;
            B = D;
        }
        if (C < A) {
            D = A;
            A = C;
            C = -D;
        }
        if (C < B) {
            D = B;
            B = C;
            C = D;
        }
        System.out.print("A=" + A + " ");
        System.out.print("B=" + B + " ");
        System.out.println("C=" + C + " ");
    }

    private static int countTypeOfDogs(Dog[] dogs, String type) {
        int count = 0;
        for (Dog dog : dogs) {
            if (dog.getType().equals(type))
                count++;
        }
        return count;
    }

    private static void printAllType(Dog[] dogs) {

        String[] temp = new String[dogs.length];
        int countType = 0;
        boolean flag = false;
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < countType; j++) {
                if (dogs[i].getType().equals(temp[j]))
                    flag = true;
            }
            if (!flag)
                temp[countType++] = dogs[i].getType();
            flag = false;
        }
        for (int i = 0; i < countType; i++) {
            System.out.println(temp[i]);
        }
    }

    private static Dog[] getAllDogColor(Dog[] dogs, String color) {
        int countColor = 0;
        for (Dog value : dogs)
            if (value.getColor().equals(color))
                countColor++;
        Dog[] dogsColor = new Dog[countColor];
        countColor = 0;
        for (Dog dog : dogs)
            if (dog.getColor().equals(color))
                dogsColor[countColor++] = dog;

        return dogsColor;
    }

    private static void printAllTaxiAvailable(Taxi[] taxis) {
        for (int i = 0; i < taxis.length; i++) {
            if (taxis[i].isFree() && taxis[i].getNumberOfPassenger() >= 5)
                System.out.println(taxis[i].getDriverName());
        }
    }

    private static String getMaxNumberOfPassengerTaxiAvailable(Taxi[] taxis) {
        int max = -1;
        String driverName = "No Taxi Available";
        for (int i = 0; i < taxis.length; i++) {
            if (taxis[i].isFree() && max < taxis[i].getNumberOfPassenger()) {
                max = taxis[i].getNumberOfPassenger();
                driverName = taxis[i].getCarNumber();
            }
        }
        return driverName;

    }

    public static int what(int a, int b) {
        System.out.println("  a  |  b  |  c");
        int c = 0;
        System.out.println("  " + a + "  |  " + b + "  |  " + c + "");
        while (a > 0) {
            c = c + b;
            a--;
            System.out.println("  " + a + "  |  " + b + "  |  " + c + "");
        }
        System.out.println("  return " + c + "");
        return c;
    }

    public static int why(int x, int y) {
        System.out.println("  x  |  y  |  z");
        System.out.println("---------------");
        int z = 1;
        System.out.println("  " + x + "  |  " + y + "  |  " + z + "");
        while (y > 0) {
            z = what(z, x);
            y--;
            System.out.println("  " + x + "  |  " + y + "  |  " + z + "");
        }
        System.out.println("  return " + z + "");
        return z;
    }


    private static double maxBig(double[][] mat) {
        if (mat == null || mat.length == 0)
            return Integer.MIN_VALUE;
        double max = big(mat[0]);
        for (int i = 1; i < mat.length; i++) {
            double maxArray = big(mat[i]);
            if (max < maxArray)
                max = maxArray;
        }
        return max;
    }

    private static boolean q3(int[] data) {
        if (data.length < 10)
            return false;
        int[] countDigit = new int[10];
        for (int i = 0; i < data.length; i++) {
            countDigit[data[i]]++;
        }
        for (int i = 0; i < countDigit.length; i++) {
            if (countDigit[i] == 0)
                return false;
        }
        return true;
    }

    public static boolean sod(int a, int b) {
        if (a == b + 1)
            return true;
        if (b == a + 1)
            return true;
        return false;
    }

    static class Dog {
        private String name;
        private String type;
        private String color;

        public Dog(String name, String type, String color) {
            this.name = name;
            this.type = type;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }
    }

    static class Taxi {
        private String carNumber;
        private String driverName;
        private int numberOfPassenger;
        private boolean isFree;

        public Taxi(String carNumber, String driverName, int numberOfPassenger) {
            this.carNumber = carNumber;
            this.driverName = driverName;
            this.numberOfPassenger = numberOfPassenger;
            this.isFree = true;
        }

        public String getCarNumber() {
            return carNumber;
        }

        public void setCarNumber(String carNumber) {
            this.carNumber = carNumber;
        }

        public String getDriverName() {
            return driverName;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }

        public int getNumberOfPassenger() {
            return numberOfPassenger;
        }

        public void setNumberOfPassenger(int numberOfPassenger) {
            this.numberOfPassenger = numberOfPassenger;
        }

        public boolean isFree() {
            return isFree;
        }

        public void setFree(boolean free) {
            isFree = free;
        }

        @Override
        public String toString() {
            return "Taxi{" +
                    "carNumber='" + carNumber + '\'' +
                    ", driverName='" + driverName + '\'' +
                    ", numberOfPassenger=" + numberOfPassenger +
                    ", isFree=" + isFree +
                    '}';
        }
    }
}
