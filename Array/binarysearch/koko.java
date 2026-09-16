package Array.binarysearch;


class bnana{
    public int eating(int[] piles,int h){
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(right,pile);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            int hours=0;
            for(int pile:piles){
                hours=(pile+mid-1)/mid;
            }
            if(hours<=h){

            
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;

    }
}

public class koko {
    public static void main(String[] args) {
        bnana obj=new bnana();
        int[] arr={5,6,8,9};
        int result=obj.eating(arr,7);
        System.out.println(result);
    }
    
}
