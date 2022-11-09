package Mahats;

import java.util.Random;

public class Mahat_Aviv_2021_B {

    public static void main(String[] args) {
        Random rd = new Random();
        char[] le = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String pass = "";
        for (int i = 0; i < rd.nextInt(20); i++) {
            for (int j = 0; j < rd.nextInt(13) + 2; j++) {
                if (j == 0)
                    pass += Character.toUpperCase(le[rd.nextInt(le.length)]);
                else pass += (rd.nextInt(2) == 1) ? le[rd.nextInt(le.length)] : rd.nextInt(10);

            }
            System.out.println(pass);
            System.out.println("Invaild argument - " + q4(pass));
            pass = "";
        }
        System.out.println("Invaild argument - " + q4("Barak14"));
        System.out.println("Invaild argument - " + q4("Barakk234"));
        System.out.println("Invaild argument - " + q4("aarak1234"));
        System.out.println("Invaild argument - " + q4("Barakshar"));
    }

    static public boolean q4(String password) {
        if (password.length() < 8)
            return false;
        char ch = password.charAt(0);
        if (ch < 65 || ch > 90)
            return false;
        if (ch < 'A' || ch > 'Z')
            return false;
        if (!Character.isUpperCase(ch)) {
            return false;
        }
        int len = password.length();
        ch = password.charAt(len - 1);
        if (ch < 48 || ch > 58)
            return false;
        if (ch < '0' || ch > '9')
            return false;
        if (!Character.isDigit(ch)) {
            return false;
        }
        for (int i = 0; i < len - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1))
                return false;
        }
        return true;
    }
}
