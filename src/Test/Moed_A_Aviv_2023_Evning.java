package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Moed_A_Aviv_2023_Evning {

    static int[] a = new int[]{1, 3, 23, 63, 6, 9};
    static int[] b = new int[]{3, 6, 4, 63, 235, 2, 23};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter q number or -1 to exit");
            switch (sc.nextInt()) {
                case 1:
                    q1();
                    break;
                case 2:
                    int ans = q2(sc.nextInt());
                    System.out.println(ans);
                    break;
                case 3:
                    String enCode = q3_a("HELLO MY NAME IS BARAK AND I LOVE JAVA AND U?");
                    String deCode = q3_b(enCode);
                    System.out.println("HELLO MY NAME IS BARAK AND I LOVE JAVA AND U?");
                    System.out.println(enCode);
                    System.out.println(deCode);
                    break;
                case 4:
                    double[][] mat = new double[][]{
                            {1, 5, 2, 3, 8},
                            {5, 7, 1, 3, 6, 3},
                            {7, 4, 6, 2, 7, 3, 6},
                            {3, 90}
                    };
                    double maxNumber = findMaxInMatrix(mat);
                    System.out.println(maxNumber);
                    break;
                case 5:
                    int[] mergeArray = q5(a, b);
                    System.out.println("a =" + Arrays.toString(a));
                    System.out.println("b =" + Arrays.toString(b));
                    System.out.println("merge =" + Arrays.toString(mergeArray));
                    break;

                case 6:
                    Jumper[] jumpers = new Jumper[10];
                    for (int i = 0; i < 10; i++) {
                        jumpers[i] = new Jumper("name-" + i, new Random().nextDouble(10) + 2, (char) (new Random().nextInt(3) + 65));
                    }
                    System.out.println(Arrays.toString(jumpers));
                    double avg = getAvgJumper(jumpers);
                    System.out.println(avg);
                    printAllJumper(jumpers, 17);
                    break;
                case 7:
                    // זו תכונה מחלקה והיא לא שייכת לאובייקטים הנוצרים ממחלקה זו
                    Kids k1 = new Kids("tomer", 16);
                    Kids k2 = new Kids("gigo", 26);
                    Kids k3 = new Kids("emely", 15);
                    System.out.println("Place k" + 1 + " " + k1.getPlace());
                    System.out.println("Place k" + 2 + " " + k2.getPlace());
                    System.out.println("Place k" + 3 + " " + k3.getPlace());


                    System.out.println("NumOfChildren " + Kids.getNumChildren());

                    System.out.println(k1);
                    System.out.println(k2);
                    System.out.println(k3);
                    break;
                case 8:
                    int[] arr1 = {4, 5, 7};
                    int[] arr2 = {3, 8, 6};
                    func(arr1, arr2);

                    break;
                case 9:
                    OrangeTree[] orangeTrees = new OrangeTree[10];
                    for (int i = 0; i < 10; i++) {
                        orangeTrees[i] = new OrangeTree();
                        for (int j = 0; j < 90; j++)
                            orangeTrees[i].orangeInDay(new Random().nextInt(15), j);
                    }
                    System.out.println(Arrays.deepToString(orangeTrees));
                    System.out.println(orangeTrees[0].getAmountIn90());
                    System.out.println(orangeTrees[1].compare(orangeTrees[2]));
                    System.out.println(OrangeTree.getMaxAmount(orangeTrees));
                    break;

                default:
                    return;
            }
        }


    }

    private static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        for (int i = 0; i < name.length() + 2; i++) {
            System.out.print('*');
        }
        System.out.println("\n*" + name + "*");
        for (int i = 0; i < name.length() + 2; i++) {
            System.out.print('*');
        }
        System.out.println("\n");
    }

    private static int q2(int n) {
        if (n < 9)
            return n;

        int digit = n % 10;
        while (n > 9) {
            n /= 10;
        }
        return n * 10 + digit;
    }

    private static String q3_b(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '*':
                    temp += 'A';
                    break;
                case '%':
                    temp += 'U';
                    break;
                case '#':
                    temp += 'E';
                    break;
                case '&':
                    temp += 'I';
                    break;
                case '$':
                    temp += 'O';
                    break;
                default:
                    temp += ch;
                    break;
            }
        }
        return temp;
    }

    private static String q3_a(String s) {
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'A':
                    temp += '*';
                    break;
                case 'U':
                    temp += '%';
                    break;
                case 'E':
                    temp += '#';
                    break;
                case 'I':
                    temp += '&';
                    break;

                case 'O':
                    temp += '$';
                    break;
                default:
                    temp += ch;
                    break;
            }
        }
        return temp;
    }

    private static double findMaxInMatrix(double[][] data) {

        double max = data[0][0];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > max)
                    max = data[i][j];
            }
        }
        return max;
    }

    private static int[] q5(int[] a, int[] b) {

        int size = (a.length > b.length) ? a.length : b.length;
        int amountOfIdenticalNumbers = 0;
        int[] temp = new int[size];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b.length; j++)
                if (a[i] == b[j]) {
                    temp[amountOfIdenticalNumbers++] = a[i];
                    break;
                }
        int[] merge = new int[amountOfIdenticalNumbers];
        for (int i = 0; i < amountOfIdenticalNumbers; i++) {
            merge[i] = temp[i];
        }
        return merge;
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

    public static void func(int[] arr1, int[] arr2) {
        int i, j, temp;
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static class Kids {
        private static int numChildren = 0;

        private int place;
        String name;
        int age;

        public static int getNumChildren() {
            return numChildren;
        }

        public static void setNumChildren(int numChildren) {
            Kids.numChildren = numChildren;
        }

        public int getPlace() {
            return place;
        }

        public void setPlace(int place) {
            this.place = place;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Kids(String name, int age) {
            this.name = name;
            this.place = numChildren + 1;
            this.age = age;
            numChildren++;
        }

        public String toString() {
            String str = "My name is: " + this.name + " Im in place " +
                    this.place + " Age " + this.age;
            return str;
        }
    }

    static class OrangeTree {
        private int[] orange = new int[90];// number of oranges harvested in 90 days

        public OrangeTree() {

        }

        // set number of oranges harvested in a day
        public void orangeInDay(int o, int day) {
            orange[day] = o;
        }

        // get number of oranges harvested in a day, pass as parameter
        public int getO(int day) {
            return orange[day];
        }

        public int getAmountIn90() {
            int sum = 0;
            for (int i = 0; i < orange.length; i++) {
                sum += orange[i];
            }
            return sum;
        }

        public boolean compare(OrangeTree o) {
            return getAmountIn90() == o.getAmountIn90();
        }

        public static int getMaxAmount(OrangeTree[] orangeTrees) {
            int max = orangeTrees[0].getAmountIn90();
            for (int i = 0; i < orangeTrees.length; i++) {
                if (max < orangeTrees[i].getAmountIn90())
                    max = orangeTrees[i].getAmountIn90();
            }
            return max;
        }

        @Override
        public String toString() {
            return "OrangeTree{" +
                    "orange=" + Arrays.toString(orange) +
                    '}';
        }
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
}


