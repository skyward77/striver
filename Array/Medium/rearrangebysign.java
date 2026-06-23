package Array.Medium;
class rearrange{
    public int[] sign(int[] nums){
        int n=nums.length;
        int[] result=new int[n];
        int posindex=0;
        int negindex=1;
        for(int num:nums){
            if(num>0){
                result[posindex]= num;
                posindex+=2;

            }
            else{
                result[negindex]=num;
                negindex+=2;
            }
        }
        return result;
    }
}

public class rearrangebysign {
    
    public static void main(String[] args) {
        rearrange obj=new rearrange();
        int[] arr={-1,2,3,-5,6};
        int[] result=obj.sign(arr);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
