package Array.Easy;
class linear{


public int search(int[] arr,int x){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            return i;
        }
    }
    return -1;

}
}



public class linearsearch {

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        linear obj=new linear();
        int result=obj.search(arr,4);
        System.out.println(result);
    }
    
}
