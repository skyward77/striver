package Array.binarysearch;
class sqr{
    public int sqrt(int x){

    
        if(x<2){
            return x;
        }
        int left=1;
        int right=x/2;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid<x){
                ans=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;

    }
}

public class sqrt {
    public static void main(String[] args) {
        
    
    sqr obj =new sqr();
    int result=obj.sqrt(6);
    System.out.println(result);
    }
    
    
}
