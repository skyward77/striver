package bitmanipulation;


class Solutionn {
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
public class divide {
    public static void main(String[] args) {
        Solutionn obj=new Solutionn();
        int dividend=10;
        int divisor=3;
        int result=obj.divide(dividend,divisor);
        System.out.println(result);
    }
}