package Array.Easy;
class missing{
 public int missingnum(int[] nums){
    int n=nums.length;

    long total=(long)n*(n+1)/2;
    long sum=0;
    for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
    }
    return (int)(total-sum);
 }
}

public class missingnumber {
    public static void main(String[] args) {
        missing obj =new missing();
        int[] arr={0,1,2,3,5,6,7,8,9};
        int result=obj.missingnum(arr);
        System.out.println(result);
    }
}
