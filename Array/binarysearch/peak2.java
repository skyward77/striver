    package Array.binarysearch;
    
    
    
    class Solutionii {
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=left+(right-left)/2;
            int maxrow=0;
            for(int i=1;i<m;i++){
                if(mat[i][mid]>mat[maxrow][mid]){
                    maxrow=i;
                }
            }
            if(mat[maxrow][mid]<mat[maxrow][mid+1]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        int maxrow=0;
        for(int i=1;i<m;i++){
            if(mat[i][left]>mat[maxrow][left]){

            
            maxrow=i;
            }
        }
        
    
    return new int[]{maxrow,left};
}
}
public class peak2 {
    public static void main(String[] args) {
        Solutionii obj=new Solutionii();
        int[][] arr={{1,4},{3,2}};
        int[] result=obj.findPeakGrid(arr);
        System.out.println(result[0]+" "+result[1]);
    }
}