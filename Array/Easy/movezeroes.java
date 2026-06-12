package Array.Easy;
class zero{
    public void move(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }
}

public class movezeroes {
    public static void main(String[] args) {
        zero obj=new zero();
        int[] arr={0,2,0,3,0,0,4,5};
        obj.move(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    
}
