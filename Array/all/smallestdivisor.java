package Array.all;
class Solut {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int num:nums){
            right=Math.max(right,num);
        }

        while(left<right){
            int mid=left+(right-left)/2;
            int sum=0;


            for(int num:nums){
                sum+=(num+mid-1)/mid;
            }
            if(sum<=threshold){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
}

public class smallestdivisor {
    public static void main(String[] args) {
        Solut obj=new Solut();
        int arr[] ={3,4,2,4,3};
        int result=obj.smallestDivisor(arr,4);
        System.out.println(result);
    }
    
}
