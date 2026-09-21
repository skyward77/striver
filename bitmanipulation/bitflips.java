package bitmanipulation;
class Solutioniyy {
    public int minBitFlips(int start, int goal) {
        
        int x=start^goal;
        int count=0;
        while(x>0){
            count+=x&1;
            x=x>>1;
        }
        return count;
    }
}

public class bitflips {
    public static void main(String[] args) {
        Solutioniyy obj=new Solutioniyy();
        int result=obj.minBitFlips(10,7);
        System.out.println(result);
    }
    
}
