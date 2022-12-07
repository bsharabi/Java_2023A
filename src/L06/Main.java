package L06;

public class Main {

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println( toLowerCase("LOVELY"));

        System.out.println(toLowerCase1("Hello"));
        System.out.println( toLowerCase1("LOVELY"));
    }
    public static String toLowerCase(String s) {
        String LowerCase = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                ch = (char) (ch - 'A' + 'a');
            LowerCase += ch;
        }
        return LowerCase;
    }
    public static String toLowerCase1(String s) {
        String LowerCase = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            LowerCase+=(ch >= 'A' && ch <= 'Z')?(char) (ch - 'A' + 'a'):ch;
        }
        return LowerCase;
    }
}
