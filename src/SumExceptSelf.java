import java.util.Scanner;

public class SumExceptSelf {
   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long[] nums = new long[n];
        long totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
            totalSum += nums[i];
        }
        
        for (int i = 0; i < n; i++) {
            long result = totalSum - nums[i];
            System.out.print(result + (i == n - 1 ? "" : " "));
        }
        
        sc.close();
    }
    
}
