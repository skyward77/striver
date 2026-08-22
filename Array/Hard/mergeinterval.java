package Array.Hard;

import java.util.*;

class merge {
    public int[][] interval(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=end){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                ans.add(new int[]{start,end});
                start=intervals[i][0];
                end=intervals[i][1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[ans.size()][]);
    }
}

public class mergeinterval {
    public static void main(String[] args) {
     merge obj=new merge();
     int[][] arr={{1,2},{4,5},{3,7},{4,9}};
     int[][] result=obj.interval(arr);
     for(int[] x:result){  
     System.out.println(Arrays.toString(x));
     }

    }
    
}
