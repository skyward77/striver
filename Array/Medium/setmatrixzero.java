package Array.Medium;
import java.util.Arrays;
class array{

    public void setZeroes(int[][] matrix) {
        int m=matrix.length; //rows
        int n=matrix[0].length; //columns
        boolean firstcolzero=false;
        boolean firstrowzero=false;
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstrowzero=true;
                break;
            }
            
        }
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstcolzero=true;
                break;
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0||matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstrowzero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }
        if(firstcolzero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        
    }
}

public class setmatrixzero {
    public static void main(String[] args) {
        array obj=new array();
        int[][] arr={{2,0,3},{2,1,1},{3,0,1}};
        obj.setZeroes(arr);
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
    
}
