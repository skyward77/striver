package bitmanipulation;
class Solutionp {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor=xor^num;
        }
        int bit=xor&-xor;
        int a=0;
        int b=0;
        for(int num:nums){
            if((num&bit)!=0){
                a=a^num;
            }
            else{
                b=b^num;
            }
        }
        return new int[]{a,b};
        
    }
}


public class singlenumber3 {
    public static void main(String[] args) {
        Solutionp obj=new Solutionp();
        int[] arr={1,2,1,3,2,5};
        int[] result=obj.singleNumber(arr);
        System.out.println(result[0]+" "+result[1]);

    }

    
}
