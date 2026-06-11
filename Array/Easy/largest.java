package Array.Easy;

class solution{
    public int large(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;

    }
}
public class largest{
    public static void main(String[] args) {  
    solution obj =new solution();
    int[] num={2,3,5,6,7};
        int result=obj.large(num);
        System.out.println(result);
    }

}