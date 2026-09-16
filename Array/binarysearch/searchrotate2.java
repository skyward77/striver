package Array.binarysearch;

class rot{
    public boolean search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[left]==nums[mid]&&nums[mid]==nums[right]){
                left++;
                right--;
            }
            else if(nums[left]<=nums[mid]){
                if(nums[left]<=target&&target<nums[right]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(nums[mid]<target&&target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return false;
    }
}

public class searchrotate2 {
    public static void main(String[] args) {
        rot obj=new rot();
        int[] arr={5,6,7,1,2,3};
        boolean result=obj.search(arr,2);
        System.out.println(result);

    }
    
}
