package bitmanipulation;
class Solutions{
    public static int findXOR(int l, int r) {
        // code here
        return xor(r)^xor(l-1);
    }
    private static int xor(int n){
        if(n%4==0){
            return n;
        }if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;
    }
}

public class xorinrange {
    public static void main(String[] args) {
        int l=3;
        int r=9;
        int result=Solutions.findXOR(l,r);
        System.out.println(result);
    }
    
}
