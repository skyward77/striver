package Array.Medium; //boyer moore voting algo


//agr element n/2 se zyda ata hai mtlb sb element milkr bhi usko cancel nhi kr skte
class element{
    public int majority(int[] nums){
        int candidate=0;
        int count=0;                                    
        
                                                        
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }

}

public class mojorityelement {
    public static void main(String[] args) {
        element obj=new element();
        int[] arr={2,2,1,1,1,2,2};
        int result=obj.majority(arr);
        System.out.println(result);
    }
}
 /* [2,2,1,1,1,2,2]
 i=0 count=0 hai to nums[i]=2 
      candidate=2
      count=1 
i=1 count!=0 to same rhega  nums[i]=2
     candidate=2
     nums[i]=candidate to count=2
i=2 count!=0 to candidate same rhega
    nums[i]=1
    candidate=2
    same ni h to dono to count=1
i=3 count!=0 to candidate=2
    nums[i]=1 not same to 
    count=0
i=4 count==0 to candidate=1
   nums[i]=1
   count=1
i=5 count!=0 to candidate=1
    nums[i]=2
    count=0
i=6 count==0 candidate=2
    nums[i]=2
    count=1
i=7 count!=0 same rhega candidate=2
    nums[i]=2
    count=2
     */