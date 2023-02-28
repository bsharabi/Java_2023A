package Test;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Moed_B_Aviv_2023_Morning {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter q number");
            int num = sc.nextInt();
            switch (num) {
                case -1:
                    System.out.println("Good bye");
                    return;
                case 1:
                    boolean number, lower, upper, symbol, len;
                    len = number = lower = upper = symbol = false;
                    System.out.println("Enter password");
                    String pass = sc.next();
                    if (pass.length() >= 8 && pass.length() <= 20)
                        len = true;
                    for (int i = 0; i < pass.length(); i++) {
                        char ch = pass.charAt(i);
                        if (ch >= 65 && ch <= 90) {
                            upper = true;
                        }

                        if (ch >= 97 && ch <= 122) {
                            lower = true;
                        }

                        if (ch >= 48 && ch <= 58) {
                            number = true;
                        }

                        if (ch > 32 && ch <= 38) {
                            symbol = true;
                        }

                    }
                    if (symbol && number && lower && upper && len) {
                        System.out.println("Good password");
                    } else {
                        System.out.println("Invalid password");
                    }
                    break;
                case 2:
                    Jumper[] jumpers = new Jumper[10];
                    for (int i = 0; i < 10; i++) {
                        jumpers[i] = new Jumper("name-" + i, new Random().nextDouble(10) + 2, (char) (new Random().nextInt(3) + 65));
                    }
                    System.out.println(Arrays.toString(jumpers));
                    double avg = getAvgJumper(jumpers);
                    System.out.println(avg);
                    printAllJumper(jumpers, 17);
                    break;
                case 3:
                    char[] direction = {'R', 'L', 'L', 'L', 'R'};
                    char[] direction2 = {'L', 'L', 'L', 'L', 'L'};
                    char[] direction3 = {'R', 'L', 'L', 'L', 'R'};
                    char[] direction4 = {'L', 'R', 'R', 'L', 'L'};
                    boolean bool4 = q3(direction);
                    System.out.println(bool4);
                    bool4 = q3(direction2);
                    System.out.println(bool4);
                    bool4 = q3(direction3);
                    System.out.println(bool4);
                    bool4 = q3(direction4);
                    System.out.println(bool4);
                    break;
                case 4:
                    int numberIn = sc.nextInt();
                    boolean bool = strongNumber(numberIn);
                    System.out.println("Is strong number " + bool);
                    break;
                case 5:
                    int[] arr = {12, 13, 1, 10, 34};
                    int res = what(arr);
                    System.out.println(res);
                    break;
                case 6:
                    String str = sc.next();
                    String enCode = encode(str);
                    System.out.println(enCode);
                    String deCode = decode(enCode);
                    System.out.println(deCode);
                    break;
                case 7:
                    RabbitFamily[] rabbitFamilies = new RabbitFamily[10];
                    for (int i = 0; i < 10; i++) {
                        rabbitFamilies[i] = new RabbitFamily("name-" + i, new Random().nextInt(13));
                    }
                    for (int i = 0; i < rabbitFamilies.length; i++) {
                        System.out.println("-----------------------------------");
                        System.out.println(rabbitFamilies[i]);
                        System.out.println(rabbitFamilies[i].hasEightSp());
                        System.out.println("-----------------------------------");
                    }
                    RabbitVillage[] rabbitVillages = new RabbitVillage[3];
                    for (int i = 0; i < rabbitVillages.length; i++) {
                        rabbitVillages[i] = new RabbitVillage("rabbitVillages" + i);
                    }
                    for (int i = 0; i < rabbitFamilies.length; i++) {
                        rabbitVillages[new Random().nextInt(3)].AddFamily(rabbitFamilies[i]);
                    }
                    for (int i = 0; i < rabbitVillages.length; i++) {
                        System.out.println(rabbitVillages[i].BigFamily());
                    }
                    System.out.println(RabbitVillage.PopulatedVillage(rabbitVillages));
                    break;
                case 8:
                    int[][] mat = new int[10][10];
                    for (int i = 0; i < 10; i++) {
                        mat[i] = new int[10];
                        for (int j = 0; j < 10; j++) {
                            mat[i][j] = new Random().nextInt(90) % 2;
                        }

                    }
                    for (int[] m : mat
                    ) {
                        System.out.println(Arrays.toString(m));
                    }
                    boolean bool2 = isLostIslands(mat);
                    System.out.println(bool2);
                    break;
                case 9:
                    break;
                case 10:
                    int[] a = {321, 121, 54, 45, 121, 123};
                    boolean bool5 = q10(a);
                    System.out.println(bool5);

                    int[] b = {321, 112, 54, 45, 121, 123};
                    bool5 = q10(b);
                    System.out.println(bool5);
                    break;
                case 11:
                    int[] c = {3, 2, 8, 1, 5, 3, 2, 6, 1, 9};
                    System.out.println(Arrays.toString(c));
                    q11(c);
                    System.out.println(Arrays.toString(c));
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < c.length; j++) {
                            c[j] = (new Random().nextInt(30) + 1);
                        }
                        System.out.println("------------------" + i + "------------------");
                        System.out.println(Arrays.toString(c));
                        q11(c);
                        System.out.println(Arrays.toString(c));
                        System.out.println("-------------------------------------");
                    }
                    break;
                case 12:
                    double[][] data = new double[10][10];
                    for (int i = 0; i < 10; i++) {
                        data[i] = new double[10];
                        for (int j = 0; j < 10; j++) {
                            data[i][j] = new Random().nextInt(55);
                        }
                    }
                    System.out.println(Arrays.deepToString(data));
                    q12(data);
                    break;

            }


        }
    }

    private static void q12(double[][] data) {
        int count = 1;
        double max = data[0][0];
        for (double[] datum : data) {
            for (int j = 0; j < datum.length; j++) {
                if (max == datum[j])
                    count++;
                if (datum[j] > max) {
                    max = datum[j];
                    count = 1;
                }

            }
        }
        System.out.println("Max number is " + max + " count - " + count);
    }

    private static void q11(int[] c) {
        int size = c.length;
        for (int i = 0; i < c.length - 2; i++) {
            c[i] = c[i + 2];
        }
        c[size - 1] = c[size - 2] = 0;
    }

    private static boolean isMirror(int a, int b) {
        int reversedNum = 0;

        while (a != 0) {
            int digit = a % 10;
            reversedNum = reversedNum * 10 + digit;
            a /= 10;
        }
        return b == reversedNum;
    }

    private static boolean q10(int[] a) {
        int left = 0, right = a.length - 1;
        while (left <= right) {
            if (!isMirror(a[left++], a[right--]))
                return false;
        }
        return true;
    }

    private static boolean q3(char[] direction) {
        if (direction.length <= 3)
            return false;
        int count = 0;
        for (int i = 1; i < direction.length - 2; i++) {
            char ch = direction[i];
            if (ch == direction[i + 1] && ch == direction[i + 2])
                return true;
        }
        return false;
    }

    private static boolean isLostIslands(int[][] islands) {
        for (int[] island : islands) {
            if (island.length != islands.length)
                return false;
        }
        for (int i = 1; i < islands.length - 1; i++) {
            int[] sum = new int[10];
            for (int j = 0; j < islands.length; j++) {
                sum[j] = islands[i - 1][j] + islands[i][j] + islands[i + 1][j];
            }
            for (int j = 0; j < sum.length - 1; j++) {
                if (sum[i] == 1 && sum[i + 1] == 1 || sum[i] >= 2)
                    return false;
            }
        }


        return true;
    }

    private static String decode(String s) {
        String newString = "";
        int offset = 5;
        for (int i = 0; i < s.length(); i++) {
            char ch = (char) (s.charAt(i) - 'A');
            ch = (char) (((ch - offset) % 26) + 'A');
            newString += ch;
        }
        return newString;
    }

    private static String encode(String s) {
        String newString = "";
        int offset = 5;
        for (int i = 0; i < s.length(); i++) {
            char ch = (char) (s.charAt(i) - 'A');
            ch = (char) (((ch + offset) % 26) + 'A');
            newString += ch;
        }
        return newString;

    }

    public static double getAvgJumper(Jumper[] arrJumper) {
        double avg = 0;
        for (int i = 0; i < arrJumper.length; i++) {
            avg += arrJumper[i].score;
        }
        return avg / arrJumper.length;
    }

    public static void printAllJumper(Jumper[] arrJumper, int age) {

        char category;
        if (age >= 12 && age < 20)
            category = 'A';
        else if (age >= 20 && age < 28)
            category = 'B';
        else
            category = 'C';
        double avg = getAvgJumper(arrJumper);

        for (int i = 0; i < arrJumper.length; i++) {
            if (arrJumper[i].category == category && arrJumper[i].getScore() >= avg)
                System.out.println(arrJumper[i].getName());
        }
    }

    private static int factorial(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }

    private static boolean strongNumber(int number) {
        if (number < 0)
            return false;
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static int what(int[] arr) {
        int x = arr[0];
        int y = 0;
        int z = 0;
        System.out.println("    arr[i]     |    x    |    y    |    z    |");
        System.out.println("         -     |    " + x + "    |    " + y + "    |    " + z + "    |");
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
            System.out.println("    " + arr[i] + "     |    " + x + "    |    " + y + "    |    " + z + "    |");
        }
        System.out.println(" x + y + z = " + (x + y + z));
        return x + y + z;
    }

    static class Jumper {
        String name;
        double score;
        char category;

        public Jumper(String name, double score, char category) {
            this.name = name;
            this.score = score;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public char getCategory() {
            return category;
        }

        public void setCategory(char category) {
            this.category = category;
        }

        @Override
        public String toString() {
            return "Jumper{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    ", category=" + category +
                    '}';
        }
    }

    static class RabbitFamily {
        String family;
        int offSprings;

        public RabbitFamily(String family, int offSprings) {
            this.family = family;
            this.offSprings = offSprings;
        }

        public boolean hasEightSp() {
            return offSprings >= 8;
        }

        @Override
        public String toString() {
            return "family='" + family + '\'' +
                    ", offSprings=" + offSprings + "\n";

        }
    }

    static class RabbitVillage {
        String name;
        int numberOfFamily;
        RabbitFamily[] rabbitFamilies;

        public RabbitVillage(String name) {
            this.name = name;
            this.numberOfFamily = 0;
            this.rabbitFamilies = new RabbitFamily[100];
        }

        public boolean AddFamily(RabbitFamily rabbitFamily) {
            if (numberOfFamily >= rabbitFamilies.length)
                return false;

            rabbitFamilies[numberOfFamily++] = rabbitFamily;
            return true;
        }

        public int BigFamily() {
            int count = 0;
            for (int i = 0; i < numberOfFamily; i++) {
                if (rabbitFamilies[i].hasEightSp())
                    count++;
            }
            return count;
        }

        public static String PopulatedVillage(RabbitVillage[] rabbitVillages) {
            int max = rabbitVillages[0].BigFamily();
            String nameVillage = rabbitVillages[0].name;
            for (int i = 1; i < rabbitVillages.length; i++) {
                int big = rabbitVillages[i].BigFamily();
                if (big > max) {
                    max = big;
                    nameVillage = rabbitVillages[i].name;
                }
            }
            return nameVillage;
        }

        @Override
        public String toString() {
            return
                    "name='" + name + '\'' +
                            ", numberOfFamily=" + numberOfFamily +
                            ", rabbitFamilies=" + Arrays.toString(rabbitFamilies) + "\n";
        }
    }

    static class Date {
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Date{" +
                    "day=" + day +
                    ", month=" + month +
                    ", year=" + year +
                    '}';
        }


        public boolean equals(Date o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Date date = (Date) o;
            return day == date.day && month == date.month && year == date.year;
        }

        public int compareTo(Date date) {
            int sumDays = day + (month - 1) * 31 + year * (31 * 12);
            int sumDays2 = date.day + (date.month - 1) * 31 + date.year * (31 * 12);
            return sumDays - sumDays2;
        }
    }

    static class Room {

    }

    static class Hotel {

    }
}