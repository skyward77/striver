package Array.binarysearch;



import java.util.Scanner;



class bouque {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n){
            return -1;
        }
        int left=Integer.MAX_VALUE;
        int right=Integer.MIN_VALUE;
        for(int days:bloomDay){
             left=Math.min(left,days);
             right=Math.max(right,days);
        }
        while(left<right){
            int mid=left+(right-left)/2;
            if(canmake(bloomDay,m,k,mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
    public boolean canmake(int[] bloomsday,int m,int k,int mid){
        int bouquet=0;
        int flowers=0;
        for(int day:bloomsday){
            if(day<=mid){
                flowers++;
                if(flowers==k){
                    bouquet++;
                    flowers=0;
                    if(bouquet==m){
                        return true;
                    }
                }
            }
            else{
                flowers=0;
            }
            
        }
        return false;

    }
}
public class bouquet{
    public static void main(String[] args) {
        bouque obj=new bouque();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int result=obj.minDays(arr,1,2);
        System.out.println(result);
        sc.close();
    }
}