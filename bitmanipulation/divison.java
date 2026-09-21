package bitmanipulation;
class Solutioniy {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1){
            return Integer.MAX_VALUE;
        }
        boolean neg=(dividend<0)^(divisor<0);
        long a=Math.abs((long)dividend);
        long b=Math.abs((long)divisor);
        int ans=0;
        while(a>=b){
            long temp=b;
            long count=1;
            while(a>=temp+temp){
                temp+=temp;
                count+=count;
            }
            a-=temp;
            ans+=count;
        }
        return neg? -ans:ans;
        
    }
}

public class divison {
    public static void main(String[] args) {
        Solutioniy obj=new Solutioniy();
        int result=obj.divide(10,3);
        System.out.println(result);
    }
    
}
