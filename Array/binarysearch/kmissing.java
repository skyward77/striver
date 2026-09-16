package Array.binarysearch;
class soluti {
    public int findKthPositive(int[] arr, int k) {
        int left=0;
        int right=arr.length;
        while(left<right){
            int mid=left+(right-left)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return left+k;
        
    }
}

public class kmissing {
    

    public static void main(String[] args) {
        soluti obj=new soluti();
        int arr[]={2,3,4,7,11};
        int result=obj.findKthPositive(arr,5);
        System.out.println(result);
    }
    
}
