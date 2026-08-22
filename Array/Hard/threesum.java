package Array.Hard;


import java.util.*;
class sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k&&nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k&&nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;

                }else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return result;
        
    }
}

public class threesum {

    public static void main(String[] args) {
        sum obj=new sum();
        int[] arr={3,3,4,2,42};
        List<List<Integer>> result=obj.threeSum(arr);
        System.out.println(result);
    }
    
    
}
