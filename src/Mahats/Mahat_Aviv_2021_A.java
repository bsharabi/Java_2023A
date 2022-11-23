package Mahats;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

    }

}

public class Mahat_Aviv_2021_A {
    int i;

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 0, 13, 131, 44};
        System.out.println(Q4(arr));
    }

    //O(1)
    public static void Q1() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int countEven = 0;
        int sumOdd = 0;
        while (i != 40) {
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Invalid ");
                continue;
            }
            countEven += (num % 2 == 0) ? 1 : 0;
            sumOdd += (num % 2 != 0) ? num : 0;
            i++;
            if (num > 99 && num < 1000) {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                System.out.println(sum);
            }
            System.out.println(sumOdd);
            System.out.println(countEven);

        }


    }

    //O(n)
    // נניח כי גודל המערך מסומן ב-n
    // מכיוון ואנחנו עוברים באופן לינארי על כל איבר במערך פעם אחת אז הסיבוכיות היא כגודל הקלט.
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

    //O(n)
    public static boolean Q6(String str) {
        boolean found = false;
        if (str == null || str.length() < 3)
            return false;

        int size = str.length();

        if (str.charAt(0) == '.' || str.charAt(size - 1) == '.')
            return false;
        for (int i = 1; i < size - 1; i++) {
            if (str.charAt(i) == '.' && (str.charAt(i - 1) != '.' || str.charAt(i + 1) != '.')) {
                found = true;
            }
        }

        return found;
    }

    public static boolean Q9_a(String str) {
        if (str == null)
            return false;
        String subStr = "";
        for (int i = 0, size = str.length(); i < size; i++) {
            char ch = str.charAt(i);
            subStr += (ch >= 'A' && ch <= 'Z') ? ch : "";
        }
        System.out.println(subStr);

        int j=subStr.length();
        for (int i = 0; i <=j ;j--, i++) {
            if(subStr.charAt(i)!=subStr.charAt(j))
                return false;
        }
        return subStr.length()!=0;
    }
}
//------------------------ Q3 ------------------------------

class Tank {

    protected int capacity;
    private int amount;


    public Tank(int capacity) {
        this.capacity = (capacity > 0) ? capacity : 10;
        this.amount = 0;
    }

    //O(1)
    public boolean isPossible(int num, char op) {
        if (num < 0)
            return false;
        switch (op) {
            case '+':
                if (num + amount > capacity)
                    return false;
                amount += num;
                break;
            case '-':
                if (amount - num < 0)
                    return false;
                amount -= num;
                break;
            default:
                System.out.println("Invaild argument");
                return false;
        }
        return true;
    }

    //O(1)
    public boolean isFull() {
        return amount > 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static int fill(Tank t1, Tank t2) {

        int realAmount = t2.getCapacity() - t2.getAmount();
        return ((realAmount - t1.amount) < 0) ? realAmount : t1.amount;

    }
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

//------------------------ Q7 ------------------------------

class Battery {

    private String manufacturer;
    private char size;
    private double volt;
    private boolean isNormal;

    public Battery(String manufacturer, char size, double volt, boolean isNormal) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.volt = volt;
        this.isNormal = isNormal;
    }

    public Battery(char size, double volt) {
        this.manufacturer = "Duracell";
        this.size = size;
        this.volt = volt;
        this.isNormal = true;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getVolt() {
        return volt;
    }

    public void setVolt(double volt) {
        this.volt = volt;
    }

    public boolean isNormal() {
        return isNormal;
    }

    public void setNormal(boolean normal) {
        isNormal = normal;
    }
}

class BatteryPack {


    private double price;
    private Battery[] batteries;

    public BatteryPack(double price, Battery[] batteries) {
        this.price = price;
        this.batteries = batteries;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Battery[] getBatteries() {
        return batteries;
    }

    public void setBatteries(Battery[] batteries) {
        this.batteries = batteries;
    }

    //O(1)
    public static void checkPrice(BatteryPack batteries, double sum) {
        if (sum < 0 || batteries == null)
            System.out.println("Invalid Argument");

        if (batteries.getPrice() - sum < 0)
            System.out.println("It is possible to purchase " + (sum - batteries.getPrice()));
        else if (batteries.getPrice() - sum > 0)

            System.out.println("It isn't possible to purchase " + (batteries.getPrice() - sum));
        else
            System.out.println("O.K.");
    }

    //O(1)
    public boolean isEnough(double v) {
        double sumVolt = 0;
        for (int i = 0; i < batteries.length; i++) {

//            if(batteries[i].isNormal()){
//                sumVolt+=batteries[i].getVolt();
//            }else{
//                sumVolt+=0;
//            }
            sumVolt += (batteries[i].isNormal()) ? batteries[i].getVolt() : 0;
        }
        return sumVolt >= v;
    }
}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~