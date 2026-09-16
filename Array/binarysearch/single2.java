package Array.binarysearch;
class Solu {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
        
    }
}

public class single2 {
    public static void main(String[] args) {
        Solu obj=new Solu();
        int[] arr={1,1,2,2,3,4,4,5,5,6,6,7,7};
        int result=obj.singleNonDuplicate(arr);
        System.out.println(result);
    }
    
}
