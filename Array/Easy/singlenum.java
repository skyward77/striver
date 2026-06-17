package Array.Easy;

//xor operator a^a=0 and a^0=a
//duplicates cancel each other


class single{
    public int singlenumber(int[] nums){
        int ans=0;
        for(int num:nums){
            ans=num^ans;
        }
        return ans;
    }
}

public class singlenum {
    public static void main(String[] args) {
        single obj=new single();
        int[] arr={1,2,1,2,5};
        int result=obj.singlenumber(arr);
        System.out.println(result);

    }
    
}
