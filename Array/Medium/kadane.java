package Array.Medium;
//agr sum neg hojaye to chordo fresh start kro
class max{
    public int maxsum(int[] nums){
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum);
            maxsum=Math.max(currentsum,maxsum);
        }
        return maxsum;
    }

}

public class kadane {
    public static void main(String[] args) {
        int[] arr={-2,4,-1,2,-3,-1,-7};
        max obj=new max();
        int result=obj.maxsum(arr);
        System.out.println(result);

    }
    
}
