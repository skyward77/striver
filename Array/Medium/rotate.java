package Array.Medium;

import java.util.Arrays;
class matrix{
    public void rotate(int[][] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                int temp=nums[i][left];
                nums[i][left]=nums[i][right];
                nums[i][right]=temp;
                right--;
                left++;
            }
        }
    }
}
public class rotate{
    public static void main(String[] args) {
        matrix obj=new matrix();
        int[][] arr={{1,2,3},{4,6,2},{3,4,4}};
        obj.rotate(arr);
        for(int[] num:arr){

        
        System.out.println(Arrays.toString(num));
        }
    }
}