package bitmanipulation;
 
 
 
 class Solutionq {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int num:nums){
                if((num&(1<<i))!=0){
                    count++;
                    
                }
            }
                if(count%3!=0){
                    ans=ans|(1<<i);
                }
            

        }
        return ans;
        
    }
}
public class singlenumber2 {
    public static void main(String[] args) {
        Solutionq obj=new Solutionq();
        int[] arr={2,2,3,2};
        int result=obj.singleNumber(arr);
        System.out.println(result);

    }
    
}