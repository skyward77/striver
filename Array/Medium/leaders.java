package Array.Medium;
import java.util.*;
class arrays{
    public ArrayList<Integer> leader(int[] nums){
        int n=nums.length;
        ArrayList<Integer> result=new ArrayList<>();
        int maxright=nums[n-1];
        result.add(maxright);
        for(int i=n-2;i>=0;i--){
            if(nums[i]>=maxright){
                result.add(nums[i]);
                maxright=nums[i];

            }
        }
        Collections.reverse(result);
        return result;


    }
}

public class leaders {
    public static void main(String[] args) {
        int[] arr={17,9,3,2,4,6,8};
        arrays obj=new arrays();
        ArrayList<Integer> result=obj.leader(arr);
        System.out.println(result);
    }
    
}
