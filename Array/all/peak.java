package Array.all;
class ele{
    public int peak(int[] nums){
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }
            else{
                right=mid-1;

            }
        }
        return left;
    }
}

public class peak {
    public static void main(String[] args) {
        ele obj=new ele();
        int[] arr={1,2,3,2};
        int result=obj.peak(arr);
        System.out.println(result);
    }
    
}
