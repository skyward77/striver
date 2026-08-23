package Array.all;
class split {
    public int splitArray(int[] nums, int k) {
        int left=0;
        int right=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        while(left<right){
            int mid=left+(right-left)/2;
            int subarray=1;
            int currentsum=0;
            for(int num:nums){
                if(currentsum+num>mid){
                    subarray++;
                    currentsum=num;
                }
                else{
                    currentsum+=num;
                }
            }
            if(subarray<=k){
                right=mid;

            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}

public class splitarray {
    public static void main(String[] args) {
        split obj=new split();
        int[] arr={2,3,5,8,9};
        int result=obj.splitArray(arr,2);
        System.out.println(result);

    }
    
}
