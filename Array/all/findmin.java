package Array.all;


class min{
    public int findminarray(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;

            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}

public class findmin {
    public static void main(String[] args) {
        min obj=new min();
        int[] arr={6,7,8,1,2,3,4,5};
        int result=obj.findminarray(arr);
        System.out.println(result);
    }
    
}
