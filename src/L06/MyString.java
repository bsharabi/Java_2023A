package L06;

public class MyString {

    private String s;

    public static void main(String[] args) {
        MyString MyStr = new MyString("barak");
        System.out.println(MyStr);
        System.out.println(MyStr.toLowerCase());
        System.out.println(MyStr);
        System.out.println(MyStr.toUpperCase());
        System.out.println(MyStr);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        for (int i = 10 - 1; i >= 0; i--) {
            System.out.println(i);
        }

    }

    public MyString(String s) {
        this.s = s;
    }

    public String trim() {
        return s;
    }

    public int lastIndexOf(int ch) {
        return -1;
    }

    public int indexOf(int ch) {
        return -1;
    }

    public int contains(char c) {
        return -1;
    }

    public String toLowerCase() {
        String string = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            }
            string += ch;
        }
        return string;
    }

    public String toUpperCase() {
        String string = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            string += ch;
        }
        return string;
    }

    public String substring(int from) {
        String newString = "";
        for (int i = from; i < s.length(); i++) {
            newString += s.charAt(i);
        }
        return newString;
    }

    public String concat(String str) {
        return s;
    }

    public String substring(int from, int to) {
        return "";
    }

    @Override
    public String toString() {
        return s;
    }


}
