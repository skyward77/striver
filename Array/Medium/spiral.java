package Array.Medium;
import java.util.List;
import java.util.ArrayList;

class matrics{
    public List<Integer> spirals(int[][] nums){
        List<Integer> result=new ArrayList<Integer>(); //list is an interface and arraylist is the implementation
        int top=0;//first row
        int bottom=nums.length-1;//last row
        int left=0;//first column
        int right=nums[0].length-1;//last column
        while(top<=bottom&&left<=right){
            for(int i=left;i<=right;i++){
                result.add(nums[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(nums[i][right]);
            }
              right--;
              if(top<=bottom){

              
              for(int i=right;i>=left;i--){
                result.add(nums[bottom][i]);
              }

              
              bottom--;
            }
              if(left<=right){

              
              for(int i=bottom;i>=top;i--){
                result.add(nums[i][left]);
              }
              left++;
              }
        }
        return result;
    }



    }


public class spiral {
    
    public static void main(String[] args) {
        matrics obj=new matrics();
        int[][] arr={{1,2,3},{4,5,6},{6,7,8}};
        List<Integer> result=obj.spirals(arr);
        System.out.println(result);
    }
}
