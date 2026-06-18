package Array.Easy;
class color{
    public void sort(int[] nums){
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                //midd++ nhi krte kyuki jo naye element aye use check krna hota
                high--;
            }
        }
    }
}

public class sortcolor {
    public static void main(String[] args) {
        color obj=new color();
        int[] arr={1,2,0,2,1,0,0};
        obj.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
