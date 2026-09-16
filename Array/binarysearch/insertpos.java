package Array.binarysearch;
class pos{
    public int insert(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
}

public class insertpos {
    public static void main(String[] args) {
        pos obj=new pos();
        int[] arr={3,5,7,8,9,4};
        int result=obj.insert(arr,9);
        System.out.println(result);
    }
    
}
