package Array.Medium;
import java.util.ArrayList;

class yaya{


 public ArrayList<Integer> findsubarray(int[] arr){
    ArrayList<Integer> result=new ArrayList<>();
    long maxsum=-1; //stores maximum sum found so far -1 isiliye rkhte kyuki agr sb neg hua to -1 solution
    long currsum=0; //store current sum while looping
    int start=0;
    int beststart=-1; //starting index of best subarray found so far
    int bestend=-1; // ending index of subarray found so far

    for(int i=0;i<arr.length;i++){
        if(arr[i]>=0){ //check the number bcz prob ask for sum of non neg number
        currsum+=arr[i]; //add element to currsum
        if(currsum>maxsum||currsum==maxsum&&(i-start>bestend-beststart)){
            maxsum=currsum;
            beststart=start;
            bestend=i;
        }
         }
         else{ //negative number
            currsum=0;
            start=i+1;

         }
    }
    if(maxsum==-1){
        result.add(-1);
        return result;
    }
    for(int i=beststart;i<=bestend;i++){
        result.add(arr[i]);
    }
    return result;
 }
}

public class extendedkadane {
    public static void main(String[] args) {
        yaya obj=new yaya();
        int[] nums={-1,2,3,4,-3,-5,1,2};
        ArrayList<Integer> result=obj.findsubarray(nums);
        System.out.println(result);
    }
    
}
