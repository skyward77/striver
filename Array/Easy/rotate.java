package Array.Easy;
class array{
    public void rotate(int[] nums,int k){

    
        int n=nums.length;
        if(n==0) return;
        k=k%n;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            int index=(i+k)%n;
            temp[index]=nums[i];

        }
    for(int i=0;i<n;i++){
        nums[i]=temp[i];
    }

    }
}

public class rotate {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,8};
        int k=3;
        array obj=new array();
        obj.rotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
