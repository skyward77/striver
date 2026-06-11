package Array.Easy;
import java.util.Scanner;
class duplicate{
    public static int duplicates(int[] nums){
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int result=duplicate.duplicates(arr);
        for(int i=0;i<result;i++){
            System.out.println(arr[i]);
        }

        
    }
    
}
