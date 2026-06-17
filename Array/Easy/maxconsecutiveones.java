package Array.Easy;
class ones{
    public int maxones(int[] nums){
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxcount=Math.max(maxcount,count);
            }
            else{
                count=0;
            }
        }
            return maxcount;
            
        }
    }


public class maxconsecutiveones {
    public static void main(String[] args) {
        ones obj= new ones();
        int[] arr={1,1,2,3,4,1,3,4,1,1,1,1,4,1};
        int result=obj.maxones(arr);
        System.out.println(result);
    }
    
}
