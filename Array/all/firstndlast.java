package Array.all;
import java.util.*;

class sorted{
    public int[] search(int[] nums,int target){
        int first=first(nums,target);
        int last=last(nums,target);
        return new int[]{first,last};

    }

    public int first(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        int ans=1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return ans;
    }
    public int last(int[] nums,int target){
        int left=0;
        int right= nums.length-1;
        int ans=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
}

public class firstndlast {
    public static void main(String[] args) {
        int[] arr={4,4,5,6,10};
        sorted obj=new sorted();
        int[] result=obj.search(arr,4);
        
            System.out.println(Arrays.toString(result));

        
        
    }
    
}
