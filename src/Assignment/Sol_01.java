package Assignment;

public class Sol_01 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("--------------------------------------");
        q1(n);
        System.out.println("--------------------------------------");
        q2(n);
        System.out.println("--------------------------------------");
        q3(n);
        System.out.println("--------------------------------------");

    }

    public static void q1(int n) {
        if (n > 1) {
            for (int a = 1, b = n - a; b > 0; b--, a++) {
                System.out.println(a + " + " + b + " = " + n);
            }
        }
    }

    public static void q2(int n) {
        if (n > 2) {
            for (int a = 1; a < n; a++) {
                for (int b = 1; b < n; b++) {
                    for (int c = 1; c < n; c++) {
                        if (a + b + c == n )
                            System.out.println(a + " + " + b + " + " + c + " = " + n);

                    }
                }
            }

        }

    }


    public static void q3(int n) {
        if (n >= 6) {
            for (int a = 1; a < n; a++) {
                for (int b = 2; b < n; b++) {
                    for (int c = 3; c < n; c++) {
                        if (a + b + c == n && a<b && a<c && b<c)
                            System.out.println(a + " + " + b + " + " + c + " = " + n);

                    }
                }
            }

        }
    }
}
