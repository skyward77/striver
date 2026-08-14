package Array.Hard;

import java.util.*;



class sums {
    public List<List<Integer>> FourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);


        for(int i=0;i<n-3;i++){


            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1&&nums[j]==nums[j-1]){
                    continue;
                }

                int left=j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];

                    if(sum==target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    

                    while(left<right&&nums[left]==nums[left+1]){
                        left++;
                    }

                    while(left<right&&nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                    }

                
                

                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
                }
            }
        }
            return ans;
        

       
        }
}


public class foursum{
    public static void main(String[] args) {
        sums obj=new sums();

        int[] arr={1,2,1,3,4};

        List<List<Integer>> result=obj.FourSum(arr,3);
        System.out.println(result);

    }
}
        
    
