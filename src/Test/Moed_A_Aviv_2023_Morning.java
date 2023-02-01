package Test;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Moed_A_Aviv_2023_Morning {

    static Scanner sc = new Scanner(System.in);
    static int[] pyramid1 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    static int[] pyramid2 = {10, 20, 21, 45, 500, -1, -2, -3, -4};
    static int[] NotPyramid1 = {10, 10, 21, 45, 500, -4, -3, -2, -1};
    static int[] NotPyramid2 = {10, 20, 21, 45, 500, -4, -4, -2, -1};
    static int[] NotPyramid3 = {10, 20, 21, 45, 400, -4, 500, -2, -1};
    static int[] a = new int[]{1, 3, 23, 63, 6, 9};
    static int[] b = new int[]{3, 6, 4, 63, 235, 2, 23};


    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the question number \nfor exit enter -1");
            int choose = sc.nextInt();
            switch (choose) {
                case -1:
                    System.out.println("Good bye");
                    return;
                case 1:
                    System.out.println("Enter pairs of integers. \nInput ends when a 0 0 pair is received");
                    q1();
                    break;
                case 2:
                    int ans = q2(sc.nextInt());
                    System.out.println(ans);
                    break;
                case 3:
                    boolean ans1 = q3(NotPyramid2);
                    System.out.println(ans1);
                    break;
                case 4:
                    String enCode = q4_a("HELLO MY NAME IS BARAK AND I LOVE JAVA AND U?");
                    String deCode = q4_b(enCode);
                    System.out.println("HELLO MY NAME IS BARAK AND I LOVE JAVA AND U?");
                    System.out.println(enCode);
                    System.out.println(deCode);
                    break;
                case 5:
                    int[] mergeArray = q5(a, b);
                    System.out.println("a =" + Arrays.toString(a));
                    System.out.println("b =" + Arrays.toString(b));
                    System.out.println("merge =" + Arrays.toString(mergeArray));
                    break;
                case 6:
                    System.out.println(sod("AABABACCACGAGAFFAABABA"));
                    System.out.println(sod("AAABBAACCC"));
                    System.out.println(sod("ABBABBA"));
                    System.out.println(sod("ABBABBA"));
                    System.out.println(sod("ABBABBA"));
                    break;
                case 7:
                    String[] namesIngredients = {"peanuts", "starch", "zinc", "carbohydrates", "sugars", "fats"};
                    Ingredient[] ingredients = new Ingredient[10];
                    for (int i = 0; i < namesIngredients.length; i++)
                        ingredients[i] = new Ingredient(namesIngredients[i], new Random().nextInt(50) + 100);
                    Dish[] dishes = new Dish[3];
                    for (int i = 0; i < 3; i++)
                        dishes[i] = new Dish("Bamba-" + (60 + i * 20), ingredients, new int[]{20 + i * 2, 30 + i * 2, 40, 34 + i * 2, 23, 12 + i * 2}, 6);
                    System.out.println(Arrays.deepToString(dishes));
                    for (int i = 0; i < 3; i++) {
                        System.out.println(dishes[i].calcCaloriesForDish());
                    }
                    System.out.println(dishes[0].compare(dishes[2]));
                    break;
                case 8:
                    String res = what("A3BC12eDba", 0);
                    System.out.println("8.a " + res);
                    res = what("ABC", 0);
                    System.out.println("8.b " + res);
                    res = what("ABCcba", 0);
                    System.out.println("8.c " + res);
                    res = what("ABC1234cba", 0);
                    System.out.println("8.d " + res);
                    System.out.println("לא ניתן למצוא מחרוזת כזאת,\n נשים לב כי בזיהוי התוים הקטנים באלף בית האנגלי שרשור האותיות תמיד מימין ולכן כל קלט המכיל אות גדולה אחת לפחות יחסום את שאר האותיות הקטנות משמאל\n במילים פשוטות לא ניתן להציב אות קטנה משמאל לאות גדולה.");
                    System.out.println("הפונקציה בונה מחרוזת חדשה אשר מכילה את כל התווים מהאלף בית האנגלי כך שמשמאל התווים הגדולים ומימן הקטנים, ניתן לשים לב שהפונקציה מוחקת כל מי שאינו תו אנגלי");
                    System.out.println("הערך השלילי של k יגרום לשגיאות");
                    try {
                        what("", -8);
                    } catch (StringIndexOutOfBoundsException sErr) {
                        sErr.printStackTrace();
                    }
                    break;
                case 9:
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
                case 10:
                    Taxi[] taxis = new Taxi[10];
                    for (int i = 0; i < 10; i++) {
                        taxis[i] = new Taxi(String.valueOf(new Random().nextInt(9999999) + 9000000), "driver name-" + i, new Random().nextInt(10) + 2);
                    }
                    System.out.println(Arrays.deepToString(taxis));
                    printAllTaxiAvailable(taxis);
                    String maxNumber = getMaxNumberOfPassengerTaxiAvailable(taxis);
                    System.out.println(maxNumber);
                    break;
                case 11:
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
                case 12:
                    Contact[] contacts = new Contact[10];
                    for (int i = 0; i < 10; i++) {
                        contacts[i]=new Contact("name-"+i,"050"+new Random().nextInt(9999999)+9000000);
                    }
                    System.out.println(Arrays.deepToString(contacts));
                    ContactsPage[] contactsPages = new ContactsPage[26];
                    for (int i = 0; i < 26; i++) {
                        contactsPages[i]= new ContactsPage((char)('a'+i),10);
                    }
                    System.out.println(Arrays.deepToString(contactsPages));
                    System.out.println("contacts[0].isTheSameContact(contacts[1]?");
                    System.out.println(contacts[0].isTheSameContact(contacts[1]));
                    System.out.println("contacts[0].isTheSameContact(contacts[0]?");
                    System.out.println(contacts[0].isTheSameContact(contacts[0]));

                    System.out.println(contactsPages[0].isContactExists(contacts[0]));
                    contactsPages[0].addContact(contacts[0]);
                    System.out.println(contactsPages[0].isContactExists(contacts[0]));


                    break;
            }
        }

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
                driverName = taxis[i].getDriverName();
            }
        }
        return driverName;

    }

    public static int why(int x, int y) {
        System.out.println("   {x}     {y}     {z}    ");
        int z = 1;
        System.out.println(MessageFormat.format("    {0}      {1}       {2}   ", x, y, z));
        int temp = y; // הוספתי רק להדפסה

        while (y > 0) {
            z = what(z, x);
            y--;
            System.out.println(MessageFormat.format("    {0}      {1}       {2}   ", x, y, z));
        }
        System.out.println("return " + x + " ^ " + temp + " = " + z);
        return z;
    }

    public static String what(String s, int k) {
        if (s.length() == k) return "";
        if (s.charAt(k) >= 'A' && s.charAt(k) <= 'Z')
            return s.charAt(k) + what(s, k + 1);
        if (s.charAt(k) >= 'a' && s.charAt(k) <= 'z')
            return what(s, k + 1) + s.charAt(k);
        return what(s, k + 1);
    }

    public static int what(int a, int b) {
        System.out.println("   {a}     {b}     {c}    ");
        int temp = a; // הוספתי רק להדפסה
        int c = 0;
        System.out.println(MessageFormat.format("    {0}      {1}       {2}   ", a, b, c));
        while (a > 0) {
            c = c + b;
            a--;
            System.out.println(MessageFormat.format("    {0}      {1}       {2}   ", a, b, c));
        }
        System.out.println("return " + temp + " x " + b + " = " + c);
        return c;
    }

    private static int[] q5(int[] a, int[] b) {

        int size = Math.min(a.length, b.length);
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

    private static String q4_b(String s) {
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

    private static String q4_a(String s) {
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

    private static boolean q3(int[] pyramid) {
        if (pyramid.length % 2 == 0)
            return false;

        int middle = pyramid.length / 2;
        //for part 1
        for (int i = 1; i < middle; i++) {
            if (pyramid[i - 1] > pyramid[i])
                return false;
        }
        // for part 2
        if (pyramid[middle] < pyramid[middle - 1])
            return false;
        //for part 3
        for (int i = middle; i < pyramid.length - 1; i++) {
            if (pyramid[i] < pyramid[i + 1])
                return false;
        }
        return true;
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

    private static void q1() {
        int num1, num2;
        int counter = 0;
        int sum = 0;
        int oppositePairs = 0;

        do {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if (num1 == 0 && num2 == 0)
                break;
            counter += 2;
            sum += num1 + num2;
            if (num1 + num2 == 0) {
                System.out.println(MessageFormat.format("({0},{1})", num1, num2));
                oppositePairs++;
            }
        } while (true);
        System.out.println("The amount of numbers " + counter);
        System.out.println("The sum of numbers " + sum);
        System.out.println("The Avg of numbers " + (double) sum / counter);
        System.out.println("The opposite pairs of numbers " + oppositePairs);
    }

    public static void what(double A, double B, double C) {
        double D;
        if (A > B) {
            D = A;
            A = -B;
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
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);

    }

    public static boolean sod(String st) {
        String space = "      ";
        for (int i = 0; i < st.length() - 7; i++) {
            space += " ";
        }

        System.out.println(space + "{input}      |     {n}     |     {t}     |{st.charAt(i)}|");
        System.out.println(MessageFormat.format("      {0}      |      {1}      |      {2}      |      {3}       |", st, 0, '-', '-'));
        int n = 0;
        for (int t = 0; t < st.length(); t++) {
            if (st.charAt(t) == 'A')
                n++;
            else
                n--;
            System.out.println(MessageFormat.format("      {0}      |     " + ((n < 0) ? "" : " ") + "{1}      |      {2}      |      {3}       |", st, n, t, st.charAt((t))));
        }
        System.out.println("הפונקציה מבצעת בדיקה על מחרוזת האם מספר המופעים של התו A במחרוזת שווה למספר המופעים של שאר תוי המחרוזת");
        if (n == 0)
            return true;
        else
            return false;
    }

    static class Ingredient {

        private String name;
        private int calories;

        public Ingredient(String name, int calories) {
            this.name = name;
            this.calories = calories;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }

        @Override
        public String toString() {
            return "{ name='" + name + '\'' +
                    ", calories=" + calories +
                    '}';

        }
    }

    static class Dish {
        static int MAX_INGREDIENT = 10;
        private String name;
        private Ingredient[] ingredients;
        private int[] gramsPerIngredient;
        private int numberOfIngredient;


        public Dish(String name, Ingredient[] ingredients, int[] gramsPerIngredient, int numberOfIngredient) {
            this.name = name;
            this.ingredients = ingredients;
            this.gramsPerIngredient = gramsPerIngredient;
            this.numberOfIngredient = numberOfIngredient;
        }

        public static int getMaxIngredient() {
            return MAX_INGREDIENT;
        }

        public static void setMaxIngredient(int maxIngredient) {
            MAX_INGREDIENT = maxIngredient;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Ingredient[] getIngredients() {
            return ingredients;
        }

        public void setIngredients(Ingredient[] ingredients) {
            this.ingredients = ingredients;
        }

        public int[] getGramsPerIngredient() {
            return gramsPerIngredient;
        }

        public void setGramsPerIngredient(int[] gramsPerIngredient) {
            this.gramsPerIngredient = gramsPerIngredient;
        }

        public int getNumberOfIngredient() {
            return numberOfIngredient;
        }

        public void setNumberOfIngredient(int numberOfIngredient) {
            this.numberOfIngredient = numberOfIngredient;
        }

        public int calcCaloriesForDish() {
            int valueOfDish = 0;
            for (int i = 0; i < numberOfIngredient; i++) {
                int caloriesPerGram = ingredients[i].calories / 100;
                valueOfDish += gramsPerIngredient[i] * caloriesPerGram;
            }
            return valueOfDish;
        }

        public int compare(Dish OtherDish) {
            return calcCaloriesForDish() - OtherDish.calcCaloriesForDish();
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    " ,ingredients=" + Arrays.toString(ingredients) +
                    " ,gramsPerIngredient=" + Arrays.toString(gramsPerIngredient) +
                    ", numberOfIngredient=" + numberOfIngredient +
                    '}' + "\n";
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

    static class Contact {

        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public boolean isTheSameContact(Contact other) {
            return name.equals(other.getName()) && phoneNumber.equals(other.getPhoneNumber());
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }

    static class ContactsPage {
        private char letter;
        private Contact[] contactsArr;
        private int numberOfContacts;

        public ContactsPage(char letter, int maxNumOfContactsPerPage) {
            this.letter = letter;
            this.contactsArr = new Contact[maxNumOfContactsPerPage];
            this.numberOfContacts = 0;
        }

        public char getLetter() {
            return letter;
        }

        public void setLetter(char letter) {
            this.letter = letter;
        }

        public Contact[] getContactsArr() {
            return contactsArr;
        }

        public void setContactsArr(Contact[] contactsArr) {
            this.contactsArr = contactsArr;
        }

        public int getNumberOfContacts() {
            return numberOfContacts;
        }

        public void setNumberOfContacts(int numberOfContacts) {
            this.numberOfContacts = numberOfContacts;
        }

        public boolean isContactExists(Contact c) {
            for (int i = 0; i < numberOfContacts; i++) {
                if (contactsArr[i].isTheSameContact(c))
                    return true;
            }
            return false;
        }

        public boolean addContact(Contact c) {
            if (numberOfContacts >= contactsArr.length)
                return false;
            if (isContactExists(c))
                return false;
            contactsArr[numberOfContacts++] = c;
            return true;
        }

        @Override
        public String toString() {
            return "ContactsPage{" +
                    "letter=" + letter +
                    ", contactsArr=" + Arrays.toString(contactsArr) +
                    ", numberOfContacts=" + numberOfContacts +
                    '}';
        }
    }
}

