package Array.Hard;
class sol{
    public int maxProduct(int[] nums){
        int max=nums[0];
        int min=nums[0];
        int answer=nums[0];


        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            int oldmax=max;
            int oldmin=min;
            max=Math.max(num,Math.max(num*oldmax,num*oldmin));
            min=Math.min(num,Math.min(num*oldmax,num*oldmin));
            answer=Math.max(answer,max);
        }
        return answer;
    }
}

public class maxproduct {
    public static void main(String[] args) {
        int[] arr={1,-2,4,5,-4,-5};
        sol obj=new sol();
        int result=obj.maxProduct(arr);
        System.out.println(result);


    }
    
}
