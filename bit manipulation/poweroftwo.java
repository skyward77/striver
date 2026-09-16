package bit.manipulation;
class solutuon{
    public boolean ispoweroftwo(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        return n==1;
    }
}
public class poweroftwo{
    
    public static void main(String[] args) {
        solutuon obj=new solutuon();
        boolean result=obj.ispoweroftwo(16);
        System.out.println(result);
    }
}