package bitmanipulation;
import java.util.*;
class Solutionc {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;
        for(int mask=0;mask<(1<<n);mask++){
            List<Integer> subset=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mask&(1<<i))!=0){
                    subset.add(nums[i]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}

public class subset {
    public static void main(String[] args) {
        Solutionc obj=new Solutionc();
        int[] arr={1,2,3};
        List<List<Integer>> result=obj.subsets(arr);
        for(List<Integer> subset:result){
            System.out.println(subset);
        }
    }
    
}
