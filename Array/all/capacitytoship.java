package Array.all;
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left=0;
        int right=0;
        for(int weight:weights){
            left=Math.max(left,weight);
            right+=weight;
        }
        int answer=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int currentweight=0;
            int requireddays=1;
            for(int weight:weights){
                if(currentweight+weight<=mid){
                    currentweight+=weight;
                }
                else{
                    requireddays++;
                    currentweight=weight;
                }
            }
            if(requireddays<=days){
                answer=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return answer;
    }
}

public class capacitytoship {
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[] arr={2,3,4,6,5,9};
        int result=obj.shipWithinDays(arr,4);
        System.out.println(result);
    }
    
}
