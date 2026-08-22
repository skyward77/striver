package Array.all;
import java.util.Scanner;


class binary{
    public int search(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
            }
            return -1;
        }
    }




public class binarysearch {
    public static void main(String[] args) {
        binary obj=new binary();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=obj.search(arr,7);
        System.out.println(result);

        
    }
    
}
