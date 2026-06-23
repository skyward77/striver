package Array.Medium;
class profit{
    public int buysell(int[] nums){
        int minprice=Integer.MAX_VALUE; //we start with largest element so that first price will replace it
        int maxprofit=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minprice){
                minprice=nums[i];
                //this becomes the best day

            }
            int profit=nums[i]-minprice;
            if(profit>maxprofit){
                maxprofit=profit;
            }
        }
        return maxprofit;
    }
}

public class buyandsell {
    public static void main(String[] args) {
        profit obj=new profit();
        int[] arr={1,3,4,2,5,6};
        int result=obj.buysell(arr);
        System.out.println(result);
    }
    
}
