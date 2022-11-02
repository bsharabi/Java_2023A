package L01.Basic;

public class ConverFromString_03 {
    public static void main(String[] args) {

        //-------------------- Convert from string to number -----------------`
        int num1 = Integer.parseInt("3");

        double num2 = Double.parseDouble("7.8");

        System.out.println(num1 + num2);
        //-------------------- Convert from number to string -----------------
        String strNum1 = String.valueOf(num1);

        String strNum2 = String.valueOf(num2);

        System.out.println(strNum1+strNum2);
        System.out.println(strNum1+" "+strNum2);

        int a = 123456;
        String temp="";
        String aStr = String.valueOf(a);
        for (int i = aStr.length()-1; i >=0 ; i++) {
            temp+=aStr.charAt(i);
        }

         a = Integer.parseInt(temp);
        int b=a;
        int count=0;
        while(b!=0){
            count++;
            b/=10;
        }
        System.out.println(count);
        int temp1 = (int)Math.pow(10,count-1);
        b=a;
        a=0;
        while(count==0){
            a+=(temp1)*(b%10);
            b/=10;
            temp1/=10;
            count--;
        }
        System.out.println(a);

        int b1=a;

        int count1=(int)Math.log10(a);

        System.out.println(count);
        int temp11 = (int)Math.pow(10,count-1);
        b=a;
        a=0;
        while(count==0){
            a+=(temp1)*(b%10);
            b/=10;
            temp1/=10;
            count--;
        }
        System.out.println(a);


    }
}
