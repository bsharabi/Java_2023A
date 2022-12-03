package L05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        Q1();
        runningSum(arr);
      
    }

    private static void Q1() {

    }

    public static int[] runningSum(int[] nums) {
        int sum=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
