package Array.Easy;
class sort{
    public boolean check(int nums[]){
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int next=(i+1)%n;
            if(nums[i]>nums[next]){
                count++;
            }
        }
        return count<=1;
    }
}
public class sortedndrotated{
    public static void main(String[] args) {
        sort obj=new sort();
        int[] arr={3,4,5,1,2};
        boolean result=obj.check(arr);
        System.out.println(result);
    }
}