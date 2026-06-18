package Array.Easy;

import java.util.Arrays;

class sum{
    public int[] twosum(int[] nums,int target){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};

    }
}

public class twosum {
    public static void main(String[] args) {
        sum obj=new sum();
        int[] arr={1,2,3,5,4,2,2,3};
        int[] result=obj.twosum(arr,5);
        System.out.println(Arrays.toString(result)); //array ko direct print ni kar skte
    }
}
