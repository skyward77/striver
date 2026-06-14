package Array.Easy;
import java.util.ArrayList;
import java.util.Arrays;

class union{
    public ArrayList<Integer> unions(int[] a,int[] b){
        int i=0,j=0;
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> union=new ArrayList<>(); //will store final result
        while(i<a.length&&j<b.length){ //loops run until one array finishes
            while(i<a.length&&i>0&&a[i]==a[i-1]){
                i++; //skip duplicates
            }
            while(j<b.length&&j>0&&b[j]==b[j-1]){
                j++;

            }
            if(i>=a.length||j>=b.length) break; //safety check
        
        if(a[i]<b[j]){
            union.add(a[i]);
            i++;
        }
        else if(b[j]<a[i]){
            union.add(b[j]);
            j++;
        }
        else{
            union.add(a[i]);
            i++;               //both equal
            j++;
        }
    }
        
return union;

    }
}

public class unionofarray {
    public static void main(String[] args) {
        union obj=new union();
        int[] a={2,3,5,6,7,8,3,4,6,7,8};
        int[] b={2,3,1,0,7,5,4,5,6,9};
        ArrayList<Integer> result=obj.unions(a,b);
        System.out.println(result);
    }
    
}
